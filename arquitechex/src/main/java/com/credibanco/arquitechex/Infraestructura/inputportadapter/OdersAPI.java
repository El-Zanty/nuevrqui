package com.credibanco.arquitechex.Infraestructura.inputportadapter;

import org.springframework.beans.factory.annotation.Autowired;

import com.credibanco.arquitechex.Infraestructura.inputport.IOrderInputPort;

public class OdersAPI {

	@Autowired
	IOrderInputPort iOrderInputPort;
}
