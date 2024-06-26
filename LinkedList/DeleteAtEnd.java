   class LinkedList{
       Node head;

     void append(Node node){
         if(head==null){
             head=node;
         }else{
             Node temp = head;
             while(temp.next!=null){
                 temp=temp.next;
             }
             temp.next=node;
         }
     }

     void display(){
         Node temp=head;
         System.out.printf("%4s%10s%6s\n","ID"," Name", " Gender");
         while(temp!=null){
             System.out.printf("%4d %10s %6s\n",temp.id,temp.name,temp.gender);
             temp=temp.next;
         }
     }

    void pop(){
        
        Node temp = head;
        if(head==null){
            System.out.println("The linked list is empty");
            return;
        }
        if(temp.next==null){
            head=null;
        }else{
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

        }
        

    }
    boolean isEmpty(){
        if(head==null) return true;
        return false;
    }
   }
