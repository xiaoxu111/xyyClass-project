package com.aliwo.service.impl;

import com.aliwo.model.UserDO;
import com.aliwo.mapper.UserMapper;
import com.aliwo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuyy
 * @since 2021-06-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

}
