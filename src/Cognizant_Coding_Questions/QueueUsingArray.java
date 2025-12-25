package Cognizant_Coding_Questions;

public class QueueUsingArray {
    private int maxSize;  // Maximum size of the queue
    private int[] queueArray; // Array to store queue elements
    private int front;    // Points to the front element
    private int rear;     // Points to the last element
    private int currentSize; // Current number of elements

    // constructor
    public QueueUsingArray(int size){
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Enqueue: Add an element to the rear
    public void enqueue(int value){
        if (isFull()){
            System.out.println("Queue is Full! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        currentSize++;
        System.out.println(value + " enqueued to queue");
    }

    //Dequeue: Remove an element from the front
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty! Cannot dequeue");
            return -1;
        }
        int temp = queueArray[front];
        front = (front + 1) % maxSize; // Circular increment
        currentSize--;
        return temp;
    }

    // Peek: See the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return currentSize == maxSize;
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queueArray[(front + i) % maxSize] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5); // Create a queue of size 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Queue elements: 10 20 30

        System.out.println("Front element is: " + queue.peek()); // 10

        queue.dequeue();
        queue.display(); // Queue elements: 20 30

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.display(); // Queue elements: 20 30 40 50 60

        System.out.println("Is queue full? " + queue.isFull()); // true
    }
}
