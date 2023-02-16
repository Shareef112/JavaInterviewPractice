package DSNAlgo.dataStructures.binaryTree;

public class BinarySearchTree {

    static TreeNode root;

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        createBinaryTree();
        System.out.println(isValid(root,Long.MIN_VALUE,Long.MAX_VALUE));
        root = null;
        root = insert(root,5);
       root = insert(root,3);
        root =insert(root,7);
        root =insert(root,2);
        root =insert(root,8);
        root =insert(root,4);
        root =insert(root,6);
        bt.inOrder(root);
        System.out.println();
        System.out.println(isKeyFound(root,9));
        System.out.println(isValid(root,Long.MIN_VALUE,Long.MAX_VALUE));


    }
    public static void createBinaryTree(){
        TreeNode first = new TreeNode(20);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(8);
        TreeNode fourth = new TreeNode(10);
        TreeNode fifth = new TreeNode(5);
        root = first;          // 1
        root.left = second;   // 2 - 1
        root.right = third;   // 2 - 1 -3
        second.left = fourth; // 4 -2
        second.right = fifth; // 4 - 2 - 5


    }

    public static TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return  root;
        }
        if(value < root.data){
            root.left = insert(root.left,value);
        }
        else{
            root.right = insert(root.right,value);
        }
        return root;
    }

    public static TreeNode search(TreeNode root, int key){
        if(root == null || root.data == key){
            return root;
        }
        if(key < root.data){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }

    }

    public static boolean isKeyFound(TreeNode root, int key){
        return null != search(root,key) && key == search(root,key).data;
    }

    public static boolean isValid(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >=max){
            return false;
        }
        boolean left = isValid(root.left,min,root.data);
        if(left){
            boolean right = isValid(root.right,root.data,max);
            return right;
        }
        return false;

    }
}
