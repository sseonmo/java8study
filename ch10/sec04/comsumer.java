package ch10.sec04;

import java.util.concurrent.BlockingQueue;

public class comsumer implements Runnable {

	private BlockingQueue queue;

	public comsumer(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {
			try {

//				Thread.sleep(10000);

				String msg = (String) queue.take();

				System.out.println("메세지 추출  :["+msg+"]");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
