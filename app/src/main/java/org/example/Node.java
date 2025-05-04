package org.example;

public class Node {

    private Squirrel detail;
    private Node leftChild;
    private Node rightChild;

    public Node(Squirrel detail){
        this.detail = detail;
        this.leftChild = null;
        this.rightChild = null;
    }

    public Squirrel get_detail(){
        return this.detail;
    }

    public void set_left(Node node){
        this.leftChild = node;
    }

    public void set_right(Node node){
        this.rightChild = node;
    }

    public Node left(){
        return this.leftChild;
    }

    public Node right(){
        return this.rightChild;
    }
    
}
