package ch10.sec04;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class queueMain {

		public static void main(String[] args) {

			BlockingQueue queue = new ArrayBlockingQueue(50);
			Thread p = new Thread(new producer(queue));
			Thread c = new Thread(new comsumer(queue));

			p.start();
			c.start();

		}

}
