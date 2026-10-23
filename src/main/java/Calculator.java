//CS5800 - QUIZ 2
//RAJ AHIR - 019330454

public class Calculator {

    public int sum(int x, int y){
        return x+y;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int multiply(int x, int y){
        return x*y;
    }

    public int divide(int x, int y){
        if (y==0){
            throw new IllegalArgumentException("Ints can NOT be divided by zero.");
        }
        return x/y;
    }

    public boolean isEven(int i){
        return i%2==0;
    }
}
