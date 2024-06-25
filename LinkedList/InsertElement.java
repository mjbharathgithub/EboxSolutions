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
		LinkedList temp  = head;int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public void addafter(int data,int pos)
	{
	/* Fill your code here */
	if(pos<this.count()){
	LinkedList temp = head;
	LinkedList list = new LinkedList();
	int i=0;
	while(i<pos){
		temp=temp.next;
		i++;
	}
	list.next=temp.next;
	list.data=data;
	temp.next=list;
	}else{
		System.out.println("There are less than "+pos+" elements in the linked list");

	}}
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
        System.out.println("Do you want to append another node? Type Yes/No");
        ch = sc.nextLine();
        }while(ch.equals("Yes")); 

        //Fill your code here
        System.out.print("The elements in the linked list are  ");
        list.display();
        System.out.println();

	do
	{
	System.out.println("Enter the position after which you want to add another node"); 
	int pos = sc.nextInt();
	System.out.println("Enter the value"); 
	int value = sc.nextInt();
	//Fill your code here
        sc.nextLine();
        list.addafter(value,pos);
        System.out.print("The elements in the linked list are  ");
        list.display();
	System.out.println("\nDo you want to add another node after a certain position? Type Yes/No");
        ch = sc.nextLine();
        }while(ch.equals("Yes"));

        

	}
}
