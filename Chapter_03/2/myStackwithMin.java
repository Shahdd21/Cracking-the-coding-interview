import java.util.Comparator;
import java.util.EmptyStackException;

public class myStack<E extends Comparable<E>> {

    private static class stkNode<E>{
        E data;
        E prevMin;
        stkNode<E> next;

        public stkNode(E data){
            this.data = data;
        }
    }
    private stkNode<E> top;

    public E peek(){

        if(top == null)
           throw new EmptyStackException();
        return top.data;
    }

    public E pop(){
        if(top == null)
            throw new EmptyStackException();

        E prevTop = top.data;
        top = top.next;

        return prevTop;
    }

    public void push(E data){
        stkNode<E> node = new stkNode<>(data);

        if(top == null)
            node.prevMin = node.data;
        else{

            if(node.data.compareTo(top.prevMin) < 0)
                node.prevMin = node.data;

            else
                node.prevMin = top.prevMin;
        }

        node.next = top;
        top = node;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public E getMin(){
        return top.prevMin;
    }
}
