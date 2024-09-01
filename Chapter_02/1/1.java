import java.util.*;

public class Demo{
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.insert(1);
        list.insert(5);
        list.insert(1);
        list.insert(2);
        list.insert(5);
        list.insert(1);
        list.insert(3);
        list.insert(1);
        list.insert(2);
        list.insert(1);

        Node<Integer> node = list.head;
        Node<Integer> current;

        while(node != null){
            current = node;

            while(current.next != null){

                if(current.next.data == node.data){
                    current.next = current.next.next;
                }
                else{
                    current = current.next;
                }
            }

            node = node.next;
        }

        list.display();
    }

}
