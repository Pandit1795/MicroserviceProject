package com.example.rathod.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rathod.productconsumer.ProductRestConsumer;

@RestController
@RequestMapping("/order")

public class OrderRestController {
	@Autowired
	private ProductRestConsumer prod;
	
	@GetMapping("/normal")
	public ResponseEntity<String> orderDate(){
		ResponseEntity<String> resp=prod. materialShow();
		
		return  ResponseEntity.ok ("are from u"  + resp.getBody());
	}

}
