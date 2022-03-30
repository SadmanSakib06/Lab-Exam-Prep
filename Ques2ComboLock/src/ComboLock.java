public class ComboLock {
    int secret1, secret2, secret3;
    int dial = 0;
    int lockNo = 1;
    boolean lock1 = false, lock2 = false, lock3 = false;
    public ComboLock(int secret1, int secret2, int secret3){
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }
    public void reset(){
        dial = 0;
    }

    public void turnLeft(int ticks){
        dial = dial - ticks;
        if(dial<0){
            dial = (dial + 40) % 40;
        }
        if(dial == secret2 && lockNo == 2){
            lock2 = true;
            lockNo = lockNo + 1;
        }

    }

    public void turnRight(int ticks){
        dial = dial + ticks;
        dial = dial % 40;
        if(dial == secret1 && lockNo==1){
            lock1 = true;
            lockNo = lockNo + 1;
        }
        else if(dial == secret3 && lockNo == 3){
            lock3 = true;
        }

    }
    public boolean open(){
        if(lock1 && lock2 && lock3){
            return true;
        }
        return false;
    }
}
