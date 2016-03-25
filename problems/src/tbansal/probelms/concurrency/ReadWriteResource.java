package tbansal.probelms.concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteResource {

	ReadWriteLock lock = new ReentrantReadWriteLock();

	public String get() throws InterruptedException {
//		Thread.sleep(5000);
		lock.readLock().lock();
		try {
			Thread.sleep(10000);
			Date dNow = new Date();
			SimpleDateFormat ft = new SimpleDateFormat(
					"E yyyy.MM.dd 'at' hh:mm:ss a zzz");
			
			System.out.println(Thread.currentThread().getName()+" gettting: " + ft.format(new Date()));
			return "hello";

		}

		finally {
			lock.readLock().unlock();
		}


	}

	public void set() throws InterruptedException {
		Thread.sleep(1000);
		lock.writeLock().lock();
		try {
			 Date dNow = new Date( );
		      SimpleDateFormat ft = 
		      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
			
			System.out.println(Thread.currentThread().getName()+" settting: " + ft.format(new Date()));
		}

		finally {
			lock.writeLock().unlock();
		}

	}

}
