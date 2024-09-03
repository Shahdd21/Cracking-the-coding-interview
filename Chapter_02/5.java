import java.util.*;

public class Demo{
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        MyLinkedList<Integer> list1 = new MyLinkedList<>(), list2 = new MyLinkedList<>();

        list1.insert(9); list1.insert(7); list1.insert(8);
        list2.insert(6); list2.insert(8); list2.insert(5);

        int num1 = getNum(list1);
        int num2 = getNum(list2);

        int sum = num1+num2;

        MyLinkedList<Integer> result = getList(sum);

        result.display();
    }

    public static int getNum(MyLinkedList<Integer> list){

        StringBuilder str = new StringBuilder();

        Node node = list.head;

        while(node != null){
            str.insert(0,node.data);
            node = node.next;
        }

        char[] chars = str.toString().toCharArray();

        double divisor = Math.pow(10,chars.length-1);
        int num = 0;

        for(int i = 0 ; i < chars.length; ++i){
            num += (chars[i]-48) * divisor;
            divisor /= 10;
        }

        return num;
    }

    public static MyLinkedList<Integer> getList(int sum){

        MyLinkedList<Integer> list = new MyLinkedList<>();

        while(sum > 0 ){

            list.insert(sum%10);;
            sum /= 10 ;
        }

        return list;
    }
}
