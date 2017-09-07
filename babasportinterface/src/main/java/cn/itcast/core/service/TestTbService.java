package cn.itcast.core.service;

import cn.itcast.core.bean.TestTb;
import org.springframework.stereotype.Repository;

@Repository
public interface TestTbService {
    public void insertTestTb(TestTb testTb);
}
