package com.credibanco.arquitechex.aplicacion.usecase;

import org.springframework.beans.factory.annotation.Autowired;

import com.credibanco.arquitechex.Infraestructura.inputport.ICustomerInputPort;
import com.credibanco.arquitechex.Infraestructura.outputport.IEntityRepository;

public class CustomersUseCasae  implements ICustomerInputPort{

	@Autowired
	IEntityRepository iEntityRepository;
}
