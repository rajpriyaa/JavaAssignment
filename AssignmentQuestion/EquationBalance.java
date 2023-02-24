package AssignmentQuestion;

import java.util.Scanner;

public class EquationBalance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input= sc.nextLine();
        eqBalance(input);
    }

    public static void eqBalance(String input) {
        String balancedResult= "";
        int parenthesisCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                parenthesisCount++;
            } else if (input.charAt(i) == ')') {
                parenthesisCount--;
            } else if (input.charAt(i) == '=') {
                if (parenthesisCount > 0) {
                    balancedResult += ")";
                    parenthesisCount--;
                } else if (parenthesisCount < 0) {
                    balancedResult += "(";
                    parenthesisCount++;
                }
            }
            balancedResult += input.charAt(i);
        }
        while (parenthesisCount > 0) {
            balancedResult += ")";
            parenthesisCount--;
        }
        System.out.println(balancedResult);
        return;
    }
}
