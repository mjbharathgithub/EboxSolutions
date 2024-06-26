class LinkedList extends Node{
    //Fill your code here
    

    void addatbeg(Node node) {
		if(head==null){
			head=node;
		}else{
			node.next=head;
            head=node;
		}
    }

    public void display() 
    	{ 
        /* Fill your code here */  
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.id+"       "+temp.name+" "+temp.gender);
			temp=temp.next;
		}

	}

}
   
