package cn.itcast.core.dao;

import cn.itcast.core.bean.TestTb;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试
 * @author  1x
 */
@Repository
public interface TestTbDao {

    //保存
    public void insertTestTb(TestTb testTb);
}
