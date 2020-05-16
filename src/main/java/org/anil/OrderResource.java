package org.anil;

import java.util.List;

import org.anil.service.OrderService;
import org.anil.ui.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderResource {

	@Autowired
	OrderService orderService;
	
	@GetMapping("/")
	public String getRoot() {
		return "order-microservice-root";
	}
	
	@GetMapping("/orders/{id}")
	public List<ResponseBean> getOrders(@PathVariable Long id) {
		return orderService.getOrder();
	}
	
	
}
