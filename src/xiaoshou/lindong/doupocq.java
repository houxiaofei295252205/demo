package xiaoshou.lindong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class doupocq {
public static void main(String[] args) throws IOException {
	

	File file=new File("shengxu//圣墟.txt");
	System.out.println(file.exists());
	Reader read=new FileReader(file);
	@SuppressWarnings("resource")
	BufferedReader br=new BufferedReader(read);
	String line="";
	while (null !=(line=br.readLine())) {
		if (line.contains("正文")) {
			System.out.println(line);
			
		}else {
			//System.out.println("打印正文");
		}
		
	}
	
}
}