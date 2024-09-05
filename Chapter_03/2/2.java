import java.util.*;

public class Demo{
    public static void main(String[] args)  {

        myStack<Integer> stk = new myStack<>();

          stk.push(9); stk.push(5); stk.push(6);
        stk.push(3); stk.push(4); stk.push(1);

        while(!stk.isEmpty()){
            System.out.println("Top: "+stk.peek()+", Min: "+stk.getMin());
            stk.pop();
        }
    }

}
