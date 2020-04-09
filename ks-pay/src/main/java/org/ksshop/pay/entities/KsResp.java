package org.ksshop.pay.entities;

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

	public KsResp(Integer code, String msg) {
		this(code, msg, null);
	}

	public KsResp(Integer code, T data) {
		this(code, null, data);
	}

}
