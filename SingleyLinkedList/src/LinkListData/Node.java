package LinkListData;

public class Node {
    int data;
    Node next;
    public Node(){
        this.data=-99999999;
        this.next=null;
    }
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
