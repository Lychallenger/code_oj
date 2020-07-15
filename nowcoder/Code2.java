package nowcoder;

import java.util.Scanner;

/**
 * @author ：liwan012
 * @description：code for min distance
 * @date ：2020/7/15 15:48
 */

/**
 * https://www.nowcoder.com/question/next?pid=23568060&qid=983238&tid=34796054
 */

/**
 * 薯队长最近在玩一个迷宫探索类游戏，迷宫是一个N*N的矩阵形状，其中会有一些障碍物禁止通过。
 * 这个迷宫还有一个特殊的设计，它的左右 边界以及上下边界是连通的，比如在(2,n)的位置继续往右走一格可以到(2,1)
 * ，    在(1,2)的位置继续往上走一格可以到(n,2)。请问薯队长从起点位置S，最少走多少格才能到达迷宫的出口位置E。
 *
 * 输入描述:
 * 第一行正整数N,接下来N行字符串
 * ’.’表示可以通过
 * ’#’表示障碍物
 * ’S’表示起点（有且仅有一个）
 * ’E’表示出口（有且仅有一个）
 * 对于50%的数据N<10
 * 对于100%的数据N<10^3
 *
 * 输出描述:
 * 输出一个整数。表示从S到E最短路径的长度,    无法到达则输出    -1
 *
 * 输入例子1:
 * 5
 * .#...
 * ..#S.
 * .E###
 * .....
 * .....
 *
 * 输出例子1:
 * 4
 */

/**
 * 超时，可以用BFS
 */
public class Code2 {
    public static int m=Integer.MAX_VALUE;
    public static void get(int idx,int idy,int endx,int endy,char[][]chars,boolean[][]visited,int step){
        if(idx==endx&&idy==endy){
            m=Math.min(step,m);
            return;
        }
        if(visited[idx][idy]==true||chars[idx][idy]=='#'){
            return;
        }
        else{
            visited[idx][idy]=true;
            get((idx+chars.length+1)%chars.length,idy,endx,endy,chars,visited,step+1);//上
            get((idx+chars.length-1)%chars.length,idy,endx,endy,chars,visited,step+1);//下
            get(idx,(idy+chars.length+1)%chars.length,endx,endy,chars,visited,step+1);//左
            get(idx,(idy+chars.length-1)%chars.length,endx,endy,chars,visited,step+1);//右
            visited[idx][idy]=false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        char [][] chars=new char[length][length];
        int idx = 0,idy=0,endx=0,endy=0;
        for(int i=0;i<length;i++){
                chars[i]=scanner.next().toCharArray();
                for(int j=0;j<length;j++){
                    if(chars[i][j]=='S'){
                        idx=i;
                        idy=j;
                    }
                    if(chars[i][j]=='E'){
                        endx=i;
                        endy=j;
                    }
                }
        }
        boolean [][] visited=new boolean[length][length];
        get(idx,idy,endx,endy,chars,visited,0);
        int result=(m==Integer.MAX_VALUE?-1:m);
        System.out.println(result);


    }


}
