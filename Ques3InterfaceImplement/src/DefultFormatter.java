public class DefultFormatter implements NumberFormatter{

    @Override
    public String format(int n) {
        return Integer.toString(n);
    }
}
