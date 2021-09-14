import java.util.Iterator;

public class SinglLinkLst<T> {
    private static class Node<T>{
        private T data;
        private Node<T> next;

        private Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
        private Node(T data){ this(data,null); }
    }

    private class LLIterator implements Iterator<T> {
        private Node<T> curr;
        LLIterator() {curr = head;}
        public boolean hasNext() { return curr != null; }
        public T next() {
            if (hasNext()) {
                T temp = curr.data;
                curr = curr.next;
                return temp;
            }
            return null;
        }
    }

    public void removeDuplicates(){
        head = rRemove(head);
    }

    private Node<T> rRemove(Node<T> curr){
        if (curr == null){
            return null;
        }
        curr.next = rRemove(curr.next);
        if (curr.next != null && curr.data.equals(curr.next.data)){
            return curr.next;
        }
        return curr;
    }
}
