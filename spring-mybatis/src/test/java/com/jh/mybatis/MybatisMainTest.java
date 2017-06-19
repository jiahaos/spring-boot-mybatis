package com.jh.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiah on 2017/6/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class MybatisMainTest {

    @Autowired
    TestMapper shopMapper;

    @Test
    public void domainTest() {
        Map<String, Object> paraMap = new HashMap<String, Object>();
        List<Integer> list = shopMapper.selectTestByParam(paraMap);
        System.out.print("测试结果：" + list.toString());
    }
}
