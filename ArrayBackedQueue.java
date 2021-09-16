class Queue{
    Integer INITIAL_CAPACITY = 6;
    Integer[] queue = new Integer[INITIAL_CAPACITY];
    Integer front = 0;
    Integer last = 0;
    Integer size = 0;
    
    public boolean isEmpty(){
        if (front==last){
            return true;
        }
        else{
            return false;
        }
    }
    public void inQueue(Integer in){
        queue[last] = in;
        last++;
    }
    public Integer deQueue(){
        Integer toDequ = queue[front];
        queue[front] = null;
        front++;
        return toDequ;
    }
    public void prr(){
        for (int i=0;i<INITIAL_CAPACITY;i++){
        System.out.print(" , "+i+"->"+queue[i]);
        }
    }
}

public class ArrayBackedQueue{
    
     public static void main(String []args){
        System.out.println("Hello World");
        Queue sq = new Queue();
        sq.prr();
        System.out.println(sq.isEmpty());
        sq.inQueue(0);
        sq.inQueue(1);
        sq.inQueue(2);
        sq.inQueue(3);
        sq.inQueue(4);
        sq.inQueue(5);
        sq.prr();
        System.out.println(sq.isEmpty());
        sq.deQueue();
        sq.deQueue();
        sq.deQueue();
        sq.deQueue();
        sq.deQueue();
        sq.deQueue();
        sq.prr();
        System.out.println(sq.isEmpty());
     }
}