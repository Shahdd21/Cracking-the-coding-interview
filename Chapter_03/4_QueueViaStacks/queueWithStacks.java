public class queueWithStacks<E> {

    E data;
    myStack<E> stk = new myStack<>();

    public void add(E data){
        stk.push(data);
    }

    public E pop(){

        myStack<E> temp = new myStack<>();

        while(!stk.isEmpty()){
            temp.push(stk.pop());
        }

        E prevTop = temp.pop();

        while(!temp.isEmpty()){
            stk.push(temp.pop());
        }

        return prevTop;
    }

    public E peek(){
        myStack<E> temp = new myStack<>();

        while(!stk.isEmpty()){
            temp.push(stk.pop());
        }

        E top = temp.peek();

        while(!temp.isEmpty()){
            stk.push(temp.pop());
        }

        return top;
    }

    public boolean isEmpty(){
        return stk == null || stk.isEmpty();
    }
}
