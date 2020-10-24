package com.nh.zk.port;

import java.io.*;
 
public class MyTest {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		Process process = null;
		try {
			process = runtime.exec("netstat -a");
		} catch (IOException e) {
			e.printStackTrace();
		}
		InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
		BufferedReader br = new BufferedReader(inputStreamReader);
		PrintWriter writer = new PrintWriter(System.out);
		
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				writer.println(line);
			}
			writer.flush();
			writer.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}