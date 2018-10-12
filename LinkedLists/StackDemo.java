

/**
 * Write a description of class StackDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackDemo
{
    public static void main(String[] args)
    {
        LinkedListStack s = new LinkedListStack();
        
        //.push();
        s.push("one");
        s.push("two");
        s.push("three");
        
        boolean empty;
        empty = s.isEmpty();
        while(!empty)
        {
            empty = s.isEmpty();
            System.out.println(s.pop());
        }
        
    }

}
