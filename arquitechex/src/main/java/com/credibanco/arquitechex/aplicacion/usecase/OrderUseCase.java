package com.credibanco.arquitechex.aplicacion.usecase;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.credibanco.arquitechex.Infraestructura.inputport.IOrderInputPort;
import com.credibanco.arquitechex.Infraestructura.outputport.IEntityRepository;
import com.credibanco.arquitechex.domain.Orders;

public class OrderUseCase implements IOrderInputPort {
	@Autowired
	IEntityRepository iEntityRepository;

	@Override
	public Orders createOrder(String customerId, BigDecimal total) {
		// TODO Auto-generated method stub
		return null;
	}

}
