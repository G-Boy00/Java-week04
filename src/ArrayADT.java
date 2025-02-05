class ArrayADT {
    private int[] arr;
    private int size;
    private int capacity;

    public ArrayADT(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public void insert(int index, int value) {
        if (size == capacity) {
            System.out.println("Array is full. Cannot insert.");
            return;
        }
        if (index < 0  || index > size) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayADT array = new ArrayADT(10);
        array.insert(0, 1000);
        array.insert(1, 1500);
        array.insert(2, 2000);
        array.display(); 
        
        array.delete(1);
        array.display(); 
        
        System.out.println(array.search(15)); 
        System.out.println(array.search(10)); 
    }
        
}
