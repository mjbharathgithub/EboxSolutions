class LinkedLists {
     public Node append(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    // Method to merge two linked lists after skipping n nodes in list1
    public Node skipNMergeList(Node list1, Node list2, int n) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node temp1 = list1;
        for (int i = 1; i < n && temp1.next != null; i++) {
            temp1 = temp1.next;
        }

        Node temp2 = temp1.next;
        temp1.next = list2;

        while (list2.next != null) {
            list2 = list2.next;
        }
        list2.next = temp2;

        return list1;
    }

    // Method to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void freeList(Node head) {
        while (head != null) {
            Node temp = head;
            head = head.next;
            temp = null;  
        }
    }
}
