import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by yhqairqq@163.com on 2016/12/5.
 */
public class ExecutorPoolDemo {

    @Test
    public  void test1(){
        ExecutorService executorService =  Executors.newFixedThreadPool(4);
        for(int i=0;i<4;i++){
            executorService.submit(new mycall("thread"+i));
        }


    }


    class mycall implements Callable<Object>{

        private String name;

        public mycall(String name) {
            this.name = name;
        }

        @Override
        public Object call() throws Exception {

            System.out.println(name+":start");

            for(int i = 0 ;i< Integer.MAX_VALUE;i++)
            {

            }

            System.out.println(name+":finished");

            return null;
        }
    }



}




