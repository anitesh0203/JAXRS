package com.leet;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileSystem {
	
	
 public FileSystem()
 {
	 System.out.println("[]");
 }
  public List<String> ls(String path) {
    // IMPLEMENT ME   

	throw new UnsupportedOperationException();
  }

  public void mkdirP(String dirPath) {
    // IMPLEMENT ME
	  
	  try{
//		  Path dir = Paths.get(dirPath);
//		  Files.createDirectory(dir);
//		  new File(dirPath).mkdir();
		  new File(dirPath.replaceAll("/", "\\\\")).mkdir();

		  
	  }catch(Exception e ){
		  e.printStackTrace();
		   throw new UnsupportedOperationException();
	  }
	  }

  public void addFileWithContent(String filePath, String content) {
    // IMPLEMENT ME
    throw new UnsupportedOperationException();
  }

  public String getFileContent(String filePath) {
    // IMPLEMENT ME
    throw new UnsupportedOperationException();
  }

  public static void main(String[] args) {
    // assumption: all path starts with / and do not end with /
    FileSystem fs = new FileSystem();

    // should print []
//    System.out.println(fs.ls("/"));

    fs.mkdirP("/a/b/c");

  }
}
