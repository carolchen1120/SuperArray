public class TesterSA {
  public static void main(String[]args) {
    SuperArray mySuper = new SuperArray();

    // System.out.println(mySuper.add("hi"));
    // System.out.println(mySuper.add("bye"));
    // System.out.println(mySuper.add("meow"));
    //
    // System.out.println(mySuper.size());
    //
    // System.out.println(mySuper.get(0));
    // System.out.println(mySuper.get(1));
    // System.out.println(mySuper.get(2));
    //
    // System.out.println(mySuper.set(0, "roar"));
    // System.out.println(mySuper.set(1, "chirp"));
    //
    // System.out.println(mySuper.get(0));
    // System.out.println(mySuper.get(1));

    // mySuper.add("C");
    // mySuper.add("A");
    // mySuper.add("R");
    // mySuper.add("O");
    // mySuper.add("L");
    // mySuper.add("C");
    // mySuper.add("H");
    // mySuper.add("E");
    // mySuper.add("N");
    // mySuper.add("hi");
    //
    // mySuper.add("bye");
    // System.out.println(mySuper.get(10));


    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("toro");
    words.add("tamago");
    for (int i = 0; i < words.size(); i++) {
      System.out.println(words.get(i));
    }

    System.out.println(words.toString());

    // SuperArray empty = new SuperArray();
    // System.out.println(empty.isEmpty());
    // System.out.println(words.isEmpty());
    //
    // System.out.println(words.contains("uni"));
    // System.out.println(words.contains("meow"));
    //
    // System.out.println(words.remove(2));
    // System.out.println(words.toString());

    System.out.println(words.remove(0));
    System.out.println(words.toString());

  }
}
