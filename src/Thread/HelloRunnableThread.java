package Thread;

import java.util.Date;


public class HelloRunnableThread extends Thread{

        public void run(){

            Date today = new Date();
            System.out.println("Hello Aman Gupta!! Today is " + today);
        }
    }

