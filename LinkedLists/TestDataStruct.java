
/**
 * Just a tester for our data
 * @author Sarah Walz 
 * @version (a version number or a date)
 */
public class TestDataStruct
{
        /**
     * An example of a method - replace this comment with your own
     *    
     */
    public static void main (String [] args)
    {
        //right now set up like a set, last in, last out
        LinkedList lister= new LinkedList(); 
        String word= "New"; 
        lister.addFirst(word);
        lister.addFirst(new String ("wahhh"));
        lister.addFirst(new String("Two")); //linked list is now [two] [new]
        
        
        
        
        //String word2= lister.getFirst(); //this returns as object- but word 2 is not an object 
        
        //OLD school- had to cast the object first
        String word2= (String) lister.getFirst();
        //System.out.println(word2); 
        
        //lister.reverse(lister);
        
        System.out.print(lister);
        
        //String tester1= "Tom"; 
        //lister.faultyAddFirst(tester1);
        
        //String tester2= "Bob"; 
        //lister.faultyAddFirst(tester2);
        
        //lister.removeFirst();
        
        System.out.print(lister);
        
        System.out.println(lister.size()); 
        
        //if (tester1.equals(lister.getFirst()))
            //System.out.println("It works");
        //else
            //System.out.println("It doesn't work- FAIL\n");
        
        
              
        
        
    }

}