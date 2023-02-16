package DSNAlgo.dataStructures.linkedList.circularSingleLinkedList;

import java.util.NoSuchElementException;

public class CircularSingleLinkedList {
    private static ListNode last;
    private int length;
    CircularSingleLinkedList(){
        last = null;
        length =0;
    }

    public static void main(String[] args) {
        CircularSingleLinkedList  cll = new CircularSingleLinkedList();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
        cll.display();
        cll.insertFirst(5);
        cll.display();
        cll.insertlast(6);
        cll.display();
        cll.deleteFirst();
        cll.display();
       cll.deleteLat();
        cll.display();

    }

    public boolean isEmpty(){
        return length() == 0;
    }

    public int length(){
        return length;
    }

    public void display(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while(first !=last){
            System.out.print(first.data+" -> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void insertFirst(int value){
        ListNode temp = new ListNode(value);
        if (last == null){
            last = temp;
        }
        else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }
    public void insertlast(int value){
        ListNode temp = new ListNode(value);
        if (last == null){
            last = temp;
            last.next = last;
        }
        else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }
    public void deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if(last.next == last){
            last = null;
        }
        else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
    }
    public void deleteLat(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode current = last.next;
        ListNode first = last.next;

        if(last.next == last){
            last = null;
        }
        else{
            while (current.next != last){
                current = current.next;
            }

        }
        last = current;
        current.next = null;
        last.next = first;

        length--;
    }
}
