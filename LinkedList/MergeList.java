Aclass LinkedList {
    Node head;

    // Method to add a node at the end of the list
    void add(int data) {
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
    }

    // Method to display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Method to merge list2 into list1 after 'n' nodes
    void skipNMergeList(LinkedList list2, int n) {
        Node temp1 = head;
        for (int i = 1; i < n && temp1 != null; i++) {
            temp1 = temp1.next;
        }

        if (temp1 != null) {
            Node temp2 = temp1.next;
            temp1.next = list2.head;

            // Traverse to the end of list2 and link the remaining part of list1
            Node temp2List2 = list2.head;
            while (temp2List2.next != null) {
                temp2List2 = temp2List2.next;
            }
            temp2List2.next = temp2;
        }
    }
}
