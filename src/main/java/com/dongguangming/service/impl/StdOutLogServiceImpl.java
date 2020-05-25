package com.dongguangming.service.impl;

import com.dongguangming.service.LogService;

/**
 * @author dgm
 * @describe "日志到控制台"
 * @date 2020年5月22日
 */
public class StdOutLogServiceImpl implements LogService {

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
        System.out.println(message);
        System.out.println("写日志到控制台！");
	}
}
