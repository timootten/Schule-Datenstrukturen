package Genric;
public class Queue_Genric<E> {
  
  private Box_Genric<E> head = null;
  private Box_Genric<E> tail = null;

  public Queue_Genric() {
    
  }

  public boolean isEmpty() {
    return head == null && tail == null;
  }

  public void enqueue(E e) {
    if(e == null) return;
    Box_Genric<E> box = new Box_Genric<E>(e);
    if(isEmpty()) {
      head = tail = box;
      return;
    }
    tail.setNext(box);
    tail = box;
  }

  public void dequeue() {
    if(isEmpty()) return;
    head = head.getNext();
    if(head == null) tail = null;
  }

  public E front() {
    if(isEmpty()) return null;
    return head.get();
  }
  
}
