package com.sunbeam.one;

public class GrowableStack implements Stack{

	 private Employee[] stack;
	    private int top;

	    public GrowableStack() {
	        this.stack = new Employee[STACK_SIZE];
	        this.top = -1;
	    }

	    @Override
	    public void push(Employee emp) {
	        if (top == stack.length - 1) {
	            // Resize the stack
	            Employee[] newStack = new Employee[stack.length * 2];
	            System.arraycopy(stack, 0, newStack, 0, stack.length);
	            stack = newStack;
	        }
	        stack[++top] = emp;
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
