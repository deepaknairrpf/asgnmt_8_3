
public class asgnmt_8_3 extends Thread{

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());
		for(int i =1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " is running!");
		try {
			Thread.sleep(100);
			System.out.println("");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asgnmt_8_3 a = new asgnmt_8_3();
		asgnmt_8_3 b = new asgnmt_8_3();
		asgnmt_8_3 c = new asgnmt_8_3();
		 a.setName("Thread A");
		 a.setPriority(Thread.MIN_PRIORITY);
		 
		b.setName("Thread B");
		b.setPriority(Thread.NORM_PRIORITY);
		
		c.setName("Thread C");
		c.setPriority(Thread.MAX_PRIORITY);
		a.start();
		b.start();
		c.start();


	}

}
