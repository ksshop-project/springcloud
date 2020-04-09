package com.ksshop.pay.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-04-09
 */
@Data
@Accessors(chain = true)
public class Pay {

	@TableId(type = IdType.AUTO)
	private Long id;

	private String serial;

}
