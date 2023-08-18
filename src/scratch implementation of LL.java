public class LL {
    Node head;
    private int size;
    LL(){
       size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //adding a node in first position or as a head
    public void addFirst(String data){
        size++;
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //adding at last position
    public void addLast(String data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!= null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    //deleting from first position
    public void deleteFirst(){
        if (head== null){
            System.out.println("List is empty");
        }
        head.next = head;
    }
    public void deleteLast(){
        if (head== null){
            System.out.println("List is empty");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            secondLast = secondLast.next ;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }
    public static void main(String[] args){
        LL linked = new LL();
        linked.addFirst("this");
        linked.addLast("is");
        linked.addLast("a");
        linked.addLast("list");
    }
}
