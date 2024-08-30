package com.mscustomer.ms_customer.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import com.mscustomer.ms_customer.service.iCustomerService;
import com.mscustomer.ms_customer.web.model.mCustomer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class customerController {
	@Autowired
	iCustomerService icustomerservice;

	@PostMapping("crearCliente")
	@ResponseStatus()
	public Mono<mCustomer> crearCliente(@RequestBody mCustomer mcustomer) {
		return icustomerservice.crearCliente(Mono.just(mcustomer));
	}
	
	@GetMapping(value = "listarTodos", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<mCustomer>listarRodos() {
		return icustomerservice.listarTodos();
	}
	

}
