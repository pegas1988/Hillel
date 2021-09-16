package HW22;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainJob {

    public static void main(String[] args) {
    }

    public static List<List<Integer>> layerCount(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> mainList = new ArrayList<>();

        Stack<TreeNode> firstStack = new Stack<>();
        Stack<TreeNode> secondStack = new Stack<>();

        firstStack.add(root);
        int count = 1;
        while (!firstStack.isEmpty() || !secondStack.isEmpty()) {
            List<Integer> innerList = new ArrayList<>();
            if (count % 2 == 0) {
                while (!secondStack.isEmpty()) {
                    root = secondStack.pop();
                    innerList.add(root.val);
                    if (root.right != null) {
                        firstStack.add(root.right);
                    }
                    if (root.left != null) {
                        firstStack.add(root.left);
                    }
                }
            } else {
                while (!firstStack.isEmpty()) {
                    root = firstStack.pop();
                    innerList.add(root.val);
                    if (root.left != null) {
                        secondStack.add(root.left);
                    }
                    if (root.right != null) {
                        secondStack.add(root.right);
                    }
                }
            }
            count++;
            mainList.add(innerList);
        }
        return mainList;
    }
}
