package exam;

import javax.swing.JOptionPane;

public class UPN {

  public static void main(String[] args) {
    
    String input = "5 3 - 5 *";//JOptionPane.showInputDialog("Eingabe einer UPN: ");
    Double output = upn(input);
    System.out.println(output);
    //JOptionPane.showMessageDialog(null, "Ausgabe: " + output);
  }
  
  // Aufgabe - 3
  public static Double upn(String input) {
    String[] tokens = input.split(" ");
    // Schritt 1: Stack anlegen
    Stack stack = new Stack();

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
          stack.push(tmp);
      } else {
        stack.push(token);
      }
    }
    return Double.parseDouble(stack.top().toString());
  }

}
