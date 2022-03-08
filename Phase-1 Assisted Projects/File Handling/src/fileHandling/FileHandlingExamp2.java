
//PROGRAM TO READ A FILE

package fileHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; 

public class FileHandlingExamp2 {

	public static void main(String[] args) throws IOException {
	
		FileReader fr=new FileReader("C:\\\\Users\\\\ASUS\\\\OneDrive\\\\Desktop\\\\Simplilearn Java Assisted Projects\\\\SampleFile.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    

	}

}
