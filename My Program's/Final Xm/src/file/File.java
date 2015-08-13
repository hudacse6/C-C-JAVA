package file;

import java.io.IOException;

public class File {

	public static void main(String[] args)
	{
		try {
			File file=new File("D:/myfile.txt");
			if (file.createNewFile())
			System.out.print("success");
			else 
				System.out.print("error,file already exist");
				
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
