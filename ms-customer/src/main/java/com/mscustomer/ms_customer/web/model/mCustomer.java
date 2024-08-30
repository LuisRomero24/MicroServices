package com.mscustomer.ms_customer.web.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data //Genera los getter y setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document //Para  base de datos no relacional
public class mCustomer {

	@Id 

	private Integer code;
	private String name;
	private String description;
}
