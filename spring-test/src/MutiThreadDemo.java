import org.apache.poi.util.SystemOutLogger;

/**
 * Created by jhonwill on 2018/4/8.
 */
public class MutiThreadDemo {
    public static void main(String[] args) {
        Source s = new Source();
        Runnable a = new ThreadTest("a", s);
//        new Thread(a).start();
//        new Thread(a).start();
        new Thread(new Runnable() {
            public void run() {
            System.out.println("aaaaaaaa");
            }

        }).start();

        new Thread(() -> {
            System.out.println("bbbbbbbb");
//            .getClass().getField("threadInitNumber");
        }).start();

    }

}