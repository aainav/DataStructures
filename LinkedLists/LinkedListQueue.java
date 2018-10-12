/**
   Add a method firstToLast to this implementation of a queue.
   The method moves the element at the head of the queue to
   the tail of the queue. The element that was second in line
   will now be at the head.
*/
public class LinkedListQueue
{
   private Node head;
   private Node tail;

   /**
      Constructs an empty queue.
   */
   public LinkedListQueue()
   {
      head = null;
      tail = null;
   }

   /**
      Moves the head of the queue to the tail.
   */
   public void firstToLast()
   {
       tail.next = head;
       tail = head;
       head = head.next;
       tail.next = null;
      



   }

   /**
      Checks whether this queue is empty.
      @return true if this queue is empty
   */
   public boolean empty()
   {
      return head == null;
   }

   /**
      Adds an element to the tail of this queue.
      @param newElement the element to add
   */
   public void add(Object newElement)
   {
       if (tail ==null) //head must also be null
       {
           Node newNode = new Node();
           newNode.data = newElement; //set to passed in data
           newNode.next = null; //cuz adding at the tail
           tail = newNode; 
           head = newNode;
           //both tail and head are equal to new node because there's only one thing in there
           //since tail and head == null
       }
       else
       {
           Node newNode = new Node();
           newNode.data = newElement;
           newNode.next = null;
           //in a queue, we always add to tail and remove from head
           tail.next = newNode; //because you're adding at the end of the list, which is element
           tail = newNode;
       }
   }

   /**
      Removes an element from the head of this queue.
      @return the removed element
   */
   public Object remove()
   {
       if (head == null)
       {
           return null;
       }
       
       Object element = head.data;
       head = head.next; //moving down ~ moves the head towards the tail
       
       if(head == null) //queue is empty ~ bcuz we moved head so need to update tal
       {
           tail = null;
       }
       return element;
       
   }
   
   class Node
       {
           public Object data;
           public Node next;
        }
}

