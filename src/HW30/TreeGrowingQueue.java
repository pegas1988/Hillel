package HW30;

import java.util.*;

class TreeGrowingQueue {
    MyTree createTree(MyTree myTree, int a) {
        Queue<MyTree> oak = new LinkedList<>();
        oak.add(myTree);

        for (int i = 2; i < a; i = i + 2) {
            assert oak.peek() != null : "oak doesnt have any object to pick on the iteration  - " + i;
            oak.peek().setLeftWing(new MyTree(i));
            assert oak.peek() != null : "oak doesnt have any object to pick on the iteration  - " + i;
            oak.peek().setRightWing(new MyTree(i + 1));
            assert oak.peek() != null : "oak doesnt have any object to pick on the iteration  - " + i;
            oak.add(oak.peek().getLeftWing());
            assert oak.peek() != null : "oak doesnt have any object to pick on the iteration  - " + i;
            oak.add(oak.peek().getRightWing());
            oak.poll();
        }
        return myTree;
    }
}
