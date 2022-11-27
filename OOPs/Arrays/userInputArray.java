package Array;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        int[] myIntergers=getIntegers(4);
        for(int j=0;j<myIntergers.length;j++){
            System.out.println("the element at "+j+" is "+myIntergers[j]);
        }
        System.out.println("the average is "+getaverage(myIntergers));
    }
    public static int[] getIntegers(int num){
        int[] arr=new int[num];
        System.out.println("enter "+num+" elements.");
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum /  array.length;
    }
}
