public class SLL<T> {
    Node<T> head;
    Node<T> tail;

    public void addToFront(T in){
        Node<T> i = new Node<>(in);
        i.next = head;
        head = i;
    }
    public void addToBack(T in){
        Node<T> i = new Node<>(in);
        tail.next = i;
        tail = i;
    }
    public void removeFromFront(){
        head = head.next;
    }
    public T removeFromFront(){
        curr = head;
        while (curr.next.next != null){
            curr = curr.next;
        }
        dat = tail.data;
        tail = curr;
        tail.next = null;
        return dat;
    }
}
