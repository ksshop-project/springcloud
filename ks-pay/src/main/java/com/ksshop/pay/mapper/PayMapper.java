package com.ksshop.pay.mapper;

import com.ksshop.pay.entities.Pay;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-04-09
 */
@Mapper
public interface PayMapper extends BaseMapper<Pay> {

}
