package problems;

import DSNAlgo.dataStructures.binaryTree.BinaryTree;
import DSNAlgo.dataStructures.binaryTree.TreeNode;

public class ConvertSortedArrayToBst {

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        ConvertSortedArrayToBst bst = new ConvertSortedArrayToBst();
        TreeNode value = bst.sortedArrayToBST(nums);
        BinaryTree bt = new BinaryTree();
        bt.inOrder(value);
    }
    public  TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        TreeNode head = helper(num, 0, num.length - 1);
        return head;

    }

    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) { // Done
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }

}
