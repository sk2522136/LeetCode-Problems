class MyQueue {

    private class Node {
        int val;
        Node next;
        Node(int v) { val = v; next = null; }
    }

    private Node head;  
    private Node tail; 

    public MyQueue() {
        head = null;
        tail = null;
    }

    public void push(int x) {
        Node newNode = new Node(x);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
    }

    public int pop() {
        int val = head.val;
        head = head.next;
        if (head == null) tail = null;
        return val;
    }

    public int peek() {
        return head.val;
    }

    public boolean empty() {
        return head == null;
    }
}
