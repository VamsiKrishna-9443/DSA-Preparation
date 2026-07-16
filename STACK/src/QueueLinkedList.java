public class QueueLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    // Constructor
    public QueueLinkedList() {
        front = null;
        rear = null;
    }

    // Enqueue (Insert)
    public void enqueue(int data) {

        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue (Remove)
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;
        front = front.next;

        // Queue becomes empty
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Peek (Front Element)
    public int peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

    // Check Empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display Queue
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Front Element: " + q.peek());

        System.out.println("Removed: " + q.dequeue());

        System.out.print("Queue: ");
        q.display();
    }
}