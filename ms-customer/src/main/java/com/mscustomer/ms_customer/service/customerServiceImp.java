package com.mscustomer.ms_customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mscustomer.ms_customer.repository.iCustomerRepository;
import com.mscustomer.ms_customer.web.model.mCustomer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class customerServiceImp implements iCustomerService {
	
	@Autowired
	iCustomerRepository icustomerRepository;

	//@Override
	public Mono<mCustomer> crearCliente(Mono<mCustomer> customerMono) {
		return customerMono.flatMap(icustomerRepository::insert);
	}
	//@Override
	public Flux<mCustomer>listarTodos(){
		return icustomerRepository.findAll();
	}
}
