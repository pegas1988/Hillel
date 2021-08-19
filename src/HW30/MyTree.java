package HW30;

class MyTree {
    private int a;

    MyTree leftWing;
    MyTree rightWing;

    MyTree(int a) {
        this.a = a;
    }

    int getA() {
        return a;
    }

    MyTree getLeftWing() {
        return leftWing;
    }

    void setLeftWing(MyTree leftWing) {
        this.leftWing = leftWing;
    }

    MyTree getRightWing() {
        return rightWing;
    }

    void setRightWing(MyTree rightWing) {
        this.rightWing = rightWing;
    }
}
