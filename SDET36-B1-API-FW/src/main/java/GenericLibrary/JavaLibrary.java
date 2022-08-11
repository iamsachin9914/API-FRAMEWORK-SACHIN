package GenericLibrary;

import java.util.Random;

public class JavaLibrary 
{
	/**
	 * 
	 * @return
	 */
	public int getRandomNumber()
	{
		Random r=new Random();
		int random = r.nextInt(1000);
		return random;
	}

}
