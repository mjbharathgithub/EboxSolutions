import java.util.*;
public class LinkedList{
	LinkedList head,next;
	int data;
	public void addNode(int data){
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

	

	public int search(int element)
	{
	/* Fill your code here */
	LinkedList temp  = head;
	while(temp!=null){
		if(element==temp.data) return 1;
		temp = temp.next;
	}
	return 0;
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
        //Fill your code here
        sc.nextLine();
        list.addNode(n);
        System.out.println("Do you want to add another node? Type Yes/No");
        ch = sc.nextLine();
        }while(ch.equals("Yes")); 

        //Fill your code here
        System.out.println("The elements in the linked list are ");
        list.display();

	System.out.println("Enter the element to be searched"); 
	int element = sc.nextInt();
	//Fill your code here
    if(list.search(element)==1){
        System.out.println(element+" is present in the linked list");
    }else{
        System.out.println(element+" is not present in the linked list");
    }
	}
}
