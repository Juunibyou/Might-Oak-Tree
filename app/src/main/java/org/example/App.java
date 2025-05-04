package org.example;

public class App {
    public static void main(String[] args){

        Squirrel cheeks = new Squirrel("Cheeks");
        Node nodeOne = new Node(cheeks);
        
        Squirrel squeaks = new Squirrel("Squeaks");
        Node nodeTwo = new Node(squeaks);
        
        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node nodeThree = new Node(fluffybutt);
        
        nodeOne.set_left(nodeTwo);
        nodeOne.set_right(nodeThree);
        
        Node retrievedLeft = nodeOne.left(); 
        Node retrievedRight = nodeOne.right();

        System.out.println("Left child: " + retrievedLeft.get_detail().getName());
        System.out.println("Right child: " + retrievedRight.get_detail().getName());

        System.out.println("\nTraversal: ");
        traverse(nodeOne);

    }

    public static void traverse(Node node) {
        if (node != null) {
          System.out.println("Squirrels: " + node.get_detail().getName());
          traverse(node.left());
          traverse(node.right());
        }
    }
}
