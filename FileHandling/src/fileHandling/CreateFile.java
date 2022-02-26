package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();
		createFileUsingFileOutputStreamClass();
		createFileIn_NIO();
	}
	
	private static void createFileIn_NIO() throws IOException {
		String data = "This is an example";
		 Files.write(Paths.get("C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\Simplilearn Java Assisted Projects\\\\TestFile3.txt"), data.getBytes());
	        List<String> lines = Arrays.asList("1st line", "2nd line");
	       Files.write(Paths.get("file6.txt"),
	                    lines,
	                    StandardCharsets.UTF_8,
	                    StandardOpenOption.CREATE,
	                    StandardOpenOption.APPEND);
		
	}

	private static void createFileUsingFileOutputStreamClass() throws IOException {
		String data = "This is an example";
		FileOutputStream out = new FileOutputStream("C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\Simplilearn Java Assisted Projects\\\\TestFile2.txt");
		out.write(data.getBytes());
		out.close();
				
	}

	private static void createFileUsingFileClass() throws IOException {
		File file =new File("C:\\Users\\ASUS\\OneDrive\\Desktop\\Simplilearn Java Assisted Projects\\TestFile1.txt");
		
		
		if(file.createNewFile())
		{
			System.out.println("File is created!");
		}
		
		else
		{
			System.out.println("File already exists.");
		}
		
		
		FileWriter writer =new FileWriter(file);
		writer.write("This is an example");
		writer.close();
	}
	


}
