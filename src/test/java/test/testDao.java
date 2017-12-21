package test;

import com.shuidian.dao.AccountDao;
import com.shuidian.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-hibernate.xml")
public class testDao {

    @Autowired
    private AccountDao accountDao;

    @Test
    public void testGet(){
        System.out.println(accountDao.getByTimeAndRoomId("2017-11","10-111").get(0).getName());
    }
}
