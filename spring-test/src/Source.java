import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentMap;

/**
 * Created by jhonwill on 2018/4/9.
 */
public class Source {
    public int count;
    public LinkedList linkedList;
    public HashMap hashMap;
    public ConcurrentMap concurrentMap;

    public Source() {}
    public String write(){
       return "count:" + count + /*"  /  linkedList:"  +*/ linkedList + "   /  hashmap:" + hashMap + "   /  concurrentMap:" + concurrentMap;
    }
}
