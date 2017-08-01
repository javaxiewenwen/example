package com.cn.xww.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ATask {
	//@Scheduled(cron="0/10 * *  * * ? ")
	public void aTask(){
		try {
			TimeUnit.SECONDS.sleep(20);
			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(sdf.format(new Date())+"*********A任务每10秒执行一次进入测试");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
