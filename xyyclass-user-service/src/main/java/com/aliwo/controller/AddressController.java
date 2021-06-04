package com.aliwo.controller;


import com.aliwo.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api(tags = "收货地址模块")
@RestController
@RequestMapping("/api/address/v1")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @ApiOperation("根据id查询地址详情")
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public Object getAddressById(@ApiParam(value = "地址id", required = true) @PathVariable("id") Long id) {
        return addressService.getAddressById(id);
    }

}

