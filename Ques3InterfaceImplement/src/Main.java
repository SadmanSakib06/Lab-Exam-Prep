public class Main {
    public static void main(String[] args) {
        DefultFormatter defultFormatter = new DefultFormatter();
        DecimalSeparatorFormatter decimalSeparatorFormatter = new DecimalSeparatorFormatter();
        AccountingFormatter accountingFormatter = new AccountingFormatter();


        System.out.println(defultFormatter.format(100));
        System.out.println(decimalSeparatorFormatter.format(12345678));
        System.out.println(accountingFormatter.format(-50));

        BaseFormatter baseFormatter = new BaseFormatter(2);
        System.out.println(baseFormatter.format(16));

    }
}
