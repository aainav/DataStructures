import java.util.NoSuchElementException;

/**
   An implementation of a queue as a circular array.
*/
public class CircularArrayQueue
{
   private Object[] elements;
   private int currentSize;
   private int head;
   private int tail;

   /**
      Constructs an empty queue.
   */
   public CircularArrayQueue() 
   {
      final int INITIAL_SIZE = 10;
      elements = new Object[INITIAL_SIZE];
      currentSize = 0;
      head = 0;
      tail = 0;
   }

   /**
      Checks whether this queue is empty.
      @return true if this queue is empty
   */
   public boolean empty() { return currentSize == 0; }

   /**
      Adds an element to the tail of this queue.
      @param newElement the element to add
   */
   public void add(Object newElement)
   {
      growIfNecessary();
      currentSize++; //number of elements
      elements[tail] = newElement;
      tail = (tail + 1) % elements.length; //moves tail to the beginning
      //moves to whatever open spot due to remove(), if none then adds to the end
   }

   /**
      Removes an element from the head of this queue.
      @return the removed element
   */
   public Object remove() 
   {
      if (currentSize == 0) { throw new NoSuchElementException(); }
      Object removed = elements[head];
      head = (head + 1) % elements.length;
      currentSize--;
      return removed;
   }

   /**
      Grows the element array if the current size equals the capacity.
   */
   private void growIfNecessary()
   {
      if (currentSize == elements.length)
      {
         Object[] newElements = new Object[2 * elements.length];
         for (int i = 0; i < elements.length; i++) 
         { 
            newElements[i] = elements[(head + i) % elements.length]; 
         }      
         elements = newElements;
         head = 0;
         tail = currentSize;
      }
   }
   
   public void lastToFirst()
   {
       if (currentSize <= 1);
       else
       {
           tail --;
           head --;
           if (tail < 0)
           {
               tail = elements.length + tail;
           }
           if (head < 0)
           {
               head = elements.length + head;
           }
           Object temp = elements[tail];
           elements[tail] = null;
           elements[head] = temp;
        }
       
   }
   
   public void firstToList()
   {
   }
}
