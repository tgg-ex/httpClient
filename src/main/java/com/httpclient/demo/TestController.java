package com.httpclient.demo;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zeng
 * <p>
 * 测试控制器
 */
@RestController
@Slf4j
public class TestController {

    @RequestMapping("/testGet")
    public String testGet(@RequestParam("name") String name, @RequestParam("age") Integer age) {
//        Thread.sleep(6000);
        log.info("name：" + name + " age：" + age);
        return "ok";
    }

    @RequestMapping("/testPost")
    public String testPost(@RequestBody JSONObject jsonObject) {
        JSONObject user = jsonObject.getJSONObject("user");
        log.info("user：" + JSONObject.toJSONString(user));
        return "post ok";
    }

    @RequestMapping("/testPostNoParam")
    public String testPostNoParam() {
        log.info("ok----------");
        return "post ok no param";
    }
}
