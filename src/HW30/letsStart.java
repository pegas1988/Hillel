package HW30;

public class letsStart {
    public static void main(String[] args) {
        MyTree myTree = new MyTree(1);

        TreeGrowingQueue treeGrowingQueue = new TreeGrowingQueue();

        TreeGatheringQueue treeGatheringQueue = new TreeGatheringQueue();
        System.out.println(treeGatheringQueue.gatherValues(treeGrowingQueue.createTree(myTree, 31), 31));
    }
}
