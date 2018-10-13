package ch10.sec04;

import java.util.Date;
import java.util.concurrent.BlockingQueue;

public class producer implements Runnable {

	private BlockingQueue queue;

	public producer(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {
			try {

//				Thread.sleep(1000);

				Date d = new Date();
				String msg = "메세지"+d.toString();

				queue.put(msg);

				System.out.println("메세지 생성 :["+queue.size()+"]");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
