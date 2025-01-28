



public  class toConvertcir{
    static class Node{
        int data;
        Node next;
    }
    static Node cirCular(Node head){
        Node start = head;
        while(head.next != null)
        head = head.next;
        

        head.next = start;
        return start;
    }
    static Node push(Node head, int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        return head;

    }
    static void displayList(Node node){
        Node start = node;
        while(node.next != start){
            System.out.println(" " + node.data);
            node = node.next;
        }
        System.out.println(" " + node.data);
    }
    public static void main(String[] args) {
        Node head = null;
        head = push(head, 23);
        head = push(head, 24);
        head = push(head, 25);
        head = push(head, 26);
        head = push(head, 53);
        cirCular(head);
        displayList(head);
    }
    
     
}
