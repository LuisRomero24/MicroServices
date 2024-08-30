package com.mscustomer.ms_customer.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.mscustomer.ms_customer.web.model.mCustomer;

@Repository
public interface iCustomerRepository extends ReactiveMongoRepository<mCustomer, Integer> {
	//List<mCustomer> findByNameIgnoreCaseAndDescriptionIgnoreCase(String name, String Description);

}
