package DSNAlgo.dataStructures.queue;

import java.util.NoSuchElementException;

public class Queue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.display();
        queue.enqueue(10);
        queue.display();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }

   private ListNode front;
    private ListNode rear;
    private int length;

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            front = newNode;
        }
        else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;

    }
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }

        length--;
        return data;

    }

    public void display(){
        ListNode current = front;
        while (current !=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }



    private class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
    }
}
