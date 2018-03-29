package lab5;

public class ddMonitor {
	
	private int readCount;
	
	public ddMonitor(){
		readCount = 0;
	}

	public synchronized void startRead () {
		while (readCount > 0){
			try {  wait(); } catch (Exception e) {};
		}
		readCount++;
	}
	
	public synchronized void endRead(){
		readCount--;
		notifyAll();
	}
	
}
