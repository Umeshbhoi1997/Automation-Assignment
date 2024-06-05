package Assignment;


/*
 *  WAP to create one thread by extending Thread class in another
Class.

 */
public class Quest_18 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			Quest_18 thrd = new Quest_18();
	 
			thrd.start();
			System.out.println("Outside the Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		}
	 
		public void run()
		{
			
		{
				System.out.println("Thread Executed");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					// TODO: handle exception
				}
		}

	}

}
