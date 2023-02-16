package problems;

import java.util.List;

public class RemoveLinkedListElements {
   static ListNode head;
    public static void main(String[] args) {
        RemoveLinkedListElements ll = new RemoveLinkedListElements();
        ll.addElements();
        ll.removeElements(6);
    }



    public  ListNode removeElements(int val) {
        if(head == null) return null;

        while(head!=null){
            if(head.val == val){
                head = head.next;
            }else{
                break;
            }
        }

        ListNode previous = head;

        if(previous == null) return null;

        while(previous.next != null){
            if(previous.next.val == val){
                ListNode cureent = previous.next;
                previous.next = cureent.next;
            }else{
                previous = previous.next;
            }
        }
        return head;
    }

    public  void addElements(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(4);
        ListNode sixth = new ListNode(5);
        ListNode seventh = new ListNode(5);
        head = first;
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
    }


    private class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }

    }
}
