import java.awt.peer.ListPeer;
import java.net.Inet4Address;
import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(5);
        Node<Integer> c = new Node<>(2);
        Node<Integer> x = new Node<>(2);
        Node<Integer> d = new Node<>(5);
        Node<Integer> e = new Node<>(1);

          a.next = b; b.next = c; c.next = x;
          x.next = d; d.next = e;

        System.out.println(isPalindrome(a));
    }

    public static boolean isPalindrome(Node<Integer> node){

        Node<Integer> fastRunner = node;
        Node<Integer> slowRunner = node;

        Stack<Integer> stk = new Stack<>();

        while(fastRunner !=null && fastRunner.next!= null){

            stk.push(slowRunner.data);
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }

        if(fastRunner != null)
            slowRunner = slowRunner.next;

        while(slowRunner != null){
            int top = stk.pop();

            if(top != slowRunner.data)
                return false;

            slowRunner = slowRunner.next;
        }

        return true;
    }
}
