package com.dsu.anu;

public class OrderQueue {
	
	int arr[];
	int front;
	int rear;
	int maxSize;
	
	public OrderQueue(int maxSize)
	{
		this.maxSize = maxSize;
		arr = new int[maxSize];
		front = -1;
		rear = -1;
		
	}
	public boolean isFull()
	{
		if (rear >= maxSize-1)
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
	
	public void enqueue(int orderNo)
	{
		if(!isFull())
		{
			rear++;
			arr[rear] = orderNo;
			System.out.println("The Enqueued Data "+orderNo);
			if(front == -1)
			{
				front = 0;
			}
		}
		else
		{
			System.out.println("Queue is OverFlow/Full...");
		}
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Sorry Queue is Empty...");
		}
		else
		{
			System.out.println("Dequeued Element "+arr[front]+" Deleted");
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front++;
			}
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderQueue orderQueue = new OrderQueue(5);
		orderQueue.enqueue(100);
		orderQueue.enqueue(200);
		orderQueue.enqueue(300);
		orderQueue.enqueue(400);
		orderQueue.enqueue(500);
		orderQueue.enqueue(600);
		orderQueue.dequeue();
		orderQueue.dequeue();
		orderQueue.dequeue();
		orderQueue.dequeue();
		orderQueue.dequeue();
		orderQueue.dequeue();

	}

}
