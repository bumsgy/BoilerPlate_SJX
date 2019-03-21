package com.bp.web.test.dao;

import com.bp.web.comm.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository(value="testDao")
public class TestDao extends BaseDao {

    public void test() {
        sqlSession.selectList("code.selectCodeList", null);
    }
}
