package com.cn.xww.mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class ClientHandler extends IoHandlerAdapter{
	 //发送给服务端的消息
    private String sendToServer;
    
    public ClientHandler(String words)
    {
        sendToServer = words;
    }
    
    @Override
    public void sessionOpened(IoSession session) throws Exception {
    	System.out.println("发送消息开始");
        session.write(sendToServer);
        System.out.println("发送消息结束");
    }
//    public static void main(String[] args) {
//		new MinaClient("128.0.0.1",9001);
//	}
}
