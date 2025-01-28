/* 

class GFG {
    static class node 
    {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;

        }
    }
    static int countNodes (Node n){
        int res = 1;
        Node temp = n;
        while(temp.next != n){
            res++;
            temp = temp.next;
        }
        return res;
    }

    static int countNodesInLoop(Node list){
        Node slow_p = list, fast_p = list;
        while(slow_p != null && fast_p != null & fast_p.next != null){
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if(slow_p == fast_p)
                return countNodes(slow_p);
            
           
        }
        return 0;
    }
    static Node newNode(int key)
    {
        Node temp = new Node(key);
        return temp;
    }
    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(4);
        head.next.next.next= newNode(5);
        head.next.next.next.next = newNode(6);
        System.out.println(countNodesInLoop(head));
    }
}

*/

class GFG{
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next =null;
        }
    }
    public Node getIntersectionPoint(Node head1, Node head2){
        while(head1 != null){
            Node temp = head2;
            while(temp != null){
                if(head1 == temp )
                return head1;

                temp = temp.next;
            }
            head1 = head1.next;

        }
        return null;
        

    }
    public static void main(String[] args) {
        GFG list = new GFG();
        Node head1, head2;
        head2 = new Node(10);
        head1 = new Node(3);
        
        Node newNode = new Node(6);
        head1.next = newNode;

        newNode = new Node(9);
        head1.next.next = newNode;

        newNode = new Node(15);
        head1.next.next.next = newNode;
        head2.next = newNode;

        newNode = new Node(30);
        head1.next.next.next.next = newNode;
        head2.next.next = newNode;

        Node intersectionPoint = list.getIntersectionPoint(head1, head2);


        if(intersectionPoint == null){
            System.out.println("No intersection Point");

        }
        else{
            System.out.println("intersection point: " + intersectionPoint.data);
        }
    }
}