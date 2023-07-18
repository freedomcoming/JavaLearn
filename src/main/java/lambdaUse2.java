import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambdaUse2 {
    public static void main(String[] args) {
        // forEach
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(System.out::println);

// 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
//         features.forEach(System.out::println);
        System.out.println("----------");

        List<String> list2 = features.stream().filter(f -> f.length()> 10).collect(Collectors.toList());
        list2.forEach(System.out::println);
        System.out.println("----------parallel");
        List<String> list3 = features.stream().parallel().filter(f -> f.length()> 10).collect(Collectors.toList());
        list3.forEach(System.out::println);

    }
}