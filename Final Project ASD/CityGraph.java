import java.util.*;

public class CityGraph {

    Map<String, List<Edge>> adj = new HashMap<>();

    // tambah kota otomatis
    void addCity(String c) {
        adj.putIfAbsent(c.toLowerCase(), new ArrayList<>());
    }

    void addRoad(String a, String b, int km) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        addCity(a);
        addCity(b);

        adj.get(a).add(new Edge(b, km));
        adj.get(b).add(new Edge(a, km));
    }

    void findShortestPath(String start, String end) {
        start = start.toLowerCase();
        end = end.toLowerCase();

        if (!adj.containsKey(start) || !adj.containsKey(end)) {
            System.out.println("Nama kota tidak ditemukan!");
            return;
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        Map<String, Integer> dist = new HashMap<>();
        Map<String, String> prev = new HashMap<>();
        Set<String> visited = new HashSet<>();

        for (String city : adj.keySet())
            dist.put(city, Integer.MAX_VALUE);

        dist.put(start, 0);
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            String current = pq.poll().destination;

            if (visited.contains(current)) continue;
            visited.add(current);

            if (current.equals(end)) break;

            for (Edge e : adj.get(current)) {
                if (!visited.contains(e.destination)) {
                    int newDist = dist.get(current) + e.weight;

                    if (newDist < dist.get(e.destination)) {
                        dist.put(e.destination, newDist);
                        prev.put(e.destination, current);
                        pq.add(new Edge(e.destination, newDist));
                    }
                }
            }
        }

        if (dist.get(end) == Integer.MAX_VALUE) {
            System.out.println("Tidak ada rute ditemukan!");
            return;
        }

        System.out.println("Jarak terpendek: " + dist.get(end) + " KM");
        System.out.print("Rute: ");
        printPath(prev, end);
        System.out.println();
    }

    void printPath(Map<String, String> prev, String city) {
        if (prev.get(city) != null) {
            printPath(prev, prev.get(city));
            System.out.print(" -> ");
        }
        System.out.print(city);
    }
}
