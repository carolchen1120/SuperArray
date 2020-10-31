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

  // Returns the element at the specified position in this list. [For Now Assume the index is 0 to size-1]
  public String get(int index) {
    return this.data[index];
  }

  // Replaces the element at the specified position in this list with the specified element.
  // Return the value you replaced.
  // [Assume the index is 0 to size-1] note: This is not to add new values, it is only to replace old ones.
  public String set(int index, String element) {
    String value = this.data[index];
    this.data[index] = element;
    return value;
  }


}
