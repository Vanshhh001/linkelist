//search the key is present or not

public class searchingLL {
    static boolean searchkey(Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key)
                return true;
            curr = curr.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        int key = 10;
        if(searchkey(head,key))
            System.out.print("yes");
        else
            System.out.print("No");
    }


}