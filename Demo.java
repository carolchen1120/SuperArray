public class Demo{

  public static void removeDuplicates(SuperArray s) {
    String current = "";
    String next = "";
    for (int i = 0; i < s.size-1; i++) {
      current = s.data[i];
      for (int j = i + 1; j < s.size; j++) {
        next = s.data[j];
        if (current.equals(next)) {
          s.remove(j);
        }
      }
    }
  }


  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    String[] answer = new String[a.size];
    String aString = "";
    String bString = "";
    int count = 0;
    removeDuplicates(a);
    removeDuplicates(b);
    for (int i = 0; i < a.size; i++) {
      aString = a.data[i];
      for (int j = 0; j < b.size; j++) {
        bString = b.data[j];
        if (aString.equals(bString)) {
          answer[count] = aString;
          count++;
        }
      }
    }
    return answer;
  }


  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray newArray = new SuperArray(a.size + b.size);
    int length = 0;
    int large = 0;

    if (a.size > b.size) {
      length = b.size;
      large = a.size;
    } else {
      length = a.size;
      large = b.size;
    }

    for (int i = 0; i < length * 2; i++) {
      newArray[i * 2] = a.data[i];
      newArray[i * 2 + 1] = b.data[i];
    }

    for (int j = 0; j < large - length; j++) {
      if (large = a.size) {
        newArray[length*2 + j + 1] = a.data[length + j + 1];
      } else {
        newArray[length*2 + j + 1] = b.data[length + j + 1];
      }
    }

    return newArray;
  }


  public static void main(String[]args) {
    SuperArray words = new SuperArray(10);
    //grouped to save vertical space
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("kani");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }
}
