package DSNAlgo.dataStructures.linkedList.doubleLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    DoublyLinkedList(){
        head = null;
        tail = null;
        length =0;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(2);
        dll.insertLast(3);
        dll.insertLast(4);
        dll.insertLast(5);
        dll.displayForward();
        dll.displayBackword();
        dll.insertfirst(6);
        dll.displayForward();
        dll.deleteFirst();
        dll.displayForward();
        dll.insertLast(6);
        dll.displayForward();;
        dll.deleteLast();
        dll.displayForward();

    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;

    }
    public void insertfirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }else{
            tail.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;

    }

    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail){
            head = null;
        }
        else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    public void displayForward(){
        ListNode temp = head;
        while(temp !=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackword(){
        ListNode temp = tail;
        while(temp !=null){
            System.out.print(temp.data+" -> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }
}
