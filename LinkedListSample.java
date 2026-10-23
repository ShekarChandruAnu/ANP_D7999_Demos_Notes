package com.dsu.play;
class Node
{
	String nodeData;// Dealer dealer
	Node nextNode;
}
public class LinkedListSample {

	Node headNode = null;
	Node curNode = null;
	public void traverseLIst()
	{
		curNode = headNode;
		if(headNode == null)
		{
			System.out.println("Empty List...");
		}
		else
		{
			while(curNode != null)
			{
			
				System.out.println("Data "+curNode.nodeData);
				curNode = curNode.nextNode;
			}
		}
	}
	public void insertAtFront(String data)
	{
		Node newNode = new Node();
		newNode.nodeData = data;
		newNode.nextNode = headNode;
		headNode = newNode;
		
		
	}
	public void insertAtEnd(String data)
	{
		Node newNode = new Node();
		newNode.nodeData = data;
		curNode = headNode;
		while(curNode.nextNode != null)
		{
			curNode = curNode.nextNode;
		}
		curNode.nextNode = newNode;
	}
	public void deleteAtFront()
	{
		headNode = headNode.nextNode;
	}
	public void deleteAtEnd()
	{
		if(headNode.nextNode == null)
		{
			headNode = null;
		}
		curNode = headNode;
		while(curNode.nextNode.nextNode != null)
		{
			curNode = curNode.nextNode;
		}
		curNode.nextNode = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListSample lls = new LinkedListSample();
		lls.insertAtFront("100");
		lls.insertAtEnd("200");
		lls.insertAtEnd("300");
		lls.insertAtEnd("400");
		lls.insertAtEnd("500");
		
		lls.traverseLIst();
		System.out.println("------");
		lls.deleteAtFront();
		lls.traverseLIst();
		System.out.println("------");
		lls.deleteAtEnd();
		lls.traverseLIst();

	}

}
