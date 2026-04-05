package com.Skillio.Atm_management;

public class Cardblockedexception extends Exception {
	
	@Override
	public String getMessage() {
		return "visit your bank but not go on lunch time";
	}
}
