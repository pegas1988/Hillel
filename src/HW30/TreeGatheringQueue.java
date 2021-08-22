package HW30;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeGatheringQueue {
    ArrayList gatherValues(MyTree myTree, int a) {
        Queue<MyTree> chestnut = new LinkedList<>();
        chestnut.add(myTree);
        ArrayList<Integer> values = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            if (chestnut.peek() != null) {
                values.add(chestnut.peek().getA());
                chestnut.add(chestnut.peek().getLeftWing());
                chestnut.add(chestnut.peek().getRightWing());
                chestnut.poll();
            } else {
                return values;
//              throw new NullPointerException("bad things happens, bro");
            }

        }
        return values;
    }
}
