Shared Digit
Write a method named hasSharedDigit with two parameters of type int. 

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.



EXAMPLE INPUT/OUTPUT:

hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers

hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99

hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

---------------------------------------------------------------------------------------------------------------------------------------------------------------
public class SharedDigit {
    // write your code here
    public static boolean hasSharedDigit(int a,int b){
        if(a<10 || a>99 || b<10 || b>99)return false;
        else if(a%10==b%10 || a/10==b/10 || a%10==b/10 || a/10==b%10) return true;
        else return false;
    }
}

//solution2 
public class SharedDigit {
    public static boolean hasSharedDigit (int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
 
        for(int i = num1; i > 0; i /= 10) {
            for(int j = num2; j > 0 ; j /= 10) {
                if(i % 10 == j % 10){
                    return true;
                }
            }
        }
        return false;
    }
}
//solution3
public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
 
        int originalNum2 = num2; // hold value of num2
        while (num1 > 0){
            while (num2 > 0){
                if (num1 % 10 == num2 % 10){
                    return true;
                }
                num2 /= 10;
            }
            num1 /= 10;
            num2 = originalNum2; // reset value of num2 since it became 0
        }
        return false;
    }
}
