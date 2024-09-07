import java.util.*;

public class Demo{
    public static void main(String[] args) {

        queueWithStacks<Integer> q = new queueWithStacks<>();

        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);

        System.out.println(q.pop());
        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.println(q.pop());
        }
    }
}
