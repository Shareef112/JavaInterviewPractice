package DSNAlgo.dataStructures.binaryTree;

import java.util.*;

public class BinaryTree {
    private static TreeNode root;


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder(root);
        System.out.println();
        bt.iterativePreOrder(root);
        System.out.println();
        bt.inOrder(root);
        System.out.println();
        bt.iterativeInOrder(root);
        System.out.println();
        bt.postOrder(root);
        System.out.println();
        bt.iterativePostOrder(root);
        System.out.println();
        bt.levelOrder(root);
        System.out.println();
        System.out.println(findMax(root));
        System.out.println(interativeFindMax(root));
        System.out.println(maxDepth(root));
        System.out.println(isHeightBalancedTree(root));
        System.out.println(minDepth(root));
        System.out.println(hasPathSum(root,6));
        TreeNode rev = invertBinaryTree(root);
        bt.levelOrder(rev);
        System.out.println();
        System.out.println(printBinaryTreePaths(root));
        System.out.println(sumOfLeftLeaves(root));

    }

    public void createBinaryTree(){
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

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void iterativePreOrder(TreeNode root){
       if(root == null){
           return;
       }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void iterativeInOrder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp !=null){
            if(temp !=null){
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }

    public void postOrder(TreeNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }

    public void iterativePostOrder(TreeNode node){
        if(node == null){
            return;
        }
      TreeNode current = node;
      Stack<TreeNode> stack = new Stack<>();
      while ( current !=null || !stack.isEmpty() ){
          if(current != null){
              stack.push(current);
              current = current.left;
          }
          else{
              TreeNode temp = stack.peek().right;
              if(temp == null){
                  temp = stack.pop();
                  System.out.print(temp.data+" ");
                  while (!stack.isEmpty() && temp == stack.peek().right){
                      temp = stack.pop();
                      System.out.print(temp.data+" ");
                  }
              }
              else{
                  current =temp;
              }
          }
      }
    }

    public void levelOrder(TreeNode node){
        if(node == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                queue.offer(temp.left);
            }
            if(temp.right !=null){
                queue.offer(temp.right);
            }
        }
    }

    public static int findMax(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result){
            result = left;
        }
        if(right > result){
            result = right;
        }
        return  result;
    }

    public static int interativeFindMax(TreeNode root){
        if(root == null){
            throw new IndexOutOfBoundsException();
        }
        int result = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if (temp.data > result){
                result = temp.data;
            }
            if(temp.left !=null){
                queue.offer(temp.left);
            }
            if(temp.right !=null){
                queue.offer(temp.right);
            }
        }
        return result;
    }

   static List<String> output;
    public static List<String> printBinaryTreePaths(TreeNode root){
        output = new ArrayList<>();
        paths(root,"");
        return output;

    }
    private static void paths(TreeNode root, String s){
        if(root == null){
            return;
        }
        s += String.valueOf(root.data);
        if(root.left == null && root.right == null){
            output.add(s);
        }
        paths(root.left,s+"->");
        paths(root.right,s+"->");
    }

    public static TreeNode invertBinaryTree(TreeNode root){
        if(root == null || (root.left == null && root.right == null)){
            return root;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        return root;
    }

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return  1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public static  int minDepth(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        else if(root.left != null && root.right != null) return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        else if(root.left != null) return minDepth(root.left) + 1;
        else return minDepth(root.right) + 1;

    }

    public static boolean isHeightBalancedTree(TreeNode root){
        if(root == null){
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.abs(left - right) <=1 && isHeightBalancedTree(root.left) && isHeightBalancedTree(root.right);
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && sum == root.data) return true;
        return hasPathSum(root.left, sum - root.data) || hasPathSum(root.right, sum - root.data);
    }

    static int sum =0;
    public static int sumOfLeftLeaves(TreeNode root){
        if(root == null || (root.left == null && root.right == null)){
            return sum;
        }
        if(root.left != null){
            sum = sum+root.left.data;
            sumOfLeftLeaves(root.left);
        }
        if(root.right != null){
            sumOfLeftLeaves(root.right);

        }
        return sum;
    }


}
