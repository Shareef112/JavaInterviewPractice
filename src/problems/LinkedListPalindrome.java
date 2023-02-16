package problems;


public class LinkedListPalindrome {
   static ListNode head;
    public static void main(String[] args) {
        LinkedListPalindrome lp = new LinkedListPalindrome();
        lp.addElements();
        System.out.println(lp.isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;

        ListNode current = head;
        ListNode prev = new ListNode(head.val);

        while(current.next != null){
            ListNode temp = new ListNode(current.next.val);
            temp.next = prev;
            prev = temp;
            current = current.next;
        }

        ListNode p1 = head;
        ListNode p2 = prev;

        while(p1!=null){
            if(p1.val != p2.val)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }


    private class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public  void addElements(){
       ListNode first =new ListNode(1);
       ListNode second =new ListNode(1);
       ListNode third =new ListNode(2);
       ListNode fourth =new ListNode(1);

        head = first;
        head.next = second;
        second.next = third;
        third.next = fourth;

    }
}
