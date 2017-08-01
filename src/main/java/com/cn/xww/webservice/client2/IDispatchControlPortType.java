
package com.cn.xww.webservice.client2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "IDispatchControlPortType", targetNamespace = "http://control.ppcore.haobai.huateng.com")
public interface IDispatchControlPortType {

	/**
	 * 
	 * @param in0
	 * @param in1
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(name = "out", targetNamespace = "http://control.ppcore.haobai.huateng.com")
	@RequestWrapper(localName = "dispatchCommand", targetNamespace = "http://control.ppcore.haobai.huateng.com", className = "com.cn.xww.webservice.client2.DispatchCommand")
	@ResponseWrapper(localName = "dispatchCommandResponse", targetNamespace = "http://control.ppcore.haobai.huateng.com", className = "com.cn.xww.webservice.client2.DispatchCommandResponse")
	public String dispatchCommand(
			@WebParam(name = "in0", targetNamespace = "http://control.ppcore.haobai.huateng.com") String in0,
			@WebParam(name = "in1", targetNamespace = "http://control.ppcore.haobai.huateng.com") String in1);

}