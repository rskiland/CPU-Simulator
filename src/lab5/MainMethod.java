package lab5;

public class MainMethod {
	public static void main (String argv[]) {
		
		System.out.println("The simulation of the computer system is starting");
		
		int flag;
		UserJob UJ;
		
		DiskDrive sharedDisk;
		sharedDisk = new DiskDrive();
		
		for (int i=1; i<=5; i++) {
			flag = 0 + (int)(Math.random() * ((1 - 0) + 1));
			UJ = new UserJob(i, flag, sharedDisk);
			UJ.start();
		}
		
		
	}
}
