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