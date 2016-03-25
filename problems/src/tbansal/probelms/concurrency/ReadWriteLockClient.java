package tbansal.probelms.concurrency;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadWriteLockClient {

	public static void main(String[] args) throws InterruptedException {
		final ReadWriteResource r = new ReadWriteResource();
		Thread consumer = new Thread("C") {

			@Override
			public void run() {
				try {
					r.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		Thread consumer1 = new Thread("C1") {

			@Override
			public void run() {
				try {
					r.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		Thread consumer2 = new Thread("C2") {

			@Override
			public void run() {
				try {
					r.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};

		Thread producer = new Thread("p") {

			@Override
			public void run() {
				try {
					r.set();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		};
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat(
				"E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(Thread.currentThread().getName()+" gettting: " + ft.format(new Date()));
		consumer.start();
		consumer1.start();		
		producer.start();
		Thread.sleep(12000);
		consumer2.start();
	}

}
