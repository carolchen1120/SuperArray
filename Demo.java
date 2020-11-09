public class Demo{

  public static void removeDuplicates(SuperArray s){
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

  public static void main(String[]args){
    SuperArray words = new SuperArray();
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
