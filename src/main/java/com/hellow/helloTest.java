package com.hellow;

public class helloTest {
    public static void main(String[] args) {
        int[] array = {1,15,-1,0,2,1,1,0,1,1000};
        int max = 0;
        int sum = 0;
        int sumMax = 0;
        for (int i=0;i<array.length;i++){
            sum = 0;
           for (int j=i;j<array.length;j++){
               if (array[i]==array[j]){
                   sum++;
               }
           }
           if(sum>sumMax){
               sumMax=sum;
               max = array[i];

           }
        }
        System.out.println(sumMax);
        System.out.println(max);
    }
}
