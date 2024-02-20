import java.util.ArrayList;
import java.util.Collections;

public class Dsa {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(3);
        arr.add(44);

        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
