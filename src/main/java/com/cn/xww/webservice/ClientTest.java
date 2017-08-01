package com.cn.xww.webservice;

import java.net.MalformedURLException;

import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

import com.cn.xww.webservice.client.HelloService;
import com.cn.xww.webservice.client.HelloServicePortType;





public class ClientTest {
	public static void main(String args[]) throws MalformedURLException {  
//        Service service = new ObjectServiceFactory().create(IHelloService.class);  
//        XFireProxyFactory factory = new XFireProxyFactory(XFireFactory  
//                .newInstance().getXFire());  
//        String url = "http://localhost:8080/example/servces/HelloService";  
//        IHelloService helloService = (IHelloService) factory.create(service,url); 
//        System.out.println(helloService.sayHello("张三")); 
		HelloService service = new HelloService();
		 HelloServicePortType portType = service.getHelloServiceHttpPort();
		System.out.println(portType.sayHello("李四")); 
		 
    }  
}
