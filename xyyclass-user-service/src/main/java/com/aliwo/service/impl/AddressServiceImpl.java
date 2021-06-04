package com.aliwo.service.impl;

import com.aliwo.model.AddressDO;
import com.aliwo.mapper.AddressMapper;
import com.aliwo.service.AddressService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 电商-公司收发货地址表 服务实现类
 * </p>
 *
 * @author xuyy
 * @since 2021-06-04
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public AddressDO getAddressById(Long id) {
        return addressMapper.selectOne(new QueryWrapper<AddressDO>().eq("id", id));
    }
}
