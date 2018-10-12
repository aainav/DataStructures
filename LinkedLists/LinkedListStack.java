import java.util.NoSuchElementException;

/**
   An implementation of a stack as a sequence of nodes.
*/
public class LinkedListStack
{
   private Node first;

   /**
      Constructs an empty stack.
   */
   public LinkedListStack()
   {
      first = null;
   }

   /**
      Adds an element to the top of the stack.
      @param element the element to add
   */
  public void push (Object element)
  {
    Node temp = new Node();
    temp.data = element;
    temp.next = first; //moving this to the beginning
    first = temp; //but then reverses the order so that it makes it a stack
    //you don't lose first
  }





   /**
      Removes the element from the top of the stack.
      @return the removed element
   */
  public Object pop()
  {
      if (first == null) {throw new NoSuchElementException();}
      Object temp = first.data;
      first = first.next;
      return temp;
  }






  /**
     Checks whether this stack is empty.
     @return true if the stack is empty
  */
  public boolean isEmpty()
  {
      if (first == null)
      {
          return true;
      }
      return false;
  }


   class Node
   {
      public Object data;
      public Node next;
   }
}
