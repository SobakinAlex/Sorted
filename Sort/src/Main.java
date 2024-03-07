import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int[] a = new int[l];

    public int[] bubbleSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int ai = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = ai;
                }
            }
        }
        return a;
    }

    public int[] insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int currElem = a[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && a[prevKey] > currElem) {
                a[prevKey + 1] = a[prevKey];
                prevKey--;
            }
            a[prevKey + 1] = currElem;
        }
        return a;
    }

    public int[] quickSort(int[] a, int low, int high) {
        if (a.length == 0)
            return a;
        if (low >= high)
            return a;
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
        return a;
    }

    public int[] create(int l, int[] a) {
        int i;
        for (i = 0, i < l, i++) {
            a[i] = (int) Math.random();
        }
    }
    System.out.println()

}