package org.ksshop.pay.service.impl;

import org.ksshop.pay.entities.Pay;
import org.ksshop.pay.mapper.PayMapper;
import org.ksshop.pay.service.IPayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-04-09
 */
@Service
public class PayServiceImpl extends ServiceImpl<PayMapper, Pay> implements IPayService {

}
