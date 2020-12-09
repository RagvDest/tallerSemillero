package com.clearminds.rgv.excepciones;

import java.io.Serializable;
import java.sql.SQLException;

public class BDDException extends Exception 
							implements Serializable{

	public BDDException(String message) {
		super(message);
	}

}
