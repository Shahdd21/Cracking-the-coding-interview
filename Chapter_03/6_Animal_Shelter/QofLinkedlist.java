import java.util.LinkedList;

public class QofLinkedlist {

    int data;
    LinkedList<Integer> cats = new LinkedList<>(); //1
    LinkedList<Integer> dogs = new LinkedList<>(); //2
    int index = 0 ;

    public void add(int data){
        if(data == 1)
            cats.addLast(index);

        if(data == 2)
            dogs.addLast(index);

        ++index;
    }

    public int removeAny(){
        int oldest =-1;

        if(!dogs.isEmpty() && !cats.isEmpty()) {
            if (cats.getFirst().compareTo(dogs.getFirst()) < 0) {
                oldest = cats.getFirst();
                cats.removeFirst();
            } else {
                oldest = dogs.getFirst();
                dogs.removeFirst();
            }
        }

        else{
                if(!dogs.isEmpty()) {
                    oldest = dogs.getFirst();
                    dogs.removeFirst();
                }

                else if (!cats.isEmpty()) {
                    oldest = cats.getFirst();
                    cats.removeFirst();
                }
            }
        return oldest;
    }

    public int removeDog(){

        if(dogs.isEmpty()) return -1;

        int oldest = dogs.getFirst();
        dogs.removeFirst();

        return oldest;
    }

    public int removeCat(){

        if (cats.isEmpty()) return -1;

        int oldest = cats.getFirst();
        cats.removeFirst();

        return oldest;
    }

}
