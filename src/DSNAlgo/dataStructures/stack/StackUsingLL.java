package DSNAlgo.dataStructures.stack;

public class StackUsingLL {
    Node top;
     int length;
     public StackUsingLL(){
         top = null;
         length = 0;
     }

    public static void main(String[] args) {
         StackUsingLL stack = new StackUsingLL();
         stack.display();
         stack.push(10);
         stack.display();
         stack.push(15);
         stack.display();
         stack.push(20);
         stack.display();
         stack.push(25);
         stack.display();
        System.out.println(stack.length());
        stack.pop();
        stack.display();
        System.out.println(stack.length());
        stack.pop();
        stack.display();
        System.out.println(stack.length());
        stack.pop();
        stack.display();
        System.out.println(stack.length());
        stack.pop();
        stack.display();
        System.out.println(stack.length());

    }

    public void push(int value){
          Node temp = new Node(value);
          temp.next = top;
          top = temp;
          length++;
    }

    public int pop(){
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public void display(){
         Node current = top;
         while(current != null){
             System.out.print(current.data+" -> ");
             current = current.next;
         }
        System.out.println("null");
    }

    public int length(){
        return length;
    }

    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
}
