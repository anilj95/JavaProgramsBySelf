package LinkedListSingly;

public class LinkedListReverse {

	
	Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data=data;
			next=null;
		}

		
	}
	
	//Method1: Iterative method: using 3 pointer
	
	public void reverseIteratively() { 
		
		Node current = head;
		Node previous = null;
		Node forward = null;
		// traversing linked list until there is no more element 
		while(current.next != null){ 
			// Saving reference of next node, since we are changing current node 
			forward = current.next; 
			// Inserting node at start of new list 
			current.next = previous;
			previous = current;
			// Advancing to next node 
			current = forward;
			
		} 
		head = current;
		head.next = previous;
		
	}
	
	//Method2: Recursive method:for explanation: mycodeschool(youtube video)
	
		public void reverseRecursively(Node p) { 
			
			//Termination condition
			if(p.next==null) {
				
				head=p;
				return;
			}
			
			reverseRecursively(p.next);
			
			//After meeting termination condition,1st recursive call finished.
			//creating a pointer 'q', which will point last node(head)..
			Node q = p.next;
			//then break right side connection (pointing to null), started pointing 'p'(backward).
			q.next=p;
			//making 2nd last element to point null,after completing 1st recursion.
			//at last recursive call, last element should point null only.
			
			p.next=null;
			
			
			
		}
		
		
	}

	


