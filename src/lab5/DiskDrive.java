package lab5;

public class DiskDrive {

	private int diskReadHead;
	
	private ddMonitor dd;
	
	public DiskDrive (){
		diskReadHead = 0;
		dd = new ddMonitor();
	}
	
	public void useTheDisk(int track){
		dd.startRead();
		System.out.println("Disk Head at " + diskReadHead + ". Need to go to track " + track);
		int difference;
		
		if (Integer.valueOf(track).compareTo(diskReadHead) == 1){
			difference = (track - diskReadHead) + 1;
		}
		else if (Integer.valueOf(track).compareTo(diskReadHead) == -1){
			difference = (diskReadHead - track) + 1;
		}
		else{
			difference = 1;
		}
		
		
		try {Thread.sleep(difference); } catch (InterruptedException e) {e.printStackTrace();}
		diskReadHead = track;
		dd.endRead();
	}
	
}
