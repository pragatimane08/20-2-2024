import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
public class Functional_prg {
    public static void main(String[] args) {
        List<Integer> li =  Arrays.asList(1,2,3,4,5);
        li.forEach(System.out::println);

        int sum = li.stream().map(x ->x*x).reduce(0, Integer::sum);
        System.out.println("list of squares :"+sum);

        List<Integer> eveno = li.stream().filter(x ->x%2 ==0).collect(Collectors.toList());
        System.out.println("Even Number : "+eveno);

       }
}
