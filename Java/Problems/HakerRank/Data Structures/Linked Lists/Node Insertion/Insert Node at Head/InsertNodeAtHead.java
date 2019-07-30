
static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data); 
    if(head == null)
        head = newNode; 
    
    else    {
        newNode.next = head; 
        head = newNode; 
    }

    return head; 
}