

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
    
     /**
     * Adds an element before the iterator position and moves the iterator past the inserted element
     * @param element, the element to add
     */
    void add(Object element);
    
     /**
     * Removes the last traversed element. This method may only be called after a call to next()
     */
    void remove();
}
