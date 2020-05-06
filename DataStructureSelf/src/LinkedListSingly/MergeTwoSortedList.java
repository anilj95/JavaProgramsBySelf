package LinkedListSingly;

public class MergeTwoSortedList {

	static Node head;

	public static void main(String[] args) {

		MergeTwoSortedList llist1 = new MergeTwoSortedList();
		MergeTwoSortedList llist2 = new MergeTwoSortedList();

		// Creating LinkedList 1
		// Node head1 = new Node(5);
		llist1.addToTheLast(new Node(5));
		llist1.addToTheLast(new Node(10));
		llist1.addToTheLast(new Node(15));

		// Creating LinkedList 2
		// Node head2 = new Node(2);
		llist2.addToTheLast(new Node(2));
		llist2.addToTheLast(new Node(3));
		llist2.addToTheLast(new Node(20));

		llist1.head = mergeLists2(llist1.head, llist2.head);

		llist1.printList();

	}

	/* Link list node */
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/*
	 * Method to insert a node at the end of the linked list
	 */
	public void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	/* Method to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	private static Node mergeLists(Node head1, Node head2) {

		Node newHead = null;

		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		if (head1.data < head2.data) {

			newHead = head1;
			head1 = head1.next;
		} else {

			newHead = head2;
			head2 = head2.next;
		}
// Leave newHead to point at Head of new LinkedList & create other node(here current) to do next iteration.
		Node current = newHead;

		while (head1 != null && head2 != null) {

			if (head1.data < head2.data) {

				current.next = head1;
				head1 = head1.next;
			} else {

				current.next = head2;
				head2 = head2.next;
			}

			current = current.next;
		}

		if (head1 == null) {

			current.next = head2;
		} else {

			current.next = head1;
		}

		return newHead;

	}

	// Method2: Using Recursion
	private static Node mergeLists2(Node headA, Node headB) {
		
		boolean x=true;
		if (x==false)
			return null;
		else if (headA != null && headB == null)
			return headA;
		else if (headA == null && headB != null)
			return headB;
		else if (headA.data < headB.data) {
			headA.next = mergeLists2(headA.next, headB);
			return headA;
		} else {
			headB.next = mergeLists2(headA, headB.next);
			return headB;

		}
	}
}
