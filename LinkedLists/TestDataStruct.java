
//don't need to import because it's in the same foler
/**
 * Write a description of class TestDataStruct here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestDataStruct
{
    public static void main (String[] args)
    {
        LinkedList test = new LinkedList();
        //first pointed to null
        
        String word = "New";
        String word2;
        
        test.addFirst(word);
        test.addFirst(new String("Two"));
        
        
        //OLD SCHOOL!! ~ must cast Object
        //word2 = test.getFirst(); //this returns an Object and word2 is not an Object
        word2 = (String) test.getFirst(); //cast Object to a String
        
        System.out.println(word2); //returns Two because we add New, add Two, and remove Two ~ LIFO
    }
}
