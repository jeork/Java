package com.oj.may271.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {
	public static void main(String[] args) {

		BufferedReader br = null;
		try {

			FileReader fr = new FileReader("C:\\Users\\sdedu\\Desktop\\Test/oj.txt");
			br = new BufferedReader(fr);

			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
