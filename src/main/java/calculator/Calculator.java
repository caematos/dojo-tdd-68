package calculator;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int sumTwoValuesAndSubtractATax(int firstNumber, int secondNumber, int tax) {
        int sum = sum(firstNumber, secondNumber);
        
        return subtract(sum, tax);
    }
}
