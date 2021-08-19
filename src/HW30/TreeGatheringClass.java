package HW30;

import java.util.ArrayList;

class TreeGatheringClass {
    private ArrayList list = new ArrayList();

    ArrayList gatherNums(MyTree myTree) {
        if (isLeaf(myTree))
            list.add(myTree.getA());
        else {
            list.add(myTree.getA());
            gatherNums(myTree.leftWing);
            gatherNums(myTree.rightWing);
        }
        return list;
    }

    private boolean isLeaf(MyTree myTree) {
        return myTree.getLeftWing() == null && myTree.getRightWing() == null;
    }
}
