package cn.itcast.service.impl;

import cn.itcast.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("hahahaha");
        return "hello："+name;
    }
}
