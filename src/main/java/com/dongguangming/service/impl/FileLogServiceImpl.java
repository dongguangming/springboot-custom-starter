package com.dongguangming.service.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.dongguangming.service.LogService;

/**
 * 
 * @author dgm
 * @describe "日志到文件"
 * @date 2020年5月22日
 */
public class FileLogServiceImpl implements LogService {

	private static final String FILE_NAME="d://LogService.txt";
	@Override
	public void print(String message) {
		try {
			File file = new File(FILE_NAME);
			FileWriter fw = null;
			// true:表示是追加的标志
			fw = new FileWriter(file, true);
			fw.write(message+"\n");
			fw.close();

	        System.out.println(message);
			System.out.println("写日志入文件！");
		} catch (IOException e) {
		}
	}
}
