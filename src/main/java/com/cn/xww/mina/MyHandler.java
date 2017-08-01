package com.cn.xww.mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class MyHandler extends IoHandlerAdapter{
	 //当一个客户端连接进入时  
    @Override  
    public void sessionOpened(IoSession session)throws Exception {  
        System.out.println("incoming client:"+session.getRemoteAddress());  
    }  
	 /**接收到信息后进行逻辑处理*/
    @Override
    public void messageReceived(IoSession session, Object message)
            throws Exception {
        String getmessage = message.toString();
        System.out.println("接受到消息了"+getmessage);
    }
    //当一个客户端连接关闭时  
    @Override  
    public void sessionClosed(IoSession session)throws Exception {  
        System.out.println("one client closed");  
    }  
//    public static void main(String[] args) {
//    	new MinaServer(9001);
//	}
}
