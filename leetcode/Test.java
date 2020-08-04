package leetcode;

/**
 * @author ：liwan012@ke.com
 * @description：test
 * @date ：2020/7/20 22:51
 */


public class Test {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    while (true){
                        System.out.println("我要吃包子！！！！");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子真好吃！真想白嫖");
                        System.out.println("-----------------------------");

                    }
                }
            }
        }.start();

        new Thread(){

            @Override
            public void run() {
                synchronized (obj){
                        while (true){
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            System.out.println("我已经做好包子了");
                            obj.notifyAll();

                        }

                }

            }
        }.start();
    }
}
