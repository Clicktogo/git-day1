import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int number = 7;
        number = increase(number);
        print(number);
    }

    static int increase(int number){
        return number + 3;
    }

    static void print(int number){
        System.out.println(number);
    }

    List<String> list = List.of("a", "b", "c");
    List<String> listSorted = list.stream().sorted().collect(Collectors.toList());
}
