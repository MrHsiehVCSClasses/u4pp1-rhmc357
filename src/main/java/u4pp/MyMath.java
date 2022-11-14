package u4pp;

public class MyMath {
    //returns the absolute value of the parameter
    static int abs(int x){
        int newNum;
        if (x >= 0){
            return x;
        }
        else {
            newNum = x * -1;
            return newNum;
        }
    }

    //returns the absolute value of the parameter
    static double abs(double x){
        double newNum;
        if (x >= 0){
            return x;
        }
        else {
            newNum = x * -1.0;
            return newNum;
        }
    }

    //raises the base to the power of the exponent. 
    //You can assume that the exponent is greater than or equal to 0
    static double pow(double base, int exponent){
        double pow = base;
        if (exponent == 0){
            return 1.0;
        }
        for (int i = 1; i < exponent; i++){
            pow = base * pow;
        }
        return pow;
    }

    //returns the square root of x if there is a whole number that is a square root. 
    //It returns -1 otherwise
    static int perfectSqrt(int x){
        if (x <= 2 && x >= 0){
            return x;
        }
        for (int i = 3; i < x; i++){
            if (i*i == x){
                return i;
            }
        }
        return -1;
    }
}
