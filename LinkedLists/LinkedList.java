
import java.util.NoSuchElementException;
//import java.util.IllegalStateException;
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedList
{
    /** description of instance variable x (add comment for each instance variable) */
    private Node first; //where the first element is -- only thing the LinkedList needs to know ~ with first, LinkedList can figure out second and so forth with next()
    
    //LinkedList needs to know all nodes, can't make public because then everyone can access it --> make an inner class like Node
    //can access public data of Node in LL only
    class Node
    {
        //Old School
        //Any Object into and out of our LinkedList
        //cast to type the object as we remove ~ doesn't have any defined type like an ArrayList so any object can go there ~ every class inherits from Object
        public Object data; 
        public Node next; 
        //singly linked list
    }
    
    /**
     * Default constructor for objects of class LinkedList
     */
    public LinkedList()
    {
        // initialise instance variables
        first = null; //if we create the LinkedList and nothing is in there, we'll throw an exception
    }
    
    /**
     * Adds an element to the front of the LinkedList
     * @param element the element to add
     */
    public void addFirst(Object element)
    {
        Node newNode = new Node();
        newNode.data = element; //points to Object data ~ element's being polymorphic
        newNode.next = first;  //next = a node ~ reference to what was first
        first = newNode; //first is a Node
    }
    
     public void faultyAddFirst(Object element) 
    {
        Node newNode = new Node();
        first = newNode; 
        newNode.data = element; 
        newNode.next = first; 
    }
    
       /**
     * Reverses the List linkes
     * e16.1
     */
    public void reverse()
    {
       if (first== null) return; 
       
       Node previous = first; 
       Node current = first.next; 
       first.next = null; 
       while (current != null) 
       {
           Node next = current.next; 
           current.next = previous; 
           previous = current; 
           current = next; 
        }
       first = previous; 
    }
    
    /**
     * 
     */
    public int size() 
    {
        int count= 0; 
        //if (first== null) return count; 
        
        Node temp = first; 
        //count++; 
        
        while(temp!= null)
        {
            count++;
            temp=temp.next;
        }
        
        return count; 
    }
 
    
    public String toString() 
    {
        ListIterator iter = this.listIterator(); 
        String returnString = ""; 
        while (iter.hasNext()) 
        {
            returnString += iter.next() + " ";
        }
        return returnString; 
    }
    
    /**
     * Returns the first element in the LinkedList
     * @return the first element in the LinkedList
     */
    
    public Object getFirst()
    {
        //returning the element
        if (first == null){throw new NoSuchElementException();} //has to have something in there to return it ~ return data
        {
            return first.data;
        }
    }
    
    /**
     * Removes the first element in the LinkedList
     * @return the removed element
     */
    public Object removeFirst()
    {
        //1) find first 2)find out about the next element & 3) hide first
        if (first == null){throw new NoSuchElementException();} //has to have something in there to return it ~ return data
        {
            Object element = first.data; //temporary element
            first = first.next; //the next guy
            return element;
        }
    }
    
    public ListIterator listIterator()
    {
        return new LinkedListIterator(); //have to return the LinkedList
    }
    
    class LinkedListIterator implements ListIterator //could implement Iterator class but we don't need the extra methods so we don't use that
    {
        private Node position;
        private Node previous; //so we can remove
        private boolean isAfterNext; //you have to call next before removing
        
        public LinkedListIterator()
        {
            position = null; //we don't know anything yet so
            previous = null; //just for deletin
            isAfterNext = false; //we haven't called next yet
        }
        
        public Object next()
        {
            if (!hasNext()){throw new NoSuchElementException();}
            previous = position; //so I can remove item
            isAfterNext = true; //because we just called next
            if (position == null) //if I just started or ended the list
            {
                position = first; //address/reference to Objects
                //first is aspect of LinkedList, so not using dot operator to get Node's attributes
            }
            else //if not at beginning or end of the list
            {
                position = position.next;
            }
            //LinkedList doesn't have easy random access, it's the way to go for inserting elements
            return position.data;
        }
        
        /**
          * tests if there is an element after the iterator position
          * @return true if there is an element after the iterator position
          */
        public boolean hasNext()
        {
            if (position == null)
            {
                return first != null; //returns a boolean
                //nothing is in our list
            }
            else
            {
                return position.next != null; 
                //it's trying to see if we're at the end of our list
            }
        }
        
        /**
         * faulty version of hasNext()
         * @return supposed to return true if there is an element after the iterator position
         */
        public boolean faulty_hasNext()
        {
            //E16.3
            return position != null;
        }
        
         /**
           * Adds an element before the iterator position and moves the iterator past the inserted element
           * @param element, the element to add
           */
        public void add(Object element)
        {
            if(position == null)
            {
                addFirst(element);
                position = first; //we're add first
            }
            else
            {
                //have to make Object a node
                Node newNode = new Node();
                newNode.data = element; //Node points at element now
                newNode.next = position.next; //got to point to the guy you just added
                //position points to newNode because that's what you know
                position.next = newNode;
                position = newNode; 
                //just for removal, I got to keep track of old guy with position, while next always move forward
            }
            
            isAfterNext = false;
        }
    
        /**
          * Removes the last traversed element. This method may only be called after a call to next()
          */
        public void remove()
        {
            if(!isAfterNext){throw new IllegalStateException();}
            
            if(position == first)
            {
                removeFirst();
            }
            else
            {
                previous.next = position.next;
            }
            position = previous; //position is equal to previous
            isAfterNext = false;
            
        }
    }
}
