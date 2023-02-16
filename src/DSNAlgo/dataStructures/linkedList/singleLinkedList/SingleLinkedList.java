package DSNAlgo.dataStructures.linkedList.singleLinkedList;

public class SingleLinkedList {
   static Node head;

    public static void main(String[] args) {
        head = new Node(10);
        Node second = new Node(1);
        Node third = new Node(8);
        Node fourth = new Node(11);
        head.next = second;// 10 -> 1
        second.next = third;// 10 -> 1 -> 8
        third.next = fourth;// 10 -> 1 -> 8 -> 11 -> null
        display();
        System.out.println(length());
        insertFirst(2);
        display();
        insertLast(9);
        display();
        insertAtPosition(5,3);
        display();
        deleteFirst();
        display();
        deletelast();
        display();
        deletetAtPosition(3);
        display();
        System.out.println(isPresent(8));
        System.out.println(isPresent(3));
        head = reverse(head);
       //reverse(head);
        display();
        //System.out.println(head == reverse(head));
        insertAtPosition(4,3);
        display();
        System.out.println(findMiddle().data);
        System.out.println(nthNodeinEndOfList(2).data);
        head = new Node(1);
         second = new Node(1);
         third = new Node(2);
         fourth = new Node(3);
         Node fifth = new Node(3);
        head.next = second;// 10 -> 1
        second.next = third;// 10 -> 1 -> 8
        third.next = fourth;// 10 -> 1 -> 8 -> 11 -> null
        fourth.next = fifth;
        display();
        removeDuplicatedInSortedArray();
        display();
        addNodetoSortedLinkedList(3);
        display();
        removeKeyfromSortedLinkedList(3);
        display();
        System.out.println(isLoopPresented());
        createLoopedLinkedList();;
        System.out.println(isLoopPresented());
        System.out.println(startNodeInLoop().data);
        removeLoop();
        System.out.println(isLoopPresented());
        display();
        getIntersectionNode(createLLA(),createLLB());
        head = oddNEvenLinkedList(head);
        display();





    }

    public static void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static int length(){
        int count =0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(null != current.next){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public static void insertAtPosition(int data, int postion){
        Node newNode = new Node(data);
        if(postion == 1){
            head = newNode;
        }
        else{
            Node previous = head;
            int count =1;
            while (count < postion -1){
                count++;
                previous = previous.next;
            }
            Node current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }

    }
    public static void deleteFirst(){
        if(head != null){
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }
    public static void deletelast(){
        if(head != null && head.next !=null){
            Node current = head;
            Node previous = null;
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;

        }
    }

    public static void deletetAtPosition(int postion){
        if(head != null){
            Node previous = head;
            int count =1;
            while (count < postion -1){
                count++;
                previous = previous.next;//5
            }
            Node current = previous.next;
            previous.next = current.next;

        }

    }
    public static boolean isPresent(int value){
        Node node = head;
        while (node != null){
            if(node.data == value){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public static Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static Node findMiddle(){
        if(head == null){
            return null;
        }
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static Node nthNodeinEndOfList(int n){
        Node refPnter = head;
        Node mainPnter = head;
        int count =0;
        while(count < n){
            refPnter = refPnter.next;
            count++;
        }
        while(refPnter !=null){
            refPnter = refPnter.next;
            mainPnter = mainPnter.next;
        }
        return  mainPnter;

    }
    public static void removeDuplicatedInSortedArray(){
        Node current = head;
        while (current !=null && current.next !=null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }
    public static void addNodetoSortedLinkedList(int value){
        Node newNode = new Node(value);
        Node current = head;
        Node temp = null;
        while(current !=null && current.data < newNode.data){
              temp = current;
              current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;

    }
    public static void removeKeyfromSortedLinkedList(int value){
        Node current = head;
        Node temp = null;
        while(current != null && current.data !=value){
            temp = current;
            current = current.next;
        }
        if (current !=null){
            temp.next = current.next;
        }
    }

    public static boolean isLoopPresented(){
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr !=null && fastPtr.next !=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
    public static Node startNodeInLoop(){
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr !=null && fastPtr.next !=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }
    public static void removeLoop(){
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr !=null && fastPtr.next !=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
                 removeLoop(slowPtr);
            }
        }
    }

    private static Node getStartingNode(Node node){
        Node temp = head;
        while(temp != node){
            node = node.next;
            temp = temp.next;
        }
        return temp;
    }
    private static void removeLoop(Node node){
        Node temp = head;
        while(temp.next != node.next ){
            node = node.next;
            temp = temp.next;
        }
        node.next = null;
    }

    public static void createLoopedLinkedList(){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

    }
    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while(list1 !=null && list2 != null){
            if(list1.data <=list2.data){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if(list1 == null){

            tail.next =list2;
        }
        else{
            tail.next = list1;
        }
        return dummy.next;
    }

    public static Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null) return null;
        Node cur1 = headA,
        cur2 = headB;
        int reach = 0;
        while(cur1 != cur2){
            cur1 = cur1.next;
            if(cur1 == null){
                cur1 = headB;
                if(++reach == 2) return null;
            }
            cur2 = cur2.next;
            if(cur2 == null) cur2 = headA;
        }
        return cur1;
    }

    public static Node oddNEvenLinkedList(Node head){
        if (head == null) {
            return head;
        }
        boolean odd = true;
        Node dummyOddHead = new Node(0); // for odd nodes
        Node curOdd = dummyOddHead;
        Node dummyEvenHead = new Node(0); // for even nodes
        Node curEven = dummyEvenHead;
        while (head != null) {
            Node next = head.next;
            head.next = null;
            if (odd) {
                curOdd.next = head;
                curOdd = curOdd.next;
            } else {
                curEven.next = head;
                curEven = curEven.next;
            }
            odd = !odd;
            head = next;
        }
        curOdd.next = dummyEvenHead.next; // merge 2 lists
        return dummyOddHead.next;
    }

    public static Node createLLA(){
       Node first = new Node(4);
        Node second = new Node(1);
        Node third = new Node(8);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        return  first;

    }
    public static Node createLLB(){
        Node first = new Node(5);
        Node second = new Node(0);
        Node third = new Node(1);
        Node fourth = new Node(8);
        Node fifth = new Node(4);
        Node sixth = new Node(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        return  first;
    }

}
