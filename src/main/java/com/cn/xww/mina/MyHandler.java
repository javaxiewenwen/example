package com.cn.xww.mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class MyHandler extends IoHandlerAdapter{
	 //��һ���ͻ������ӽ���ʱ  
    @Override  
    public void sessionOpened(IoSession session)throws Exception {  
        System.out.println("incoming client:"+session.getRemoteAddress());  
    }  
	 /**���յ���Ϣ������߼�����*/
    @Override
    public void messageReceived(IoSession session, Object message)
            throws Exception {
        String getmessage = message.toString();
        System.out.println("���ܵ���Ϣ��"+getmessage);
    }
    //��һ���ͻ������ӹر�ʱ  
    @Override  
    public void sessionClosed(IoSession session)throws Exception {  
        System.out.println("one client closed");  
    }  
//    public static void main(String[] args) {
//    	new MinaServer(9001);
//	}
}
