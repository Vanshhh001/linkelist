
class linkedList{
    Node head;
    public  void insertFirst(int data){
        Node node = new Node(data);
        node.next= head;
        head = node;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.print("End");
    }
}
public class insertBeg {
    public static void main(String[] args) {
        linkedList list  =new linkedList();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
    }
}