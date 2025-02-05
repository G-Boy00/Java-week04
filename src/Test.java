public class Test {
  public static void main(String[] args) {
    ArrayADT arr = new ArrayADT(new int[5]);
    arr.insert(2, 8);
    arr.insert(2, 9);
    arr.insert(2, 10);
    arr.insert(2, 11);
    arr.insert(1, 12);
    arr.insert(0, 13);
    arr.insert(0, 14);
    arr.delete(2);
    arr.insert(1, 12);
    arr.delete(0);
    arr.display();
  }
}
