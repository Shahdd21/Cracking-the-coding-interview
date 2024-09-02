import java.util.*;

public class Demo{
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.insert(3); list.insert(5); list.insert(8);
        list.insert(5); list.insert(10); list.insert(2);
        list.insert(1);

        MyLinkedList<Integer> arranged = partitionXinto1(5,list);

        arranged.display();
    }

    public static MyLinkedList<Integer> partitionXinto1(int x , MyLinkedList<Integer> list){

        MyLinkedList<Integer> arranged = new MyLinkedList<>();

        Node<Integer> current = list.head;

        while(current != null){
            if(current.data < x)
                arranged.insertFirst(current.data);
            else
                arranged.insert(current.data);

            current = current.next;
        }

        return arranged;
    }
}
