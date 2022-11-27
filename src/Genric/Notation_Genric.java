package Genric;

public class Notation_Genric {
  
  public Notation_Genric() {

  }

  public String upn(String input) {
    String[] tokens = input.split("[ ]");
    // Schritt 1: Stack anlegen
    Stack_Genric<String> stack = new Stack_Genric<String>();

    // Schritt 2: Eingabe von link nach rechts durchgehen
    for (String token : tokens) {
        if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("pot")) {
          double number1 = Double.parseDouble(stack.top() + "");
          stack.pop();
          double number2 = Double.parseDouble(stack.top() + "");
          stack.pop();
          double tmp = 0;
          switch (token) {
              case "+":
                  tmp = number1 + number2;
                  break;
                case "-":
                  tmp = number2 - number1;
                  break;
              case "*":
                  tmp = number1 * number2;
                  break;
              case "/":
                  tmp = number2 / number1;
                  break; 
              case "pot":
                  tmp = Math.pow(number2, number1);
                  break;
          }
          stack.push(Double.toString(tmp));
      } else {
        stack.push(token);
      }
    }
    return stack.top();
  }
}
