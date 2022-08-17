import java.io.*;
import java.util.*;

class Thread1 implements Runnable {
	public void run()
	{
		// implementing try-catch Block to set sleep state
		// for inactive thread
		try {
			Thread.sleep(102);
		}
		catch (InterruptedException i1) {
			i1.printStackTrace();
		}
		System.out.println(
			"The state for t1 after it invoked join method() on thread t2"
			+ " " + ThreadState.t1.getState());

		// implementing try-catch block
		try {
			Thread.sleep(202);
		}
		catch (InterruptedException i2) {
			i2.printStackTrace();
		}
	}
}