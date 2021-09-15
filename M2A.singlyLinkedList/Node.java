public class Node<T> {

    private T data;
    private Node<T> next;

    public T getData(){return this.data;}
    public Node<T> getNext(){return this.next;}
    public void setData(T d){ this.data=d;}
    public void setNext(Node<T> n){this.next=n;}

    public Node(T d, Node<T> n){
        // throw new InsertExceptionHere("Error: some exception was thrown");
        this.data = d;
        this.next = n;
    }
    public Node(T d){
        this.data = d;
        this.next = null;
    }
}
