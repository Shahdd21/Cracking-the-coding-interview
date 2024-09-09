import java.util.*;

public class Demo{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        QofLinkedlist list = new QofLinkedlist();

        list.add(1); list.add(1); list.add(1);
        
        while(!list.dogs.isEmpty() && !list.cats.isEmpty()){
            System.out.print(list.removeAny()+" ");
        }

        while(!list.dogs.isEmpty())
            System.out.print(list.removeDog()+" ");

        while (!list.cats.isEmpty())
            System.out.print(list.removeCat()+" ");
    }
}
