package com.sfc.springsecurity.service;

import com.sfc.springsecurity.entity.RoleGrantedAuthority;
import com.sfc.springsecurity.entity.UserDetail;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetail user=new UserDetail();
        List<RoleGrantedAuthority> list=new ArrayList<>();
        list.add(new RoleGrantedAuthority("user"));
        list.add(new RoleGrantedAuthority("admin"));
        user.setName("sfc");
        user.setAuthorities(list);
        user.setPwd("$2a$10$3BjOx8sryCw8kDQHkccT4ulixQ4hzzmIEEAzRk3KKIAFL4v.g.MdK");
        return user;
    }
}
