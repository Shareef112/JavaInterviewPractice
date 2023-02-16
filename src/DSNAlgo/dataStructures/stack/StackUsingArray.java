package DSNAlgo.dataStructures.stack;

public class StackUsingArray {
    int top;
    int maxsize;
    int[] stack;
    StackUsingArray(int maxsize){
        this.maxsize = maxsize;
        stack = new int[this.maxsize];
        top=-1;
    }

    public static void main(String[] args) {
        StackUsingArray Stack = new StackUsingArray(10);
        Stack.push(10);
        Stack.push(15);
        Stack.push(20);
        Stack.push(21);
        Stack.push(22);
        Stack.display();
        System.out.println(Stack.pop());
        Stack.display();
        System.out.println(Stack.pop());
        Stack.display();
        System.out.println(Stack.pop());
        Stack.display();
        System.out.println(Stack.pop());
        Stack.display();
        System.out.println(Stack.pop());
        Stack.display();

    }

    public void push(int value){
        if(top == maxsize -1 ){
            throw  new IndexOutOfBoundsException();
        }
        top++;
        stack[top] = value;
    }

    public int pop(){
        if(top == -1){
            throw  new IndexOutOfBoundsException();
        }
       return stack[top--];
    }

    public void display(){
        for(int i = top; i>=0;i--)
        {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
