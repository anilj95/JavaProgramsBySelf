package LinkedListSingly;

public class MiddleOfLinkedList {

	static Node head;

	class Node {

		int data;
		Node next;

		Node(int d) {

			this.data = d;
			next = null;
		}
	}

	public void appendIntoTail(int data) {
		Node current = head;
		Node newNode = new Node(data);
		// find last element of LinkedList i.e. tail
		while (current.next != null) {
			current = current.next;
		} // appending new node to tail in LinkedList
		current.next = newNode;

	}

	private void addNode(int data) {

		Node newNode = new Node(data);

		newNode.next = head;

		head = newNode;

	}

	private void findMiddle() {

		Node slow = head, fast = head;

		if (head != null) {

			while (fast != null && fast.next != null) {

				slow = slow.next;
				fast = fast.next.next;
			}

			System.out.println("Middle Node is: " + slow.data);

		}
	}

	private void printList() {

		Node pNode = head;

		while (pNode != null) {

			System.out.println(pNode.data + " ");

			pNode = pNode.next;
		}

	}

	private boolean isLoopExit() {

		Node fast = head, slow = head;

		if (head != null) {

			while (fast != null && fast.next != null) {

				slow = slow.next;
				fast = fast.next.next;

				if (fast == slow) {

					return true;
				}
			}
		}
		return false;

	}

	private int findkthNodeFromLast(int node) {

		Node slow = head, fast = head;
		int start = 1;
		while (fast.next != null) {

			fast = fast.next;
			start++;

			if (start > node) {

				slow = slow.next;
			}

		}

		return slow.data;
	}

	public int length() {
		int count = 0;
		Node current = head;
		while (current != null) {

			count++;
			current = current.next;

		}
		return count;

	}
	
	//recursive method:
	public int length(Node current){ 
		
		current = head;
		if(current == null){ 
			//base case 
			return 0; 
			} 
		
		return 1+length(current.next);
		
	}
		
	

		

	public static void main(String[] args) {

		MiddleOfLinkedList mdll = new MiddleOfLinkedList();

		for (int i = 5; i > 0; i--) {

			mdll.addNode(i);

		}

		mdll.appendIntoTail(10);
		mdll.printList();
		mdll.findMiddle();
		System.out.println("is Loop Exit: " + mdll.isLoopExit());
		int node = mdll.findkthNodeFromLast(2);

		int length = mdll.length(head);

		System.out.println("Kth Node is: " + node);
		System.out.println("List length is: " + length);

	}

}
