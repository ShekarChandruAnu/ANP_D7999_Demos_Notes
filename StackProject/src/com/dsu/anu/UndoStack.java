package com.dsu.anu;

public class UndoStack {

	int arr[];
	int maxSize;
	int curPointer;
	
	public UndoStack(int maxSize)
	{
		this.maxSize = maxSize;
		this.curPointer = -1;
		arr = new int[maxSize];
	}
	public boolean push(int data)
	{
		if(curPointer >= maxSize-1)
		{
			System.out.println("Stack is Over flow");
			return false;
		}
		else
		{
			arr[++curPointer] = data;
			System.out.println("Pushed Into Stack "+data);
			return true;
		}
	}
	public int pop()
	{
		int poppedElement  = 0;
		if(curPointer < 0)
		{
			System.out.println("Stack is Underflow");
		}
		else
		{
			poppedElement = arr[curPointer--];
			System.out.println("Popped Element "+poppedElement);
		}
		return poppedElement;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UndoStack uStack = new UndoStack(3);
		uStack.push(100); //curPointer = 0
		uStack.push(200); // 1
		uStack.push(300);//2    size 3  3-1 2
		uStack.push(400);
		uStack.pop();
		uStack.pop();
		uStack.pop();
		
		

	}

}
