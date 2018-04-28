public class Stack implements StackInterface{

    private Node head;
    private int size;
    private Node current;
    private Node beforeCurrent;

    public Stack() {
        head = null;
        size = 0;
        current = null;
        beforeCurrent = null;
    }

    private void getCurrent(int index){
        current = head;
        beforeCurrent = null;
        for(int i =1;i<index;i++){
            beforeCurrent = current;
            current = current.getNext();
        }
    }

    @Override
    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public String peak() {
        getCurrent(size);
        return current.getData().toString();
    }

    @Override
    public void push(Object node) {
        if(head == null){
            Node newNode = new Node();
            newNode.setData(node);

            head = newNode;
            size++;
        }else{
            size++;
            getCurrent(size);
            Node newNode = new Node();
            newNode.setData(node);
            current = newNode;
            beforeCurrent.setNext(current);

        }
    }

    @Override
    public Object pop() {
        getCurrent(size);
        beforeCurrent.setNext(null);
        size--;
        return beforeCurrent;
    }

    public String display(){
        getCurrent(1);
        String objects = "";
        for(int i = 1;i<=size;i++){
            objects = objects + current.getData().toString() + " ";
            current = current.getNext();
        }
        return objects;
    }
}
