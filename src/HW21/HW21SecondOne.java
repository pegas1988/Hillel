package HW21;

import java.util.ArrayList;

public class HW21SecondOne {

    public int firstUniqChar(String s) {

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        char temp;
        char previous = '&';

        for (int i = 0; i < s.length(); i++) {
            temp = list.get(0);
            list.remove(0);
            if (!list.contains(temp) && temp != previous)
                return i;
            previous = temp;
        }
        return -1;
    }
}
