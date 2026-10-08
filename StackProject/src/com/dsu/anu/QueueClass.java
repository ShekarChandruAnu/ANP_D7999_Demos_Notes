package com.dsu.anu;

public class QueueClass {
	
	int maxSize;
	int front;
	int rear;
	int arr[] ;
	
	public QueueClass(int maxSize)
	{
		front = -1;
		rear = -1;
		this.maxSize = maxSize;
		arr = new int[maxSize];
	}
	public boolean isFull()
	{
		if(rear >= maxSize-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(front < 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void enQueue(int data)
	{
		if(!isFull())
		{
			rear++;
			arr[rear] = data;
			System.out.println("Enqueued Data "+data);
				if(front == -1)
				{
					front = 0;
				}
		}
		else
		{
			System.out.println("Queue is OverFlow");
		}
	}
	public void deQueue()
	{
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
