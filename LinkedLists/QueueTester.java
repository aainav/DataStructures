

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
        CircularArrayQueue q = new CircularArrayQueue();
        q.add("Tom");
        q.add("Diana");
        q.add("Harry");
        
        while(!q.empty())
        {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        System.out.println("Expected: Tom Diana Harry");
        
        q.add("Tom");
        q.add("Diana");
        q.add("Harry");
        q.firstToLast();
        while(!q.empty())
        {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        System.out.println("Expected: Diana Harry Tom");
    }
}
