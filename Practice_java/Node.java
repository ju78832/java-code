import java.util.HashSet;

/*  class Node {
    int item;
    Node left, right;


    public Node(int key){
        item = key;
        left = right = null;

    }
    
}
class BinaryTree {
    //Root of Binary Tree
    Node root;

    BinaryTree(){
        root = null;
    }

    void postorder(Node node) {
        if(node == null)
        return;


    // Traverse left 
    postorder(node.left);
    // Traverse right
    postorder(node.right);
    // Traverse root 
    System.out.println(node.item + "->");
    }

    void inorder(Node node) {
        if(node == null)
        return;
        // Traverse left 
        inorder(node.left);
        // Traverse root
        System.out.println(node.item + "->");
        // Traverse right 
        inorder(node.right);
    }
    void preorder(Node node) {
        if (node == null)
        return;
        // Traverse root 
        System.out.println(node.item + "->");
        // Traverse left
        preorder(node.left);
        // Traverse right
        preorder(node.right);

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);
        System.out.println("\n Preorder traversal");
        tree.preorder(tree.root);

        System.out.println("\n Postorder traversal");
        tree.postorder(tree.root);
    }
}
*/

/* 

// Binary Tree in Java

// Node creation
class Node {
    int key;
    Node left, right;
  
    public Node(int item) {
    key = item;
    left = right = null;
    }
  }
  
  class BinaryTree {
    Node root;
  
    BinaryTree(int key) {
    root = new Node(key);
   
    }
  
     BinaryTree() {
     root = null;
    }
  
    // Traverse Inorder
    public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.print(" " + node.key);
      traverseInOrder(node.right);
    }
    }
  
    // Traverse Postorder
    public void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.print(" " + node.key);
    }
    }
  
    // Traverse Preorder
    public void traversePreOrder(Node node) {
    if (node != null) {
      System.out.print(" " + node.key);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
    }
  
    public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
  
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
  
    System.out.print("Pre order Traversal: ");
    tree.traversePreOrder(tree.root);
    System.out.print("\nIn order Traversal: ");
    tree.traverseInOrder(tree.root);
    System.out.print("\nPost order Traversal: ");
    tree.traversePostOrder(tree.root);
    }
  }

  */


  /* 
  // Complete binary tree

  class Node {
    int data;
    Node left, right;

    Node(int item){
      data = item;
      left = right = null;
    }
  }

  class BinaryTree {
    Node root;
    // Count the number of nodes
    int countNumNodes(Node root) {
      if(root == null)
      return (0);
      return (1 + countNumNodes(root.left) + countNumNodes(root.right));

    }

    // check for complete binary tree
    boolean checkComplete(Node root, int index, int numberNodes) {

      if(root == null)
      return true;

      if(index >= numberNodes)
      return false;

      return (checkComplete(root.left, 2 * index + 1, numberNodes)
      && checkComplete(root.right, 2 * index + 2, numberNodes));
    }
    public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();

      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);
      tree.root.left.right = new Node(5);
      tree.root.right.left = new Node(6);

      int node_count = tree.countNumNodes(tree.root);
      int index = 0 ;
      if(tree.checkComplete(tree.root, index, node_count))
      System.out.println("The tree is a complete Binary tree");
      else
      System.out.println("The tree is not a complete binary tree");
    }
  }
  
  */

  // Question 1
// Java program to count number of nodes in a linked list

/* Linked list Node*/


class Node{
  Node next;
  int data;

  Node(int d){
    data = d;
    next = null;
  }
}
  class LinkedList{
    Node head;
    public void push(int new_data){
      Node new_node = new Node(new_data);
      new_node.next = head;
      head = new_node;

    }
    
    public int getCount(){
    Node temp = head;
    int count = 0;
    while(temp != null){
      count++;
      temp = temp.next;
    }
    return count;
    }
    
    public static void main(String[] args) {
      LinkedList llist = new LinkedList();
      llist.push(23);
      llist.push(12);
      llist.push(32);
      System.out.println("Length: " + llist.getCount());
    }
  
}
