package probelms.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class Reentrancy {
	ReentrantLock lock = new ReentrantLock();

	public void setA() {
		if (!lock.tryLock()) {
			return;
		}
		try {
			System.out.println("setting A:"+Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void setB() {
		if(lock.isHeldByCurrentThread()){
			return;
		}
		try {
			System.out.println("setting B:"+Thread.currentThread().getName());
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
//			lock.unlock();
		}

	}

	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		Reentrancy r = new Reentrancy();
		MyThread t1 = new MyThread(r, "T1");
		t1.start();
		MyThread t2 = new MyThread(r, "T2");
		t2.start();
		MyThread t3 = new MyThread(r, "T3");
		t3.start();
		MyThread t4 = new MyThread(r, "T4");
		t4.start();
	}

}

class MyThread extends Thread {

	Reentrancy e = null;

	public MyThread(Reentrancy e, String name) {
		super(name);
		this.e = e;
	}

	@Override
	public void run() {
		while (true) {
			e.setA();
			e.setB();
		}
	}

}
