package exam;

import exam.Stack;

public class Notation {
  
  public Notation() {

  }

  public Object poland(String input) {
    String[] tokens = input.split("[ ]");
    // Schritt 1: Stack anlegen
    Stack stack = new Stack();

    // Schritt 2: Eingabe von link nach rechts durchgehen
    for (String token : tokens) {
        int number1;
        int number2;
        switch (token) {
            case "+":
                number1 = Integer.parseInt(stack.top() + "");
                stack.pop();
                number2 = Integer.parseInt(stack.top() + "");
                stack.pop();
                stack.push(number1 + number2);
                break;
              case "-":
                number1 = Integer.parseInt(stack.top() + "");
                stack.pop();
                number2 = Integer.parseInt(stack.top() + "");
                stack.pop();
                stack.push(number1 - number2);
                break;
            case "*":
              number1 = Integer.parseInt(stack.top() + "");
              stack.pop();
              number2 = Integer.parseInt(stack.top() + "");
              stack.pop();
              stack.push(number1 * number2);
              break;
            case "/":
                number1 = Integer.parseInt(stack.top() + "");
                stack.pop();
                number2 = Integer.parseInt(stack.top() + "");
                stack.pop();
                stack.push(number1 / number2);
                break;
            default:
                stack.push(token);
                break;
        }
    }
    return stack.top();

  }

}
