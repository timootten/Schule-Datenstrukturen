package exam;

public class Reverse {

  
  // Aufgabe - 6
  public static void reverseStack(Stack stack) {

    Queue queue = new Queue();

    while(!stack.isEmpty()) {
      queue.enqueue(stack.top());
      stack.pop();
    }

    while(!queue.isEmpty()) {
      stack.push(queue.front());
      queue.dequeue();
    }
  }
  
  // Aufgabe - 7
  public static void reverseQueue(Queue queue) {

    Stack stack = new Stack();

    while(!queue.isEmpty()) {
      stack.push(queue.front());
      queue.dequeue();
    }

    while(!stack.isEmpty()) {
      queue.enqueue(stack.top());
      stack.pop();
    }
  }

}