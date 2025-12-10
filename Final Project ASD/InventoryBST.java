import java.util.*;

public class InventoryBST {
    NodeBST root;
    private int autoID = 100; // mulai dari 100

    public int generateID() {
        return autoID++;
    }

    void insert(Product p) {
        root = insertRec(root, p);
    }

    private NodeBST insertRec(NodeBST root, Product p) {
        if (root == null) return new NodeBST(p);

        if (p.id < root.data.id)
            root.left = insertRec(root.left, p);
        else
            root.right = insertRec(root.right, p);

        return root;
    }

    Product search(int id) {
        return searchRec(root, id);
    }

    private Product searchRec(NodeBST root, int id) {
        if (root == null) return null;
        if (root.data.id == id) return root.data;

        return id < root.data.id ?
                searchRec(root.left, id) :
                searchRec(root.right, id);
    }

    // ambil seluruh produk
    void getAll(NodeBST node, ArrayList<Product> list) {
        if (node != null) {
            getAll(node.left, list);
            list.add(node.data);
            getAll(node.right, list);
        }
    }

    // print sort by ID
    void printInOrder() {
        printInOrderRec(root);
    }

    void printInOrderRec(NodeBST node) {
        if (node != null) {
            printInOrderRec(node.left);
            System.out.println(node.data);
            printInOrderRec(node.right);
        }
    }
}
