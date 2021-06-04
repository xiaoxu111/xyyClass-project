package com.aliwo.controller;


import com.aliwo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 电商-公司收发货地址表 前端控制器
 * </p>
 *
 * @author xuyy
 * @since 2021-06-04
 */
@RestController
@RequestMapping("/api/address/v1")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public Object getAddressById(@PathVariable("id") Long id) {
        return addressService.getAddressById(id);
    }

}

