package HW30;

public class TreeCreationClass {
    int counter = 8; //this variable tells us how many tree levels should we make;

    public void createTree(MyTree myTree, int a) {
        if (a <= counter) {
            int b = a * 2;
            myTree.setLeftWing(new MyTree(b));
            createTree(myTree.leftWing, b);
            System.out.println("left " + b);
        }
        if (a <= counter) {
            int c = a * 2 + 1;
            myTree.setRightWing(new MyTree(c));
            createTree(myTree.rightWing, c);
            System.out.println("right " + c);
        }
    }
}

