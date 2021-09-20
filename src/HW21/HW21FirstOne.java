package HW21;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class HW21FirstOne {
    public boolean isValid(String s) {
        Map<Character, Character> someMap = new HashMap<>();
        someMap.put(')', '(');
        someMap.put('}', '{');
        someMap.put(']', '[');


        Stack<Character> someStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char someChar = s.charAt(i);

            if (!someMap.containsKey(someChar)) {
                someStack.push(someChar);
            } else {
                char head = someStack.isEmpty() ? '$' : someStack.pop();
                if (head != someMap.get(someChar)) {
                    return false;
                }
            }
        }
        return someStack.isEmpty();
    }
}
