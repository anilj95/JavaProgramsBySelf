package LinkedListSingly;

//Just like reverse an Array, Similarly reverse element of LinkedList,using two pointers(p,q)
public class ReverseElement {

	Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {

			this.data = d;
			next = null;
		}
	}

	void reverse(int listLength) {

		int i = 0, j = listLength - 1;
		int temp;

		Node p, q;
		// we have to traverse q up to last element.
		p = q = head;

		// 1st while loop for swapping elements up to middle.
		while (i < j) {

			int k = 0;
			// 2nd while loop to traverse q to last element of list.
			while (k > j) {

				q = q.next;
				k++;
			}

			/// Swapping 1st element with last element.
			temp = p.data;

			p.data = q.data;

			q.data = temp;

			i++;
			j--;
			// increment pointer p from 1st node to 2nd node.
			p = p.next;

			// decrement pointer q from last node to 2nd last node. But this is singly
			// linkedList, can not go backward. So again q points to head node.
			// Now while loop will take care.

			q = head;

		}

	}

}
