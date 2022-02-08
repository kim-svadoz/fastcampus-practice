import java.util.Arrays;
import java.util.List;
import logic.BubbleSort;
import logic.JavaSort;
import service.StringSortService;

public class Main {

    public static void main(String[] args) {
        StringSortService service = new StringSortService(new BubbleSort<>());
        List<String> list = service.doSort(Arrays.asList(args));

        System.out.println("Hello World !- result: " + list.toString());
    }
}
