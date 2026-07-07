package interpreterpattern;

public class PlusExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public PlusExpression(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
