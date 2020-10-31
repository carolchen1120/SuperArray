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

    mySuper.add("C");
    mySuper.add("A");
    mySuper.add("R");
    mySuper.add("O");
    mySuper.add("L");
    mySuper.add("C");
    mySuper.add("H");
    mySuper.add("E");
    mySuper.add("N");
    mySuper.add("hi");

    mySuper.add("bye");
    System.out.println(mySuper.get(10));
  }
}
