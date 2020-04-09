package org.ksshop.pay.entities;

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

	private Long id;

	private String msg;

}
