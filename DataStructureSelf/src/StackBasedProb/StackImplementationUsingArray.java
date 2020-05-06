package StackBasedProb;

public class StackImplementationUsingArray {

	int[] stack;
	int top = -1;
	int size = 5;

	public static void main(String[] args) {

		StackImplementationUsingArray starry = new StackImplementationUsingArray();
		starry.createStack();
		starry.push(1);
		starry.push(3);
		starry.push(5);
		starry.push(7);
		starry.push(9);
		// starry.push(6);
		// int value =starry.pop();

		System.out.println(starry.pop());
		System.out.println(starry.pop());
		// System.out.println(starry.pop());

		starry.traverse();

	}

	private void createStack() {

		stack = new int[size];

	}

	private boolean isEmpty() {

		if (top == -1) {

			return true;
		} else {

			return false;
		}
	}

	private boolean isFull() {

		if (top == size - 1) {

			return true;
		} else {

			return false;
		}
	}

	private void push(int num) {

		if (isFull()) {

			System.out.println("Stack is Full");
		} else {

			top++;
			stack[top] = num;
		}
	}

	private int pop() {
		int value = 0;

		if (isEmpty()) {

			System.out.println("Stack is Empty");
		} else {

			value = stack[top];
			top--;
		}

		return value;
	}

	private int peek() {
		int value = 0;

		if (isEmpty()) {

			System.out.println("Stack is Empty");
		} else {

			value = stack[top];

		}

		return value;
	}

	private void traverse() {

		for (int i = 0; i <= top; i++) {

			System.out.println(stack[i]);
		}

	}

}
