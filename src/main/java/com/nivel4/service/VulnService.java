package com.nivel4.service;

import java.io.IOException;
import java.sql.SQLException;

public class VulnService {
    

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
