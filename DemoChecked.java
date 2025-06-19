package day5;

import java.io.File;
import java.io.IOException;

public class DemoChecked {

	public static void createFile (String file) throws IOException
	{
		File f = new File(file);
		
		if(!f.exists())
		{
			f.createNewFile();
		}
	}
	public static void main(String[] args) {
		/*unlike unchecked exception, a check exception must either be declared or handled
		 * One can handle checked exception anywhere in the calling stack
		 * */
		try {
			DemoChecked.createFile("test.txt");
			}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
