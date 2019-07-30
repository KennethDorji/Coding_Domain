static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    
    if(head == null)    {
        head = newNode; 
    }

    else {
        SinglyLinkedListNode traversePtr = head; 

        while(traversePtr.next != null){
            traversePtr = traversePtr.next; 
        }
        traversePtr.next = newNode; 

    }
    return head; 

}
