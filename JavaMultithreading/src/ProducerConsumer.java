import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
		
		Producer p = new Producer(sharedQueue);
		Consumer c = new Consumer(sharedQueue);
		
		p.start();
		c.start();

	}
	
}

	class Producer extends Thread {

		BlockingQueue<Integer> sharedQueue;

		Producer(BlockingQueue<Integer> cQueue) {

			this.sharedQueue = cQueue;
		}

// no synchronization needed
		public void run() {

			for (int i = 0; i < 10; i++) {

				try {
					System.out.println(getClass() + "produced" + i);
					sharedQueue.put(i);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

	class Consumer extends Thread {

		BlockingQueue<Integer> sharedQueue;

		Consumer(BlockingQueue<Integer> dQueue) {

			this.sharedQueue = dQueue;
		}

// no synchronization needed
		public void run() {

			try {

				while (true) {

					Integer value = sharedQueue.take();
					System.out.println(getClass() + "consumed" + value);
				}

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

