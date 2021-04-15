import java.util.concurrent.*;


// 因为ExecutorService只是接口，Java标准库提供的几个常用实现类有：
//
//         FixedThreadPool：线程数固定的线程池；
//         CachedThreadPool：线程数根据任务动态调整的线程池；
//         SingleThreadExecutor：仅单线程执行的线程池。

public class threadPoolUse {
    public static void main(String[] args) {
        // 创建一个固定大小的线程池:
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 6; i++) {
            es.submit(new Task("" + i));
        }
        // 关闭线程池:
        es.shutdown();
    }
}

class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("end task " + name);
    }
}
