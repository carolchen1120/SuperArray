public class TesterSA {
  public static void main(String[]args) {
    SuperArray mySuper = new SuperArray();

    System.out.println(mySuper.add("hi"));
    System.out.println(mySuper.add("bye"));
    System.out.println(mySuper.add("meow"));

    System.out.println(mySuper.size());

    System.out.println(mySuper.get(0));
    System.out.println(mySuper.get(1));
    System.out.println(mySuper.get(2));
  }
}
