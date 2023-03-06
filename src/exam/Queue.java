package exam;


// FIFO - First in first out
public class Queue {
  
  private Box head = null;
  private Box tail = null;
  private int size = 0;

  public int getSize() {
    return size;
  }

  public Queue() {
    
  }

  // Funktion
  public boolean isEmpty() {
    return head == null && tail == null;
  }

  // Prozedur - Aufgabe 8
  public void enqueue(Object pObject) {
    if(pObject == null) return;
    size++;
    Box box = new Box(pObject);
    if(isEmpty()) {
      head = tail = box;
      return;
    }
    tail.setNext(box);
    tail = box;
  }

  public void dequeue() {
    if(isEmpty()) return;
    size--;
    head = head.getNext();
    if(head == null) tail = null;
  }

  public Object front() {
    if(isEmpty()) return null;
    return head.getContent();
  }

}
