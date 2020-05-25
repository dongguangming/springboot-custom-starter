package com.dongguangming.service.impl;

import com.dongguangming.service.LogService;

/**
 * @author dgm
 * @describe "写日志入mysql数据库"
 * @date 2020年5月22日
 */
public class MysqlLogServiceImpl implements LogService {

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
        System.out.println(message);
        System.out.println("写日志入数据库");
	}
}
