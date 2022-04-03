public class Find {
    public static void main(String[] args) {
        String hasToFind = "Buff";
        String fileName1 = "report.txt";
        String fileName2 = "address.txt";
        String fileName3 = "Homework.java";

        MyThread myThread1 = new MyThread(fileName1,hasToFind);
        MyThread myThread2 = new MyThread(fileName2,hasToFind);
        MyThread myThread3 = new MyThread(fileName3,hasToFind);

        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}
