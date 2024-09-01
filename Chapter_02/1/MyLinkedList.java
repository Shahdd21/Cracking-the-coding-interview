public class MyLinkedList<E> {

    Node<E> head;
    int size ;

    public void insert(E data){

        Node<E> node = new Node<>();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node<E> temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    public void insertFirst(E data){

        if (head == null)  insert(data);

        else {
            Node<E> node = new Node<>(data);

            Node<E> temp = new Node<>();

            temp.data = head.data;
            temp.next = head.next;

            head = node;
            head.next = temp;
            head.data = node.data;
        }

        /* just as simple without any of all of the above
         Node node = new node(data);
         node.next = head;
         head = node;
        */

        size++;
    }

    public void insertAt(int index, E data){

        Node<E> node = new Node<>(data);
        Node<E> current = head;

        if(index == 0) insertFirst(data);

        else {
            for (int cnt = 0; cnt < index - 1; ++cnt) {
                current = current.next;
            }

            Node<E> temp;

            temp = current.next;
            current.next = node;
            node.next = temp;

        /*
          lines swap lines are simplified to :
          node.next = current.next;
          current.next = node;
         */
        }

        size++;
    }

    public void delete(){

        Node<E> current = head;

        while(current.next.next != null){
            current = current.next;
        }

        current.next = null;

        size--;
    }

    public void deleteFirst(){

        head = head.next;

        size--;
    }

    public void deleteAt(int index){

        if(index == 0) deleteFirst();

        else {
            Node<E> current = head;

            for (int cnt = 0; cnt < index - 1; ++cnt)
                current = current.next;

            current.next = current.next.next;
        }

        size--;
    }

    public void display(){
        Node<E> temp = head;

        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println(temp.data);
    }

    public int getSize(){
        return size;
    }
}

class  Node<E>{
    E data;
    Node<E> next ;

    Node(){

    }
    Node(E data){
        this.data = data;
    }
}
