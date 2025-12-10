import java.util.*;

public class FinalProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryBST inventory = new InventoryBST();
        ProductSorter sorter = new ProductSorter();
        CityGraph graph = new CityGraph();

        // ==== 25 KOTA DI PULAU JAWA ====
        graph.addRoad("Jakarta", "Bekasi", 25);
        graph.addRoad("Bekasi", "Karawang", 35);
        graph.addRoad("Karawang", "Purwakarta", 40);
        graph.addRoad("Purwakarta", "Bandung", 60);
        graph.addRoad("Bandung", "Garut", 50);
        graph.addRoad("Garut", "Tasikmalaya", 40);
        graph.addRoad("Tasikmalaya", "Ciamis", 30);
        graph.addRoad("Ciamis", "Banjar", 25);
        graph.addRoad("Banjar", "Cilacap", 70);
        graph.addRoad("Cilacap", "Purwokerto", 60);
        graph.addRoad("Purwokerto", "Tegal", 90);
        graph.addRoad("Tegal", "Pekalongan", 40);
        graph.addRoad("Pekalongan", "Kendal", 30);
        graph.addRoad("Kendal", "Semarang", 25);
        graph.addRoad("Semarang", "Salatiga", 45);
        graph.addRoad("Salatiga", "Boyolali", 25);
        graph.addRoad("Boyolali", "Solo", 30);
        graph.addRoad("Solo", "Sukoharjo", 15);
        graph.addRoad("Sukoharjo", "Wonogiri", 40);
        graph.addRoad("Solo", "Sragen", 35);
        graph.addRoad("Sragen", "Ngawi", 40);
        graph.addRoad("Ngawi", "Madiun", 30);
        graph.addRoad("Madiun", "Nganjuk", 50);
        graph.addRoad("Nganjuk", "Kediri", 40);
        graph.addRoad("Kediri", "Blitar", 30);

        // ==== DATA DUMMY PRODUK ====
        inventory.insert(new Product(inventory.generateID(), "Laptop Asus", 15000000));
        inventory.insert(new Product(inventory.generateID(), "Mouse Logi", 250000));
        inventory.insert(new Product(inventory.generateID(), "Keyboard Razer", 1750000));
        inventory.insert(new Product(inventory.generateID(), "Monitor LG", 2000000));
        inventory.insert(new Product(inventory.generateID(), "RAM 16GB", 900000));
        inventory.insert(new Product(inventory.generateID(), "SSD 512GB", 1100000));
        inventory.insert(new Product(inventory.generateID(), "Headset JBL", 700000));
        inventory.insert(new Product(inventory.generateID(), "Flashdisk 32GB", 75000));
        inventory.insert(new Product(inventory.generateID(), "Printer Epson", 1900000));
        inventory.insert(new Product(inventory.generateID(), "Webcam Logitech", 800000));

        int choice;
        do {
            System.out.println("\n=== SISTEM LOGISTIK & INVENTORY ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Cari Barang berdasarkan ID");
            System.out.println("3. Tampilkan Barang (urut ID)");
            System.out.println("4. Tampilkan Barang Termurah (Merge Sort)");
            System.out.println("5. Cek Rute Pengiriman");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // Tambah barang
                    sc.nextLine();
                    System.out.print("Nama barang: ");
                    String name = sc.nextLine();
                    System.out.print("Harga: ");
                    double price = sc.nextDouble();

                    if (price < 0) {
                        System.out.println("ERROR: Harga tidak boleh negatif!");
                        break;
                    }

                    int id = inventory.generateID();
                    inventory.insert(new Product(id, name, price));
                    System.out.println("Produk berhasil ditambah! ID = " + id);
                    break;

                case 2:
                    System.out.print("Masukkan ID: ");
                    Product result = inventory.search(sc.nextInt());
                    if (result != null) System.out.println(result);
                    else System.out.println("Barang tidak ditemukan.");
                    break;

                case 3:
                    System.out.println("\n--- ProduK Urut Berdasar ID (BST In-order) ---");
                    inventory.printInOrder();
                    break;

                case 4:
                    ArrayList<Product> list = new ArrayList<>();
                    inventory.getAll(inventory.root, list);
                    sorter.mergeSort(list, 0, list.size() - 1);
                    System.out.println("\n--- Produk Urut Termurah ---");
                    list.forEach(System.out::println);
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Kota Asal: ");
                    String from = sc.nextLine();
                    System.out.print("Kota Tujuan: ");
                    String to = sc.nextLine();
                    graph.findShortestPath(from, to);
                    break;
            }

        } while (choice != 0);

        System.out.println("Program selesai.");
        sc.close();
    }
}
