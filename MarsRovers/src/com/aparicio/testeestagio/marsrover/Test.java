package com.aparicio.testeestagio.marsrover;

public class Test {
	public static void main (String[] args) {
		String input = "5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM";
		
		MarsRover mr = new MarsRover();
		String output = mr.execute(input);
		
		System.out.println("output = " + output);
	}
}
