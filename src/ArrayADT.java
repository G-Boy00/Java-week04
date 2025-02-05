public class ArrayADT {
    int[] arr;
    boolean[] initialized;
    int size = 0;

    public ArrayADT(int[] arr) {
        this.arr = arr;
        this.initialized = new boolean[arr.length];
    }

    public void insert(int index, int value) {
        if (arr.length == size) {
            return;
        }
        int pos = index;
        while (pos < arr.length && initialized[pos]) {
            pos++;
        }
        if (pos >= arr.length) {
            pos = arr.length - 1;
        }
        int temp = arr[index];
        arr[index] = value;
        initialized[index] = true;
        for (int i = index + 1; i <= pos; i++) {
            int temp1 = arr[i];
            arr[i] = temp;
            temp = temp1;

            initialized[i] = true;
        }
    }

    public void delete(int index) {
        arr[index] = 0;
        initialized[index] = false;
    }

    public int search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {
            if (initialized[i]) {
                System.out.println("Position " + i + ": " + arr[i]);
            }
        }
    }
}
