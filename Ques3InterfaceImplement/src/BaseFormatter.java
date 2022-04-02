import java.util.ArrayList;

public class BaseFormatter implements NumberFormatter{
    int base;
    public BaseFormatter(int n){
        this.base = n;
    }

    @Override
    public String format(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        String formatterString ="";

        while(n>0){
            digits.add(n % base);
            n = n / base;
        }
        for(int i = digits.size()-1;i>=0;i--){
            formatterString = formatterString + digits.get(i);
        }
        return formatterString;
    }
}
