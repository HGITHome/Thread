package org.example;

import org.example.exception.ResponseEnum;

import java.util.concurrent.TimeUnit;

/**
 * @author
 * @Title:
 * @Package
 * @Description:
 * @Company
 * @date 2020/8/5 11:30
 */
public class Thread1 {

    public static void main(String[] args) {
        final Thread1 mutex = new Thread1();
        for (int i = 0 ; i < 5 ; i ++){
            new Thread(mutex::accressResource).start();
        }
    }

        private final Object object = new Object();
        public void accressResource(){
            try {
                ResponseEnum.test.assertNotNull(null);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            synchronized (object){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

}
