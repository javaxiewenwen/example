package com.cn.xww.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class BTask {
	//@Scheduled(cron="0/5 * *  * * ? ")
	public void bTask(){
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date())+"*********B����ÿ5��ִ��һ�ν������");
	}

}
