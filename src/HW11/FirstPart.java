package HW11;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;

public class FirstPart {

    static Random random = new Random();
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 20; i ++)
        list.add(random.nextInt(100));
        list = list.stream().map(s -> s*s ).collect(Collectors.toList());
        OptionalDouble result = list.stream().mapToDouble(s -> s).average();
        if (result.isPresent())
        System.out.println(result.getAsDouble());
    }


}
