package com.mscustomer.ms_customer.service;

import com.mscustomer.ms_customer.web.model.mCustomer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface iCustomerService {
//implementacion de metodos
	Mono<mCustomer>crearCliente(Mono<mCustomer>mcustomer);
	
	Flux<mCustomer>listarTodos();
}
