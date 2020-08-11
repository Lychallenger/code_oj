package leetcode;


import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.concurrent.ThreadPoolExecutor;

public class code1 {

    public static void main(String[] args) {
        ThreadPoolExecutor
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> p=new ArrayList<>();
        ArrayList<String> v=new ArrayList<>();
        for(int i=0;i<m;i++){
            String s=sc.next();
            if(s.charAt(0)=='V'){
                v.add(s);
            }
            else{
                p.add(s);
            }
        }
        ArrayList<String> result=new ArrayList<>();
        int off=0;
        for(int i=0;i<v.size();i++){
            result.add(v.get(i));
            if(i%n==n-2){
                if(off<p.size()){
                    result.add(p.get(off));
                    off++;
                }
            }
        }
        System.out.println(result.size());
        for(String r:result){
            System.out.println(r);
        }
    }
}

