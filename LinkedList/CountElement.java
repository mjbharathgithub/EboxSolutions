import java.util.*;

public class LinkedList{
	/* Fill your code here */  
	LinkedList head,next;
	int data;
    
    	public void addNode(int data) {
        /* Fill your code here */
		LinkedList list = new LinkedList();
		if(head==null){
			list.data=data;
			list.next=null;
			head=list;
		}else{
			LinkedList temp = head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=list;
			list.data=data;
		}
    	}

	public void display() 
    	{ 
        /* Fill your code here */  
		LinkedList temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}

	}

	public int count(){
	/* Fill your code here */ 
	int count=0;
	LinkedList temp = head;
	while(temp!=null){
		count++;
		temp=temp.next;
	}
	return count;
	}
}

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch="";
        LinkedList list = new LinkedList();
        do{
        System.out.println("Enter the value");
        int n = sc.nextInt();
        sc.nextLine();
        //Fill your code here
        list.addNode(n);
        System.out.println("Do you want to add another node? Type Yes/No");
        ch = sc.nextLine();
        }while(ch.equals("Yes")); 
        System.out.print("The elements in the linked list are ");
	    //Fill your code here
        list.display();
        System.out.println("The number of elements in the linked list is "+list.count());
	} 
}
