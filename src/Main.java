import java.util.Scanner;

import javax.swing.JOptionPane;

import Genric.Notation_Genric;
import Genric.Queue_Genric;
import Genric.Stack_Genric;

public class Main {
    public static void main(String[] args) throws Exception {

        // Stack
        Stack_Genric<String> stack = new Stack_Genric<String>();
        stack.push("Das");
        stack.push("Ist");
        stack.push("ein");
        stack.push("Test!");
        // Only Strings
        // stack.push(5); 
        while(!stack.isEmpty()) {
          System.out.println(stack.top());
          stack.pop();
        }

        // Queue
        Queue_Genric<String> queue = new Queue_Genric<String>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");

        Queue_Genric newQueue = reverse(queue);

        while(!newQueue.isEmpty()) {
          System.out.println(newQueue.front());
          newQueue.dequeue();
        }
        
        // Notations
        Notation_Genric notation = new Notation_Genric();
        //System.out.println(notation.upn("5 2 + 3 * 7 4 + 10 * -"));
        System.out.println(notation.upn("2 3 pot"));
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabe von UPN: ");
        String input = scanner.nextLine();
        scanner.close();
        String result = notation.upn(input);
        System.out.println(result);
    }

    public static Queue_Genric<String> reverse(Queue_Genric<String> queue) {

      Stack_Genric<String> stack = new Stack_Genric<>();

      while(!queue.isEmpty()) {
        stack.push(queue.front());
        queue.dequeue();
      }

      Queue_Genric<String> newQueue = new Queue_Genric<>();

      
      while(!stack.isEmpty()) {
        newQueue.enqueue(stack.top());
        stack.pop();
      }

      return newQueue;
    }
}
