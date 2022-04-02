public class AccountingFormatter implements NumberFormatter{

    @Override
    public String format(int n) {
        if(n<0){
            return "(" + Integer.toString(-n) + ")";
        }
        else {
            return Integer.toString(n);
        }

    }
}
