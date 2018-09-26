

/**
 * Write a description of interface ListIterator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ListIterator
{
    /**
     * moves the iterator past the next element
     * 
     * @return    description of the return value
     */
    Object next();
    
    /**
     * tests if there is an element after the iterator position
     * @return true if there is an element after the iterator position
     */
    boolean hasNext();
}
