package lab5;

public class UserJob extends Thread{
	int UserJobName;
	int UserJobFlag;
	
	DiskDrive driver;
	
	
	public UserJob(int name, int flag, DiskDrive sd){
		UserJobName = name;
		UserJobFlag = flag;
		driver = sd;
	}
	
	public void run(){
		System.out.println("UserJob " + UserJobName + " is starting.");
		for (int i = 0; i < 5; i++){
		int CPUtime = 100 + (int)(Math.random() * ((1000 - 100) + 1));
		int IOtrack = 0 + (int)(Math.random() * ((1024 - 0) + 1));
		
			if (UserJobFlag == 0){
				System.out.println("UserJob " + UserJobName + " starting CPU burst of length " + CPUtime);
				try{ Thread.sleep(CPUtime); } catch (InterruptedException e) { e.printStackTrace(); }
			}
			else{
				System.out.println("UserJob " + UserJobName + " requesting to read disk track " + IOtrack);
				driver.useTheDisk(IOtrack);
				System.out.println("UserJob " + UserJobName + " finished reading disk track " + IOtrack);
			}
		}
			
		
		
	}
}
