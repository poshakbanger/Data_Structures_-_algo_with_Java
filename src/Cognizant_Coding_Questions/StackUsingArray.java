package Cognizant_Coding_Questions;

public class StackUsingArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public StackUsingArray(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push an element onto the stack
    public void push(int value){
        if (top == maxSize - 1){
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println(value + " pushed to stack");
    }

    // Pop an element from the stack
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return -1; // or throw exception
        }
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i<= top; i++){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();    // Stack elements: 10 20 30

        System.out.println("Top element is: " + stack.peek()); // 30

        stack.pop();
        stack.display();    // Stack elements: 10 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
