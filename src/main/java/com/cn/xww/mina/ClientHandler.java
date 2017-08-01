package com.cn.xww.mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class ClientHandler extends IoHandlerAdapter{
	 //���͸�����˵���Ϣ
    private String sendToServer;
    
    public ClientHandler(String words)
    {
        sendToServer = words;
    }
    
    @Override
    public void sessionOpened(IoSession session) throws Exception {
    	System.out.println("������Ϣ��ʼ");
        session.write(sendToServer);
        System.out.println("������Ϣ����");
    }
//    public static void main(String[] args) {
//		new MinaClient("128.0.0.1",9001);
//	}
}
