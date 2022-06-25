public class heapSort {
    public static void main(String[] args) {
        int[] arr = {10, 3, 69, 6, 0, 12, 3, 53, 42, -48};

        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int arLen) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;
        if (left < arLen && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < arLen && arr[right] > arr[largest]) {
            largest = right;
        }
        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, arLen);
        }
    }
}
