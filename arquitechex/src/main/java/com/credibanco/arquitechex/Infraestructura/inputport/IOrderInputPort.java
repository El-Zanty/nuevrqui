package com.credibanco.arquitechex.Infraestructura.inputport;

import java.math.BigDecimal;

import com.credibanco.arquitechex.domain.Orders;

public interface IOrderInputPort {
	
	public Orders createOrder (String customerId, BigDecimal total);
}
