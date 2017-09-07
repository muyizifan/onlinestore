package cn.itcast.core.service;


import cn.itcast.core.bean.TestTb;
import cn.itcast.core.dao.TestTbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试
 * @author 1x
 */
@Service("testTbService")
@Transactional
public class TestTbServiceImpl implements TestTbService{

    @Autowired
    private TestTbDao testTbDao;

    public void insertTestTb(TestTb testTb){
        testTbDao.insertTestTb(testTb);
        //throw new RuntimeException();
    }
}
