package com.credibanco.arquitechex.Infraestructura.inputportadapter;

import org.springframework.beans.factory.annotation.Autowired;

import com.credibanco.arquitechex.Infraestructura.inputport.ICustomerInputPort;

public class CustomerAPI {
	@Autowired
	ICustomerInputPort iCustomerInputPort;

}
