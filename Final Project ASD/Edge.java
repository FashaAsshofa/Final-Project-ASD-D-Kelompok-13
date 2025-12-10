public class Edge {
    String destination;
    int weight;

    public Edge(String destination, int weight) {
        this.destination = destination.toLowerCase(); // lowercase
        this.weight = weight;
    }
}
