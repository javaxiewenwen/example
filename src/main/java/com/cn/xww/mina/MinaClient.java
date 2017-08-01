package com.cn.xww.mina;

import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

import org.apache.mina.core.service.IoConnector;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;


public class MinaClient {
	 private IoConnector ioConnector;
	    
	    public MinaClient(String host, int port){
	        ioConnector = new NioSocketConnector();
	        //过滤信息，封装成文本格式输出
	        ioConnector.getFilterChain().addLast("test", new ProtocolCodecFilter(new TextLineCodecFactory()));
	        
	        ioConnector.setHandler(new ClientHandler("Hello world!"));
	        ioConnector.connect(new InetSocketAddress(host, port));
	    	
	    }
	    public static void main(String[] args) {
			new MinaClient("127.0.0.1",9001);
			
		}
}
