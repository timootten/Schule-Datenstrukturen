package Genric;
public class Stack_Genric<E> {
 
  private Box_Genric<E> head;

  public Stack_Genric() {
    head = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void push(E e) {
    if(e == null) return;
    head = new Box_Genric<E>(e, head);
  }

  public void pop() {
    if(isEmpty()) return;
    head = head.getNext();
  }

  public E top() {
    return head.get();
  }

}
