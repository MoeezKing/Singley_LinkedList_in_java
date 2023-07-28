import LinkListData.LinkList;
public class Main {
    public static void main(String[] args) {
        LinkList l1=new LinkList();
        l1.insertAtStart(1);
        for(int i=0;i<=10;i++){
            l1.insertAtLast(i);
        }
        l1.insertAtLast(-1);
        //l1.removeFromLast();
        l1.removeFromStart();;
        l1.printList();
        System.out.println("Length is "+ l1.getLength());
    if(l1.searchValue(5))
        System.out.println("available");
    else
        System.out.println("Not available");
    l1.reverseList();
    l1.printList();
    l1.sortDescending();
    l1.printList();
    }


}