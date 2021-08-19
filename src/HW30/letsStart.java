package HW30;

public class letsStart {
    public static void main(String[] args) {
        MyTree myTree = new MyTree(1);

        TreeGrowingClass treeGrowingClass = new TreeGrowingClass();
        treeGrowingClass.createTree(myTree, 1);

        TreeGatheringClass treeGatheringClass = new TreeGatheringClass();
        System.out.println(treeGatheringClass.gatherNums(myTree));
    }

}
