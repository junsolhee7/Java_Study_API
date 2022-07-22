package com.iu.io.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	public void write() throws Exception {
		File file = new File("C:\\study\\test.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("Today is Friday \r\n");
//		fw.flush();
		
		fw.write("Tommorow is Saturday \r\n");
		fw.flush();
		
		
	}

}
