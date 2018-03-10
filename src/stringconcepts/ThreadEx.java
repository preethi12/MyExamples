package stringconcepts;

public class ThreadEx extends Thread{
	public void loop() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
	}

	public void run()
	{
		
		try {
	
			this.loop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		ThreadEx tx=new ThreadEx();
		tx.start();
	}

}
