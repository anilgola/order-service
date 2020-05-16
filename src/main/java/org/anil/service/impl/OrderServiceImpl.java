package org.anil.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.anil.service.OrderService;
import org.anil.ui.ResponseBean;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public List<ResponseBean> getOrder() {
		
		
		List<ResponseBean> list = new ArrayList<>();
		
		ResponseBean rs1 = new ResponseBean();
		rs1.setOrderId("1");
		rs1.setOrderAmount(250);
		rs1.setOrderDate(new Date());
		
		ResponseBean rs2 = new ResponseBean();
		rs2.setOrderId("2");
		rs2.setOrderAmount(450);
		rs2.setOrderDate(new Date());
		
		list.add(rs1);
		list.add(rs2);
		return list;
		
	}

}
