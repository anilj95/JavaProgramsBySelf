package LinkedListSingly;

import LinkedListSingly.PrintReverse.Node;

public class LinkedListDeletion {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// this method will work for end at position & delete at end.
	private void deleteAfter(int nodeLocation, int listLength) {

		if (nodeLocation > listLength) {

			System.out.println("Node does not exist at that location");
		} else {

			Node p = head, q;

			int i = 1;

			while (i < nodeLocation - 1) {
				// traversing node p up to location-1
				p = p.next;
			}

			// q is the location to be deleted
			q = p.next;
			// previous to location is pointing to next to location, left side connection is
			// build.
			p.next = q.next;
			// setting location to point no where i.e null. right side connection is
			// deleted.
			q.next = null;

		}

	}

	private void deleteAtBegin(int nodeLocation, int listLength) {

		if (nodeLocation > listLength) {

			System.out.println("Node does not exist at that location");
		} 
		else if (nodeLocation == 1) {

			Node temp = head;

			head = temp.next;

			temp.next = null;

		}

	}
}
