class Palindrome{
    public Node newNode(int data) {
	//Fill your code here
    Node node=new Node(data);
        return node;
    }

    // public Node reverseList(Node head) {
    //    //Fill your code here

    //     return null;
    // }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node list is always a palindrome
        }

        // Find the middle of the linked list
        Node slow = head;
        Node fast = head;
        Node prevSlow = null;
        Node midNode = null; // To handle odd size list
        boolean isOdd = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prevSlow = slow;
            slow = slow.next;
        }

        // Handling the odd size list
        if (fast != null) {
            midNode = slow;
            slow = slow.next;
            isOdd = true;
        }

        // Reverse the second half of the list
        Node secondHalf = slow;
        prevSlow.next = null; // End first half
        secondHalf = reverse(secondHalf);

        // Compare both halves
        boolean result = compareLists(head, secondHalf);

        // Restore the list (optional)
        secondHalf = reverse(secondHalf);
        if (isOdd) {
            prevSlow.next = midNode;
            midNode.next = secondHalf;
        } else {
            prevSlow.next = secondHalf;
        }

        return result;
    }

    // Method to reverse the linked list
    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Method to compare two linked lists
    private boolean compareLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // If both are null, lists are equal
        return (temp1 == null && temp2 == null);
    
}

    public int count(Node node){
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
        return count;
    }

    public void displayList(Node node) {
        //Fill your code here
        if(node==null) return;
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }
}
