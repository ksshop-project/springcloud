package com.ksshop.pay.controller;

import com.ksshop.pay.entities.KsResp;
import com.ksshop.pay.entities.Pay;
import com.ksshop.pay.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController {

	@Autowired
	private IPayService iPayService;

	@RequestMapping("pay")
	public String pay() {
		return "abc";
	}

	@GetMapping(value = "/pay/get/{id}")
	public KsResp<Pay> getPayById(@PathVariable("id") Long id) {
		Pay data = iPayService.getById(id);
		if (data != null) {
			return KsResp.success(200, data);
		} else {
			return KsResp.fail(444, null);
		}
	};

}
