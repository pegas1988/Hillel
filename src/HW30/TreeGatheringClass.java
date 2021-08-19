package HW30;

import java.util.ArrayList;
import java.util.stream.Collectors;

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
        return (ArrayList) list.stream().sorted().collect(Collectors.toList());
    }

    private boolean isLeaf(MyTree myTree) {
        return myTree.getLeftWing() == null && myTree.getRightWing() == null;
    }
}
