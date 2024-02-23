package readFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DictionaryReader {
	
	 public static void main(String[] args) {
		  
		  String path = "/Users/nabil/eclipse-level1/Practical2/myFile/file.txt";
		  
		          doesFileExist(path);
		  } 

	 
		  public static void doesFileExist(String path) {
		        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
		            String line;
		            while ((line = reader.readLine()) != null) {
		                String[] parts = line.split("-");
		                String word = parts[0].trim();
		                String[] meanings = parts[1].split(",");
		                
		                System.out.println(word);
		                for (String meaning : meanings) {
		                    System.out.println(meaning.trim());
		                }
		                System.out.println();
		            }
		        } catch (IOException e) {
		            System.out.println("File not found at the specified path.");
		        }
		    }

		  
		  }


