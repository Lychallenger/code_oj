package leetcode;


import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class code1{
    public static void reOrderArray(int [] array){
        int len= array.length;
        int even=0,odd=0;
        while(odd<len&&even<len){
            while(even<len && array[even]%2!=0) //找到第一个偶数even
                even++;
            odd=even+1;
            //找偶数之后的第一个奇数
            while(odd<len && array[odd]%2==0)
                odd++;
            if(odd>=len)
                break;
            int temp=array[odd];
            for(int i=odd;i>even;i--)
                array[i]= array[i-1];
            array[even]=temp;
            even++;
        }
    }
    public static void main(String[] args) {
       int [] array={2,4,3,6,2,1};
       reOrderArray(array);
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
