package count.base;

public class Count {

    public Count(){
        
    }
    
	public void countDown(int count) {
	   
		for (int i = count; i > 0; i--)
			System.out.println(i);

		System.out.println("\nTime up!");
	}


      public void countUp(int count) {
	
		for (int i = 1; i <= count; i++)
			System.out.println(i);

		System.out.println("\nAll done!");
	}

     
	
}
