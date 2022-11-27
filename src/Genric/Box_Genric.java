package Genric;
public class Box_Genric<E> {
  
  private E e = null;
  private Box_Genric<E> next = null;

  public Box_Genric() {
    
  }

  public Box_Genric(E e) {
    this.e = e;
  }

  public Box_Genric(E e, Box_Genric<E> next) {
    this.e = e;
    this.next = next;
  }

  public E get() {
    return e;
  }

  public void set(E e) {
    this.e = e;
  }

  public Box_Genric<E> getNext() {
    return next;
  }

  public void setNext(Box_Genric<E> next) {
    this.next = next;
  }

}
