package main.week5.date221019;


import java.util.Arrays;

public class MyStack {
    private int[] stack;
    private int top;
    private int size;

    public MyStack(int size) {
        this.size = size;
        stack = new int[this.size];
        top = -1;
    }

    public void push(int item) {
        if (!isFull()) {
            stack[++top] = item;
        } else {
            System.out.println("Full Stack");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            stack[top--] = 0;
        }
        System.out.println("Empty Stack");
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println(stack[top]);
        } else {
            System.out.println("Empty Stack");
        }
    }

    public void search(int idx) {
        if (idx <= top) {
            System.out.println(stack[idx]);
        } else {
            System.out.println("Fail");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == (stack.length-1);
    }

    public void print() {
        System.out.println(Arrays.toString(stack));
    }

    public void clear() {
        stack = new int[size];
    }
}
