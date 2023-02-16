package DSNAlgo.dataStructures.binaryHeap;

public class MaxPriorityQueue {
    Integer[] heap;
    int size;

    public static void main(String[] args) {
        MaxPriorityQueue pq = new MaxPriorityQueue(3);
        System.out.println(pq.size);
        System.out.println(pq.isEmpty());
        pq.insert(9);
        pq.insert(3);
        pq.insert(6);
        pq.insert(2);
        pq.insert(1);
        pq.insert(3);
        pq.insert(5);
        pq.insert(4);
        pq.printMaxHeap();
        System.out.println(pq.size);
        System.out.println(pq.isEmpty());
        System.out.println(pq.deleteMax());
        pq.printMaxHeap();



    }

    public MaxPriorityQueue(int capacity){
        heap = new Integer[capacity+1];  // index 0 kept empty
        size =0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public void insert(int value){
        if(size == heap.length-1){
            resize(2*heap.length);
        }
        size++;
        heap[size] = value;
        swim(size);

    }
    // bottm-up rehepify to maintain max heap( root node > child nodes)
    public void swim(int k){
        while(k>1 && heap[k/2] < heap[k]){   // k/2 is the forumula to find the parent node
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k=k/2;
        }
    }
    private void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for(int i=0;i<heap.length;i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void printMaxHeap(){
        for(int i=1;i<=size;i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }

    public int deleteMax(){
        int max = heap[1];
        swap(1,size);
        size--;
        sink(1);
        heap[size+1] = null;
        if(size >0 && (size == (heap.length-1)/4)){
            resize(heap.length/2);
        }

        return max;
    }

    public void sink(int k){
        while(2*k <=size){
            int j = 2*k; // to find the lett child (2*k + 1) for right child;
            if(j<size && heap[j]<heap[j+1]){
                j++;
            }
            if(heap[k]>=heap[j]){
                break;
            }
            swap(k,j);
            k=j;
        }
    }

    private void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;

    }





}
