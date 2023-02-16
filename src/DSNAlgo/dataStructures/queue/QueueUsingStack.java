package DSNAlgo.dataStructures.queue;

import java.util.Stack;

public class QueueUsingStack {

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop());
        System.out.println(queue.peek());
    }
    Stack<Integer> s1;
    Stack<Integer> s2;
    QueueUsingStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public void push(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s1.pop();
    }

    /** Get the front element. */
    public int peek() {
        return s1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }
}
