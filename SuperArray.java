public class SuperArray {
  private String [] data;
  private int size; //The current size

  // Creates an empty superArray.
  // Empty does NOT mean an empty capacity, it means no elements are stored in it (the size is 0).
  // A good starting capacity is 10.
  public SuperArray() {
    this.data = new String[10];
    this.size = 0;
  }

  // Returns the number of elements in this list.
  public int size() {
    return this.size;
  }

  // Appends the specified element to the end of this list
  public boolean add(String element) {
    this.data[this.size] = element;
    this.size++;
    return true;
  }

}
