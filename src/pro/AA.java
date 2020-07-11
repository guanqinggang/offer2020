package pro;

import java.io.InputStream;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author guanqinggang
 * @version 1.0
 * @date 2020/5/21 22:22
 */
public class AA {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        lock.lock();
        int a=0;
        lock.unlock();

    }

}