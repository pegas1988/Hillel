package HW30;

class MyTree {
    private int a;

    public MyTree leftWing;
    public MyTree rightWing;

    public MyTree(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public MyTree getLeftWing() {
        return leftWing;
    }

    public void setLeftWing(MyTree leftWing) {
        this.leftWing = leftWing;
    }

    public MyTree getRightWing() {
        return rightWing;
    }

    public void setRightWing(MyTree rightWing) {
        this.rightWing = rightWing;
    }

    public MyTree() {
    }
}
