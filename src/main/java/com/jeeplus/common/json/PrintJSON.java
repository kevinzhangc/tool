/**
 \* Copyright &copy; 2018-2020 <a href="http://www.shshinesun.cn/">Tool</a> All rights reserved.
 */
package com.jeeplus.common.json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class PrintJSON {
	
	
	public static void write(HttpServletResponse response,String content) {
		response.reset();
		response.setContentType("application/json");
		response.setHeader("Cache-Control", "no-store");
		response.setCharacterEncoding("UTF-8");
		try {
			PrintWriter pw=response.getWriter();
			pw.write(content);
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
