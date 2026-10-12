package com.sunbeam.one;

public class FixedStack implements Stack {

	private Employee[] stack;
    private int top;

    public FixedStack() {
        this.stack = new Employee[STACK_SIZE];
        this.top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top < STACK_SIZE - 1) {
            stack[++top] = emp;
        } else {
            System.out.println("Stack overflow!");
        }
    }

    @Override
    public Employee pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack underflow!");
            return null;
        }
    }
	
}
