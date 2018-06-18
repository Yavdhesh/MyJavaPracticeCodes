package com.array;

import java.util.HashMap;

public class LinkedListImplementation {
	
	Node head=null;
	 int count=0;
	private HashMap<Character,Object> DuplicateElement=null;

	
	public LinkedListImplementation() {
		super();
		this.head = new Node(' ');
		this.head.next=null;
		this.DuplicateElement=new HashMap<>();
		
	}
	
	
	public void add(Node tobeAdded){
		AddNode(head, tobeAdded);
	}
	
	public Node AddNode(Node head,Node tobeAdded){
		
		if(head==null){
			/*if(!this.DuplicateElement.containsKey(tobeAdded.value)){
				this.DuplicateElement.put(tobeAdded.value, Integer.valueOf(1));
			head=tobeAdded;
			count++;
			}*/
			head=tobeAdded;
			count++;
			return head;
		}else{
			head.next=AddNode(head.next, tobeAdded);
		}
		return head;
		/*while(null!=this.head.next){
			
			this.head=this.head.next;
			
		}
		
		Node n=this.head=tobeAdded;
		//System.out.println(n.value);
		*/
		
	}
	
	public int length()
	{
		return this.count;
	}
	
	public void printNodes(){
		/*for (Node i = this.head; i.next!=null; i=i.next) {
			System.out.println(i.value);
		}*/
		while(null!=head){
			System.out.println(head.value);
			head=head.next;
			
			
		}
	}
	
	public void removeDuplicate(){
	this.head=removeDuplicate(head,head.next.next);	
	
	}

	private Node removeDuplicate(Node head, Node nextTonext) {
		if(null != nextTonext){
			if(!this.DuplicateElement.containsKey(nextTonext.value)){
				
			}
		}
		
		
		return null;
	}

	public class Node{
		char value;
		Node next;
		public Node(char value) {
			super();
			this.value = value;
			this.next = null;
		}
		
		public char getValue() {
			return value;
		}
		public void setValue(char value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char array[]={'a','b','c','d','e','f','a','b','z'};
		
		LinkedListImplementation l= new LinkedListImplementation();
		for (int i = 0; i < array.length; i++) {
			l.add(l.new Node(array[i]));
		}
		
		//l.printNodes();
		
		/*for (Node n = l.head; n.next!=null; n=n.next) {
			System.out.println(n.value);
		}*/
		
		for (Node i=l.head; i !=null; i=i.next) {
			System.out.println("value"+i.value);
		}
		System.out.println(l.length());
		
		l.removeDuplicate();
		for (Node i=l.head; i !=null; i=i.next) {
			System.out.println("value"+i.value);
		}
	}

}
