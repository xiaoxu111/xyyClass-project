package com.aliwo.mapper;

import com.aliwo.model.AddressDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 电商-公司收发货地址表 Mapper 接口
 * </p>
 *
 * @author xuyy
 * @since 2021-06-04
 */
@Mapper
public interface AddressMapper extends BaseMapper<AddressDO> {

}
