import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jhonwill on 2018/4/9.
 */
public class ThreadTest implements Runnable {
    private String name;
    private Source source;
    public ThreadTest(String name, Source source){
        this.name = name;
        this.source = source;
        System.out.println(this.name + " has created .");
    }
    public void run() {
        synchronized (source){
            System.out.println(this.name + " is starting ......");
            if(source.hashMap == null){
                source.hashMap = new HashMap();
            }
            if(source.concurrentMap == null){
                source.concurrentMap = new ConcurrentHashMap();
            }
            if(source.linkedList == null){
                source.linkedList = new LinkedList();
            }
            while (true){
                System.out.println(this.name + "START..." + source.count);
                source.count ++;
                source.hashMap.put(name + "_" + source.count, source.count);
                source.concurrentMap.put(name + "_" + source.count, source.count);
                source.linkedList.add(name + "_" + source.count);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
