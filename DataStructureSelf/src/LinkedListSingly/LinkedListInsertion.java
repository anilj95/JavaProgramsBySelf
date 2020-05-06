package LinkedListSingly;

public class LinkedListInsertion {

	 // This is root Node, which is the start of any LinkedList. It is global Variable.
	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static class Node {

		// link field of Node(next) is of type Node, coz it will point to any other
		// Node.
		// By default it's value is null, coz which Node it will point is not decided
		// during creating of new Node.

		int data;
		Node next;

		// Constructor
		Node(int d) {

			this.data = d;
			next = null;
		}
	}
//Time complexity:O(1)
	private static void insertAtBegin(int data) {

		Node newNode = new Node(data);
		
		if(head==null) {
			
			head = newNode;
		}else {
			//right side connection
			newNode.next = head;
			
			//Left side connection
			head= newNode;
		}
		
		
		
	}

	//Time complexity:O(1)
	private static void insertAfter(Node prev, int data) {
		
		if(prev==null) {
			
			System.out.println("No such Node exist");
		}else {
			
			Node newNode = new Node(data);
			// right side Connection
			newNode = prev.next;
			
			// left side Connection
			prev.next = newNode;
		}

	}

	//Time complexity:O(n)
	private static void insertAtEnd(int data) {
		
	  Node newNode = new Node(data);
		
		if(head==null) {
			
			head = newNode;
		}else {
			
			Node last = head;
			//Traverse till end, then add. Time complexity:O(n)
			while(last!=null) {
				
				last = last.next;
			}
			
			last = newNode;
		}

	}

	public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    }
}
