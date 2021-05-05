import java.util.ArrayList;
import java.util.List;

public class lc_java_1469 {
    /**
     * Definition for a binary tree node.
     **/
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    public static void  main(String[] args) {

        TreeNode root = new TreeNode(1,null,null);
        /*
        input:
            [1,2,3,null,4]
            [7,1,4,6,null,5,3,null,null,null,null,null,2]
            [11,99,88,77,null,null,66,55,null,null,44,33,null,null,22]
            [197]
            [31,null,78,null,28]
        */
        getLonelyNodes(root);
    }

    public static List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        results.add(0,1);
        return results;
    }
}