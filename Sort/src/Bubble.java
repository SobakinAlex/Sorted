public class Bubble {
    private int[] a;
    public Bubble(int[] a) {
        this.a = a;
    }

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
}
