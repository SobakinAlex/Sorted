public class Quick {
    public static void quickSort(int[] a, int low, int high) {
        if (a.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int op = a[middle];
        int i = low, j = high;
        while (i <= j) {
            while (a[i] < op) {
                i++;
            }
            while (a[j] > op) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(a, low, j);
        if (high > i)
            quickSort(a, i, high);
    }
}
