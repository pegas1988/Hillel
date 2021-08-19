package HW30;

class TreeGrowingClass {
    void createTree(MyTree myTree, int a) {
        //this variable tells us how many tree levels should we make;
        int counter = 16;
        if (a <= counter) {
            int b = a * 2;
            myTree.setLeftWing(new MyTree(b));
            createTree(myTree.leftWing, b);
        }
        if (a <= counter) {
            int c = a * 2 + 1;
            myTree.setRightWing(new MyTree(c));
            createTree(myTree.rightWing, c);
        }
    }
}

