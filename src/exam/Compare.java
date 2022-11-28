package exam;

public class Compare {
  
  public static void main(String[] args) {
    Stack stack1 = new Stack();
    stack1.push("A");
    stack1.push("B");
    stack1.push("C");
    stack1.push("D");
    Stack stack2 = new Stack();
    stack2.push("A");
    stack2.push("B");
    stack2.push("C");
    stack2.push("D");

    System.out.println(compareStack(stack1, stack2));

    printStackAndDelete(stack1);
    System.out.println("------");
    printStackAndDelete(stack2);

    /*Queue queue1 = new Queue();
    queue1.enqueue("A");
    queue1.enqueue("B");
    queue1.enqueue("C");
    Queue queue2 = new Queue();
    queue2.enqueue("A");
    queue2.enqueue("B");
    queue2.enqueue("C");
    System.out.println(compareQueue(queue1, queue2));

    printQueueAndDelete(queue1);
    printQueueAndDelete(queue2);*/
  }

  public static boolean compareQueue2(Queue queue1, Queue queue2) {
    Queue temp1 = new Queue();
    Queue temp2 = new Queue();

    boolean output = true;

    // Vergleichen
    while(output && !queue1.isEmpty() && !queue2.isEmpty()) {
      Object object1 = queue1.front();
      Object object2 = queue2.front();
      if(!object1.equals(object2)) {
        output = false;
      }
      temp1.enqueue(object1);
      temp2.enqueue(object2);
      queue1.dequeue();
      queue2.dequeue();
    }

    if(queue1.isEmpty() != queue2.isEmpty()) {
      output = false;
    }

    // Wenn noch nicht empty dann in temp clonen
    while(!queue1.isEmpty()) {
      temp1.enqueue(queue1.front());
      queue1.dequeue();
    }

    while(!queue2.isEmpty()) {
      temp2.enqueue(queue2.front());
      queue2.dequeue();
      
    }

    // Aus temp1/temp2 in queue kopieren
    while(!temp1.isEmpty()) {
      queue1.enqueue(temp1.front());
      temp1.dequeue();
    }

    while(!temp2.isEmpty()) {
      queue2.enqueue(temp2.front());
      temp2.dequeue();
    }

    return output;
  }

  public static boolean compareQueue(Queue queue1, Queue queue2) {
    Queue temp1 = new Queue();
    Queue temp2 = new Queue();

    boolean output = true;

    // Vergleichen
    while(!queue1.isEmpty()) {
      Object object1 = queue1.front();
      Object object2 = queue2.front();
      if(object1 == null || object2 == null || !object1.equals(object2)) {
        output = false;
        break;
      }
      queue1.dequeue();
      queue2.dequeue();
      temp1.enqueue(object1);
      temp2.enqueue(object2);
    }

    if(queue1.isEmpty() != queue2.isEmpty()) {
      output = false;
    }

    // Wenn noch nicht empty dann in temp clonen
    while(!queue1.isEmpty()) {
      temp1.enqueue(queue1.front());
      queue1.dequeue();
    }

    while(!queue2.isEmpty()) {
      temp2.enqueue(queue2.front());
      queue2.dequeue();
      
    }

    // Aus temp1/temp2 in queue kopieren
    while(!temp1.isEmpty()) {
      queue1.enqueue(temp1.front());
      temp1.dequeue();
    }

    while(!temp2.isEmpty()) {
      queue2.enqueue(temp2.front());
      temp2.dequeue();
    }

    return output;
  }

  public static boolean compareStack(Stack stack1, Stack stack2) {
    Stack temp = new Stack();

    boolean output = true;

    // Vergleichen
    while(!stack1.isEmpty() && !stack2.isEmpty()) {
      if(!stack1.top().equals(stack2.top())) {
        output = false;
        break;
      }
      temp.push(stack1.top());
      stack1.pop();
      stack2.pop();
    }

    if(stack1.isEmpty() != stack2.isEmpty()) {
      output = false;
    }

    // Aus temp in stack kopieren
    while(!temp.isEmpty()) {
      stack1.push(temp.top());
      stack2.push(temp.top());
      temp.pop();
    }

    return output;
  }

  

  public static void printQueueAndDelete(Queue queue) {
    System.out.println(1);
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
