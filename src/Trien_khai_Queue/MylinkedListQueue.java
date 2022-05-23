package Trien_khai_Queue;

public class MylinkedListQueue extends Node {
    private Node head;
    private Node tail;

    public MylinkedListQueue(){
        this.head = null;
        this.tail = null;
    }

    public void  enqueue(int key){
        Node temp = new Node(key);
        if (this.tail == null){
            this.head = this.tail =temp;
            return;
        }
        this.tail.setNext(temp);
        this.tail = temp;
    }

    public Node dequeue(){
        if (this.head == null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.getNext();
        if (this.head == null){
            this.tail =null;
        }
        return temp;
    }
}
