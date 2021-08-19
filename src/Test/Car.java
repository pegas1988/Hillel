package Test;

import java.util.ArrayList;
import java.util.List;

class Base {
    public static List<String> list;
    public static void main(String[] args) {
        First first = new First();
        first.main();

        Second second = new Second();
        Some oneMore = second;
    }

}