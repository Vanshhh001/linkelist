class LinkedList{
    Node head;
    public void insertLast(int data){
        Node node = new Node(data);
        if(head==null){
            head=node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }

}
public class insertEnd{
    public static void main(String[] args) {
        LinkedList list  =new LinkedList();
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
    }
}