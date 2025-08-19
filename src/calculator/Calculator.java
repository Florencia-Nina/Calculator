package calculator;


public class Calculator {
    
    public float firstNumber;
    public float secondNumber;
    public String operator;
    
    public void setFirstNumber(float number) {
        this.firstNumber = number;
    }
    
    public void setSecondNumber(float number) {
        this.secondNumber = number;
    }
    
    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public float calculate() {
        switch(this.operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if(secondNumber != 0) {
                    return firstNumber / secondNumber;
                }
                throw new ArithmeticException("No se puede dividir por cero");
            default:
                throw new UnsupportedOperationException("Operación no soportada");
        }
    }
}