import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Node<Integer> l11 = new Node<>(1); Node<Integer> l12 = new Node<>(2);
        Node<Integer> l13 = new Node<>(3); Node<Integer> l14 = new Node<>(4);
        Node<Integer> l15 = new Node<>(5);

        Node<Integer> l26 = new Node<>(6); Node<Integer> l27 = new Node<>(7);
        Node<Integer> l28 = new Node<>(8);

        //l1
        l11.next = l12; l12.next = l13; l13.next = l14; l14.next = l15;

        //l2
        l26.next = l27; l27.next = l28; l28.next = l13;

        if(!checkIntersection(l11, l26)){
            System.out.println("No intersection");
            return;
        }

        int l1Size = countSize(l11);
        int l2Size = countSize(l26);

        System.out.println(getIntersectionNode(l11,l1Size,l26,l2Size).data);

    }

    public static Node<Integer> getIntersectionNode(Node<Integer> head1, int list1Size, Node<Integer> head2, int list2Size){

        Node<Integer> longerList;
        Node<Integer> shorterList;

        if(list1Size > list2Size){
            longerList = head1;
            shorterList = head2;
        }
        else{
            longerList = head2;
            shorterList = head1;
        }

        int diff = Math.abs(list1Size-list2Size);

        while (diff-- > 0){
            longerList = longerList.next;
        }

        while(longerList != shorterList){
            shorterList = shorterList.next;
            longerList = longerList.next;
        }

        return shorterList;
    }

    public static int countSize(Node<Integer> head){

        int cnt = 0 ;

        while(head != null){
            head = head.next;
            cnt++;
        }

        return cnt;
    }

    public static boolean checkIntersection(Node<Integer> head1, Node<Integer> head2){

        Node<Integer> head1Ptr = head1;
        Node<Integer> head2Ptr = head2;

        while (head1Ptr.next != null){
            head1Ptr = head1Ptr.next;
        }

        while (head2Ptr.next != null){
            head2Ptr = head2Ptr.next;
        }

        return head1Ptr == head2Ptr;
    }
}
