package com.ksshop.pay.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KsResp<T> {

	private Integer code;

	private String msg;

	private T data;

	public static <T> KsResp<T> fail(Integer code, String msg) {
		return new KsResp<T>(code, msg, null);
	}

	public static <T> KsResp<T> success(Integer code, T data) {
		return new KsResp<T>(code, null, data);
	}

}
