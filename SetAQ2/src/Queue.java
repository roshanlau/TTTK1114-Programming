import java.util.Iterator;
import java.util.NoSuchElementException;

	public class Queue<Item> implements Iterable<Item> {
	    private int n;         // number of elements on queue
	    private Node first;    // beginning of queue
	    private Node last;     // end of queue

	    // helper linked list class
	    private class Node {
	        private Item item;
	        private Node next;
	    }

	    /**
	     * Initializes an empty queue.
	     */
	    public Queue() {
	        first = null;
	        last  = null;
	        n = 0;
	    }

	   
	    public boolean isEmpty() {
	        return first == null;
	    }

	   
	    public int size() {
	        return n;
	    }

	    
	    public int length() {
	        return n;
	    }

	    
	    public Item peek() {
	        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
	        return first.item;
	    }

	   
	    public void enqueue(Item item) {
	        Node oldlast = last;
	        last = new Node();
	        last.item = item;
	        last.next = null;
	        if (isEmpty()) first = last;
	        else           oldlast.next = last;
	        n++;
	    }

	   
	    public Item dequeue() {
	        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
	        Item item = first.item;
	        first = first.next;
	        n--;
	        if (isEmpty()) last = null;   // to avoid loitering
	        return item;
	    }

	    
	    public String toString() {
	        StringBuilder s = new StringBuilder();
	        for (Item item : this) {
	            s.append(item);
	            s.append(' ');
	        }
	        return s.toString();
	    }


	    
	    public Iterator<Item> iterator()  {
	        return new ListIterator();
	    }

	    // an iterator, doesn't implement remove() since it's optional
	    private class ListIterator implements Iterator<Item> {
	        private Node current = first;

	        public boolean hasNext()  { return current != null;                     }
	        public void remove()      { throw new UnsupportedOperationException();  }

	        public Item next() {
	            if (!hasNext()) throw new NoSuchElementException();
	            Item item = current.item;
	            current = current.next;
	            return item;
	        }
	    }
	    
	    public Queue<Item> cloneQueue(Queue<Item> q)
	    {
	        Queue<Item> q1 = new Queue<Item>();
	        Queue<Item> pos = q;
	        while (!pos.isEmpty())
	        {
	            q1.enqueue(pos.dequeue());//q1.insert(pos.remove());
	        }
	        return q1;
	    }
	}