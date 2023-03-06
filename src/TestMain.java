import exam.Queue;
import exam.Reverse;
import exam.Stack;

public class TestMain {
 
  public static void main(String[] args) {
    // Reverse Queue
    Queue queue = new Queue();

    queue.enqueue("A");
    queue.enqueue("B");
    queue.enqueue("C");

    Reverse.reverseQueue(queue);

    printQueueAndDelete(queue);

    // Reverse Stack
    Stack stack = new Stack();

    stack.push("A");
    stack.push("B");
    stack.push("C");

    Reverse.reverseStack(stack);

    printStackAndDelete(stack);
  }

  public static void printQueueAndDelete(Queue queue) {
    while(!queue.isEmpty()) {
      System.out.println(queue.front());
      queue.dequeue();
    }
  }

  public static void printStackAndDelete(Stack stack) {
    while(!stack.isEmpty()) {
      System.out.println(stack.top());
      stack.pop();
    }
  }

}
