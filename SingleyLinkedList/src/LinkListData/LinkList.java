package LinkListData;

public class LinkList {
    Node head;

    public LinkList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void insertAtStart(int value) {
        if (isEmpty()) {
            head = new Node(value);
            return;
        }

        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertAtLast(int value) {
        if (isEmpty()) {
            head = new Node(value);
            return;
        }

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        Node newNode = new Node(value);
        last.setNext(newNode);
    }

    public void printList() {

        if (isEmpty()) {
            System.out.println("NULL [Empty]");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "-->");
            temp = temp.getNext();
        }
        System.out.print("NULL \n");
    }

    public void removeFromStart() {
        if (isEmpty())
            return;

        Node temp = head;
        head = head.getNext();
        temp.next = null;
    }

    public void removeFromLast() {
        if (isEmpty())
            return;

        Node last = head.getNext();
        if (last == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        while (last.getNext() != null) {
            secondLast = last;
            last = last.getNext();
        }
        secondLast.setNext(null);
    }

    public int getLength() {
        Node temp = head;
        int l = 0;
        while (temp != null) {
            l++;
            temp = temp.getNext();
        }
        return l;
    }

    public boolean searchValue(int value) {
        if (isEmpty())
            return false;

        Node temp = head;
        while (temp != null) {
            if (temp.getData() == value)
                return true;
            temp = temp.getNext();
        }

        return false;
    }

    public Node searchNode(int value) {
        if (isEmpty())
            return null;

        Node temp = head;
        while (temp != null) {
            if (temp.getData() == value)
                return temp;
            temp = temp.getNext();
        }

        return null;
    }
    public int getLastNodeValue(){
        Node temp=head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        return  temp.getData();
    }
    public int getFirstNodeValue(){
        return head.getData();
    }
    public void reverseList(){
        if(isEmpty())
            return;

        LinkList l2=new LinkList();
        Node temp=head;
        while(temp!=null){
            l2.insertAtStart(getFirstNodeValue());
            temp=temp.getNext();
            removeFromStart();
        }
        head=l2.getHead();
    }
    public void sortAscending(){
        if(isEmpty())
            return;

        int length=getLength();
        int[] array=new int[length];
        for(int i=0;head!=null;i++){
                array[i]=getFirstNodeValue();
                removeFromStart();
        }

       for (int i=0;i<length;i++){
            for (int j=0;j<length-1;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }

        for (int i=0;i<length;i++){
            insertAtStart(array[i]);
        }
    }
    public void sortDescending(){
        if(isEmpty())
            return;

        int length=getLength();
        int[] array=new int[length];
        for(int i=0;head!=null;i++){
            array[i]=getFirstNodeValue();
            removeFromStart();
        }

        for (int i=0;i<length;i++){
            for (int j=0;j<length-1;j++){
                if(array[j]<array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }

        for (int i=0;i<length;i++){
            insertAtLast(array[i]);
        }
    }
}