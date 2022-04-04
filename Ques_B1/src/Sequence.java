import java.util.ArrayList;

public class Sequence {
    private ArrayList<Integer> values;
    public Sequence() {
        values = new ArrayList<Integer>();
    }
    public void add(int n) {
        values.add(n);
    }
    public String toString() {
        return values.toString();
    }
    public Sequence append(Sequence other){
        for (int i=0; i<other.values.size(); i++){
            this.values.add(other.values.get(i));
        }
        other.values = this.values;

        return other;
    }

}
