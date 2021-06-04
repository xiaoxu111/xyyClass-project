package com.aliwo.service;

import com.aliwo.model.AddressDO;

/**
 * <p>
 * 电商-公司收发货地址表 服务类
 * </p>
 *
 * @author xuyy
 * @since 2021-06-04
 */
public interface AddressService {
    AddressDO getAddressById(Long id);

}
