package cn.itcast;

import cn.itcast.core.bean.TestTb;
import cn.itcast.core.dao.TestTbDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * 测试类junit+Spring
 * @author 1x
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTbTest {

    @Autowired
    private TestTbDao testTbDao;

    @Test
    public void testAdd() throws Exception{
        TestTb testTb=new TestTb();
        testTb.setName("范冰冰");
        testTb.setBirthday(new Date());
        testTbDao.insertTestTb(testTb);
    }
}
