public class mainTest {
  public static void main(String[] args) {
    M_ArrayList<Integer> l = new M_ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    l.add(5);
    l.add(6);
    l.add(7);
    l.add(8);
    System.out.println(l.getSize());
    System.out.println(l.get(5));
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    l.add(5);
    l.add(6);
    l.add(7);
    l.add(8);
    System.out.println(l.getSize());
    l.remove(2);
    l.remove(2);
    l.remove(2);
    l.remove(2);
    l.remove(2);
    l.remove(2);
    System.out.println(l.getSize());
  }
}
