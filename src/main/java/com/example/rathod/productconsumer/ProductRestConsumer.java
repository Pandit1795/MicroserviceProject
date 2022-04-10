package com.example.rathod.productconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PRODUCT-MICRO")
public interface ProductRestConsumer {

	
	
	@GetMapping("/material/show")
	public ResponseEntity<String> materialShow();
	
}
