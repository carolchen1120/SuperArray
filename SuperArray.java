public class SuperArray {
  private String [] data;
  private int size; //The current size

  // Creates an empty superArray.
  // Empty does NOT mean an empty capacity, it means no elements are stored in it (the size is 0).
  // A good starting capacity is 10.
  // Throws:
  // IllegalArgumentException - if the specified initial capacity is negative
  public SuperArray() {
    this.data = new String[10];
    this.size = 0;
  }

  public SuperArray(int length) {
    if (length < 0) {
      throw new IllegalArgumentException("Initial capactiy " + length + " cannot be negative.");
    }
    this.data = new String[length];
    this.size = 0;
  }


  // Returns the number of elements in this list.
  public int size() {
    return this.size;
  }


  // Appends the specified element to the end of this list
  // -Appends the specified element to the end of this list.
  // -When the capacity is full, resize before adding
  public boolean add(String element) {
    if (this.data.length == this.size) {
      this.resize();
    }

    this.data[this.size] = element;
    this.size++;
    return true;
  }


  // Returns the element at the specified position in this list. [For Now Assume the index is 0 to size-1]
  // Throws:
  // IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
  public String get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("The index " + index + " is out of range.");
    }
    return this.data[index];
  }


  // Replaces the element at the specified position in this list with the specified element.
  // Return the value you replaced.
  // [Assume the index is 0 to size-1] note: This is not to add new values, it is only to replace old ones.
  // Throws:
  // IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
  public String set(int index, String element) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("The index " + index + " is out of range.");
    }
    String value = this.data[index];
    this.data[index] = element;
    return value;
  }


  // -Increase the capacity by :
  // creating a larger array
  // copy the values from the original array to the new one.
  // assign the new one to the instance variable.
  private void resize() {
    String[] newSuper = new String[this.size + 1];
    for (int i = 0; i < this.size; i++) {
      newSuper[i] = data[i];
    }
    this.data = newSuper;
  }


  // Returns true if this list contains no elements.
  public boolean isEmpty() {
    return (this.size == 0);
  }


  // Format "[e0, e1, e2,..., eN]" where the size is N+1
  // This only displays the elements that were added, not the empty spots
  public String toString() {
    String answer = "[";
    for (int i = 0; i < this.size-1; i++) {
      if (!this.data[i].equals("")) {
        answer += this.data[i] + ", ";
      }
    }
    return answer + this.data[this.size-1] + "]";
  }


  // Returns true if this list contains the specified element.
  public boolean contains(String s) {
    for (int i = 0; i < this.size; i++) {
      if (this.data[i] == s) {
        return true;
      }
    }
    return false;
  }


  // Reset the SuperArray to be size 0 again. There should be no references to any old values in the array.
  public void clear() {
    this.data = new String[10];
    this.size = 0;
  }


  // Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right.
  // Throws:
  // IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
  public void add(int index, String element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("The index " + index + " is out of range.");
    }

    String[] newArray = new String[this.size+1];

    if (index == this.size) {
      for (int i = 0; i < this.size; i++) {
        newArray[i] = this.data[i];
      }
      newArray[this.size] = element;
    } else {
      for (int i = 0; i < index; i++) {
        newArray[i] = this.data[i];
      }
      newArray[index] = element;
      for (int j = index+1; j < this.size+1; j++) {
        newArray[j] = this.data[j-1];
      }
    }

    this.data = newArray;
    this.size++;
  }


  // Removes the element at the specified position in this list.  Shifts any subsequent elements to the left. The returned value is the element you remove.
  // Throws:
  // IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
  public String remove(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("The index " + index + " is out of range.");
    }
    String answer = this.data[index];
    String[] newArray = new String[this.size - 1];
    for (int i = 0; i < this.size; i++) {
      if (i < index) {
          newArray[i] = this.data[i];
      } else if (i > index) {
          newArray[i-1] = this.data[i];
      } else {
          continue;
      }
    }
    this.data = newArray;
    this.size--;
    return answer;
  }


  // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
  public int indexOf(String s) {
    for (int i = 0; i < this.size; i++) {
      if (this.data[i] == s) {
        return i;
      }
    }
    return -1;
  }


  // Returns an array containing all of the elements in this list in proper sequence (from first to last element).
  // The returned array will be "safe" in that no references to it are maintained by this list. (In other words, this method must allocate a new array).
  public String[] toArray() {
    String[] newArray = new String[this.size];
    for (int i  = 0; i < this.size; i++) {
      newArray[i] = this.data[i];
    }
    return newArray;
  }


  public int lastIndexOf(String value) {
    for (int i = this.size - 1; i >= 0; i--) {
      if (this.data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }


  public boolean equals(SuperArray other) {
    boolean same = true;
    for (int i = 0; i < this.size; i++) {
      if (!this.get(i).equals(other.get(i))) {
        same = false;
      }
    }
    return same;
  }



}
