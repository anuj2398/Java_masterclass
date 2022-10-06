Last Digit Checker
Write a method named hasSameLastDigit with three parameters of type int. 

Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.

The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class LastDigitChecker {
    
    public static boolean hasSameLastDigit(int a,int b,int c){
        //if(a<10 || a>1000 || b<10 || b>1000 || c<10 || c>1000)return false;
        if(isValid(a) && isValid(b) && isValid(c)){
        int righta=a%10;
        int rightb=b%10;
        int rightc=c%10;
        if(righta==rightb || rightb==rightc || rightc==righta) return true;
           
        }
        return false;
    }
    public static boolean isValid(int num){
        if(num<10 || num>1000)return false;
        return true;
    }
}