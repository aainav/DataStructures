

/**
 * Write a description of class QueueTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QueueTester
{
    public static void main (String[] args)
    {
        LinkedListQueue q = new LinkedListQueue();
        
        q.add("Tom");
        q.add("Diana");
        q.add("Harry");
        q.lastToFirst();
        while(!q.empty())
        {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        System.out.println("Expected: Harry Tom Diana");
    }
}
