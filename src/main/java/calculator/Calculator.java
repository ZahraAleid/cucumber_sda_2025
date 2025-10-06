package calculator;



public class Calculator {

    private int result;

    public void add(int a, int b){
        result = a + b;
    }

    public void sub(int a, int b){
        result = a - b;
    }

    public void mult(int a, int b){
        result = a * b;
    }

    public void div(int a, int b){
        result = a / b;
    }

    public int getResult(){
        return result;
    }

}
