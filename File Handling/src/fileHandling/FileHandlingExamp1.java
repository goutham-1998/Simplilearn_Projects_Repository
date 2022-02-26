//PROGRAM TO CREATE AND WRITE A FILE

package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExamp1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Simplilearn Java Assisted Projects\\SampleFile.txt");
   
		 if (file.createNewFile())
		 {
			 System.out.println("File Created Successfully");
			 
		 }
		 
		 else {
			 System.out.println("File Already Exists");D
		 }
		 
		 String data = "Hello World!!!, This is an example for Writing the File";
		 FileWriter writer = new FileWriter(file);
			writer.append(data);
						
			String data2 = "\nThis is an Example to Append a file";
			writer.append(data2);
			writer.close();
			
			}
}
