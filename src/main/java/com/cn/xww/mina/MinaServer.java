package com.cn.xww.mina;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class MinaServer {
private IoAcceptor ioAcceptor;
    
    public MinaServer(int port)
    {
        ioAcceptor = new NioSocketAcceptor();
        try {
            //���ô�����
            ioAcceptor.setHandler(new MyHandler());
            //�󶨶˿�
            ioAcceptor.bind(new InetSocketAddress(port));
            //�涨Э�飬�趨���ˣ�������TextLineCodecFactory�ı�Э��
            ioAcceptor.getFilterChain().addLast("test", new ProtocolCodecFilter(new TextLineCodecFactory()));
            System.out.println("Mina Server is Listen on:"+port);  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    	new MinaServer(9001);
	}
}
