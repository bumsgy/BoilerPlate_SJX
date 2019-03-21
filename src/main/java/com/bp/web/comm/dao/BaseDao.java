package com.bp.web.comm.dao;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

public class BaseDao {
    protected Logger log = LoggerFactory.getLogger(this.getClass().getCanonicalName());

    @Resource(name = "sqlSession")  ///WEB-INF/config/context/sample-mybatis-context.xml파일에서 설정한 DB 연결세션
    protected SqlSession sqlSession;
}
