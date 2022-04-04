public class Main {
    public static void main(String[] args) {
        Sequence a = new Sequence();
        Sequence b = new Sequence();

        a.add(1);
        a.add(3);
        a.add(5);
        //adding value in b object
        b.add(10);
        b.add(20);
        b.add(30);

        System.out.println(a.append(b).toString());
    }
}
