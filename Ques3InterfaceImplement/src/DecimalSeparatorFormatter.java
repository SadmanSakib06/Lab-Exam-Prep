import java.util.ArrayList;

public class DecimalSeparatorFormatter implements NumberFormatter{

    @Override
    public String format(int n) {
        String number = Integer.toString(n);
        String formattedNumber = "";
        int size = number.length();

        formattedNumber = formattedNumber + number.substring(0,(size%3)) + ",";

        int j = 1;

        for(int i = size%3; i<size;i++,j++){
            formattedNumber = formattedNumber + number.charAt(i);
            if(j%3==0 && j!=size-(size%3)) {
                formattedNumber = formattedNumber + ",";
            }
        }
        return formattedNumber;
    }
}
