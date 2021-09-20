package HW19;

public class TreeSum {

    public int sumRootToLeaf(TreeNode root) {
        if(root.left == null & root.right == null)
            return root.val;
        return totalSum(root.right, root.val) + totalSum(root.left, root.val);
    }

    public int totalSum(TreeNode node, int letter) {
        if (node == null) {
            return 0;
        }
        if (node.right == null && node.left == null) {
            letter = letter * 2;
            return letter + node.val;
        }

        int total = 0;
        letter = letter * 2;
        letter += node.val;
        total += totalSum(node.right, letter) + totalSum(node.left, letter);
        return total;
    }
}
