package com.nivel4.service;

import java.io.IOException;
import java.sql.SQLException;
import java.io.FileOutputStream;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.Charset;

public class VulnService {
   
       protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
  String json = "{\"key\":\""+req.getParameter("value")+"\"}";
  FileOutputStream fos = new FileOutputStream("output.json");
  fos.write(json.getBytes(Charset.forName("UTF-8")));  // Noncompliant
}

    public void CommandInjectionVulnerability(String path) throws SQLException, IOException {

	Runtime runtime = Runtime.getRuntime();
	
	String[] command = "rm -rf /tmp/blah".split(".");
	
	if (path != null) {
	
		command[command.length -1] = path;
	
	}
	
	runtime.exec(command);

    }

    public int multiply(int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
