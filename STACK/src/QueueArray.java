public class QueueArray {
    int[] arr;
    int front;
    int rear;
    int size;

    public QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Add element
    public void add(int data) {

        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }

        if (front == -1)
            front = 0;

        arr[++rear] = data;
    }

    // Remove element
    public int remove() {

        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int value = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }

        return value;
    }

    // Front element
    public int peek() {

        if (isEmpty())
            return -1;

        return arr[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        QueueArray q = new QueueArray(5);

        q.add(10);
        q.add(20);
        q.add(30);

        q.display();

        System.out.println("Removed: " + q.remove());

        q.display();

        System.out.println("Front: " + q.peek());
    }
}