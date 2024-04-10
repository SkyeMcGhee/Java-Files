/**
    A list iterator allows access of a position in a linked list.    
    This interface contains a subset of the methods of the 
    standard java.util.ListIterator interface. The methods for
    backward traversal are not included.
 */
 public interface ListIterator
 {  
    /**
       Moves the iterator past the next element.
       @return the traversed element
    */
    public Object next();
    {
      if (!hasNext())
         throw new NoSuchElementException();
            previous = position;
            if (position == null)
              position = first;
              else      position = position.next;
              return position.data;
    }
       
    /**
       Tests if there is an element after the iterator 
       position.
       @return true if there is an element after the iterator 
       position
    */
    boolean hasNext()
    {
      if (position == null)
            return first != null;
            else
            return position.next != null;
    }
       
    /**
       Adds an element before the iterator position
       and moves the iterator past the inserted element.
       @param element the element to add
    */
    void add(Object element)
    {
      if (position == null)
        {
        addFirst(obj);
        position = first;
        }
      else
      {
      Node newNode = new Node();
      newNode.data = obj;
      newNode.next = position.next;
      position.next = newNode;
      position = newNode;
      } 
      previous = position;
    }
       
    /**
       Removes the last traversed element. This method may
       only be called after a call to the next() method.
    */ 
    void remove()
    {
      if (previous == position)
      throw new IllegalStateException();
      if (position == first)
       {
        removeFirst();
       }
       else
      {
      previous.next = position.next;   
      } 
      position = previous;
    }

    /**
       Sets the last traversed element to a different 
       value. 
       @param element the element to set
    */
    void set(Object element)
    {
      if (position == null)
       throw new NoSuchElementException();
       position.data = obj;
    }
 } 