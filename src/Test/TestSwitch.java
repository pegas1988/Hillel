package Test;
//bad  - without "break"!!!
public class TestSwitch {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        for (int i : nums)    {
            switch (i) {
                case 1 :
                    System.out.println("1");
                case 5:
                    System.out.println("5");
                default:
                    System.out.println("D");
                case 2 :
                    System.out.println("2");
            }
        }
    }
}
