public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if(number<0) return -1;
        int x=number;
        int last;
        int sum=0;
        while(x>0){
            last=x%10;
            if(last%2==0) sum+=last;
            x=x/10;
        }
        return sum;
    }
}