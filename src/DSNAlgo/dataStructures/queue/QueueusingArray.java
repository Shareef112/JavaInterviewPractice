package DSNAlgo.dataStructures.queue;

public class QueueusingArray {


    public static void main(String[] args) {
        QueueusingArray queue = new QueueusingArray(5);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        queue.print();
        System.out.println();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());





    }
    int[] arr;
    int topOfQueue;
    int beginigOfQueue;
    QueueusingArray(int size){
        arr = new int[size];
        topOfQueue = -1;
        beginigOfQueue = 0;
    }
    public boolean isFull(){
        if(arr.length == topOfQueue -1){
            return true;
        }
        else {
            return false;
        }
    }
public boolean isEmpty(){
        if(arr == null || beginigOfQueue == arr.length){
            return true;
        }
        else {
            return false;
        }
}
public void print(){
        for(int value : arr){
            System.out.print(value+" ");
        }
}
    public void enqueue(int value){
        if(isFull()){
            throw new IndexOutOfBoundsException();
        }
            arr[++topOfQueue] = value;

    }
    public int dequeue(){
        if(isEmpty()){
            throw  new IndexOutOfBoundsException();
        }
        int data = arr[beginigOfQueue];
        beginigOfQueue++;
        if(beginigOfQueue>topOfQueue){
            beginigOfQueue = 0;
            topOfQueue =-1;
            arr =null;
        }
        return data;
    }
}
