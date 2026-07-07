package interpreterpattern;

public class InterpreterPattern {
    
    // Evaluates a simple postfix expression containing numbers, plus, and minus.
    // e.g. "5 10 + 2 -" -> (5 + 10) - 2 = 13
    public static Expression parse(String expressionStr) {
        java.util.Stack<Expression> stack = new java.util.Stack<>();
        
        String[] tokens = expressionStr.split(" ");
        for (String token : tokens) {
            if (token.equals("+")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new PlusExpression(left, right));
            } else if (token.equals("-")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new MinusExpression(left, right));
            } else {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        // String expression represents "((20 + 5) - 3)" in postfix notation
        String expression = "20 5 + 3 -";
        Expression parsedExpression = parse(expression);
        
        System.out.println("Expression: 20 5 + 3 -");
        System.out.println("Interpreted Result = " + parsedExpression.interpret());

        // String expression represents "(100 - (20 + 30))" -> "100 20 30 + -"
        String expression2 = "100 20 30 + -";
        Expression parsedExpression2 = parse(expression2);
        
        System.out.println("\nExpression: 100 20 30 + -");
        System.out.println("Interpreted Result = " + parsedExpression2.interpret());
    }
}
