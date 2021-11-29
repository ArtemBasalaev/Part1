package lesson1;

public class Expression {
    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 5;
        int variable3 = 2;
        int expressionResult = (variable1 * variable2 + variable2 * variable3) / (variable1 + variable3 + 3);
        System.out.println("Результат вычисления выражения: " + expressionResult);
    }
}