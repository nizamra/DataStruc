class Node<T> {

    T data;
    Node<T> next;

    // public T getData(){return this.data;}
    // public Node<T> getNext(){return this.next;}
    // public void setData(T d){ this.data=d;}
    // public void setNext(Node<T> n){this.next=n;}

    public Node(T d, Node<T> n){
        this.data = d;
        this.next = n;
    }
    public Node(T d){
        this.data = d;
        this.next = null;
    }
}
class SLL<T> {
    Node<T> head = null;
    Node<T> tail = null;

    public boolean isEmpty(){
        if (this.head == null && this.tail == null){
            return true;
        }
        return false;
    }
    public void addToFront(T in) {
        // if (in == null) {
        //     throw new InsertException("Error: some exception was thrown");
        // }
        Node<T> i = new Node<>(in);
        i.next = head;
        if (isEmpty()){
            this.tail = i;
        }
        head = i;
    }
    public void addToBack(T in){
        Node<T> x = new Node<>(in);
        tail.next = x;
        tail = x;
    }
    public T removeFromFront(){
        if (isEmpty()){
            System.out.println("List is already Empty");
            return null;
        }
        else if (head==tail) {
            head = null;
            tail = null;
            System.out.println("List got no values now");
            return null;
        }
        else{
            Node<T> toDelete = head;
            head = head.next;
            return toDelete.data;
        }
    }
    public T removeFromBack(){
        if (isEmpty()){
            System.out.println("List is already Empty");
            return null;
        }
        else if (head==tail) {
            head = null;
            tail = null;
            System.out.println("List got no values now");
            return null;
        }
        else{
            Node<T> curr = head;
            while (curr.next.next != null){
                curr = curr.next;
            }
            T dat = tail.data;
            tail = curr;
            tail.next = null;
            return dat;
        }
    }
    public void prntLst(){
        Node<T> curr = head;
        while (curr!=null){
            System.out.print("==> "+curr.data);
            curr=curr.next;
        }
        System.out.println();
    }
}

public class SLLTest {
    public static void main(String[] args) {
        SLL<Integer> intsList  = new SLL<>();
        intsList.addToFront(4);
        intsList.prntLst();
        intsList.addToFront(3);
        // intsList.addToFront();
        intsList.addToFront(2);
        intsList.addToFront(1);
        intsList.prntLst();
        intsList.addToBack(5);
        intsList.prntLst();
        intsList.addToBack(6);
        intsList.prntLst();
        intsList.removeFromBack();
        intsList.prntLst();
        intsList.removeFromFront();
        intsList.removeFromFront();
        intsList.removeFromFront();
        intsList.removeFromFront();
        intsList.removeFromFront();
        intsList.removeFromFront();
        intsList.removeFromBack();
    }
}