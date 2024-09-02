import java.util.*;

public class Demo{
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.insert(1); list.insert(2); list.insert(3);
        list.insert(4); list.insert(5); list.insert(6);
        list.insert(7); list.insert(8);

        DeleteMiddle(current, list);
    }

    public static <E> boolean DeleteMiddle(Node<E> current, MyLinkedList<E> list){

        if(current == null || current.next == null)
            return false;

        current.data = current.next.data;
        current.next = current.next.next;

        return true;
    }
}
