package cn.itcast.web;

import cn.itcast.service.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping(value = "/hello", produces = "application/json;charset=utf-8")
    @ResponseBody
    public String hello(){
        String result = helloService.sayHello("唐菲依");
        return result;
    }

}
