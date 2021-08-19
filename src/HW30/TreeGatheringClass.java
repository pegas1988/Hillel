package HW30;

import java.util.ArrayList;

public class TreeGatheringClass {
    ArrayList list = new ArrayList();

    public ArrayList gatherNums(MyTree myTree) {
        if (isLeaf(myTree))
            list.add(myTree.getA());
        else {
            list.add(myTree.getA());
            gatherNums(myTree.leftWing);
            gatherNums(myTree.rightWing);
        }
        return list;
    }

    public boolean isLeaf(MyTree myTree) {
        if (myTree.getLeftWing() == null && myTree.getRightWing() == null)
            return true;
        else
            return false;
    }
}
