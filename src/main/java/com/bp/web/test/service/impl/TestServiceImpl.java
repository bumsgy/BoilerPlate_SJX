package com.bp.web.test.service.impl;

import com.bp.web.comm.service.BaseService;
import com.bp.web.test.dao.TestDao;
import com.bp.web.test.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value="testService")
public class TestServiceImpl extends BaseService implements TestService  {
    @Resource(name="testDao")
    TestDao testDao;

    @Override
    public void test() {
        testDao.test();
System.out.println("AAAAAAAAAAAAAAAAAAA");
    }
}
