
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0) return -1;
        int last=number%10;
        int x=number;
        while(x>9){
            x=x/10;
        }
        int sum=last + x;
        return sum;
    }
}