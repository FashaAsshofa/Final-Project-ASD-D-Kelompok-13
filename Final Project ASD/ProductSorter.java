import java.util.*;

public class ProductSorter {

    public void mergeSort(ArrayList<Product> list, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);

            merge(list, left, mid, right);
        }
    }

    private void merge(ArrayList<Product> list, int left, int mid, int right) {
        ArrayList<Product> L = new ArrayList<>();
        ArrayList<Product> R = new ArrayList<>();

        for (int i = left; i <= mid; i++) L.add(list.get(i));
        for (int i = mid + 1; i <= right; i++) R.add(list.get(i));

        int i = 0, j = 0, k = left;

        while (i < L.size() && j < R.size()) {
            if (L.get(i).price <= R.get(j).price)
                list.set(k++, L.get(i++));
            else
                list.set(k++, R.get(j++));
        }

        while (i < L.size()) list.set(k++, L.get(i++));
        while (j < R.size()) list.set(k++, R.get(j++));
    }
}
