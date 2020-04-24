package com.accp.clg;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AlipayService {
	 String  aliPay(HttpServletResponse response, HttpServletRequest request,String smid,Integer state) throws IOException;
}
