public class Main {
    public static void main(String[] args) {


        ComboLock comboLock = new ComboLock(5,10,15);

        comboLock.turnRight(5);
        comboLock.turnLeft(35);
        comboLock.turnRight(5);

        if(comboLock.open()){
            System.out.println("Opened");
        }
        else{
            System.out.println("Not Opened");
        }

    }
}
