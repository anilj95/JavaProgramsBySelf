package LinkedListSingly;

//Without actually reversing LinkedList,Print data in reverse order.
public class PrintReverse {

	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void reversePrint(Node p) {

		if (p == null) {

			return;
		} else {

			reversePrint(p.next);
			System.out.println(p.data + " ");

		}
	}

	// Inserts a new Node at front of the list.
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	public int length() {

		Node temp;

		temp = head;

		int count = 0;

		while (temp != null) {

			count++;

			temp = temp.next;
		}

		return count;

	}

	public static void main(String[] args) {

		// Let us create linked list 1->2->3->4
		PrintReverse llist = new PrintReverse();
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		llist.reversePrint(llist.head);
		
		System.out.println("Length of List is:"+llist.length()+" ");

	}

}
