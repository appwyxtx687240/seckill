package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Winter on 16/8/3.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;
    @Test
    public void insertSuccessKilled() throws Exception {
        long id = 1001L;
        long phone = 12411112222L;
        int insertCount =  successKilledDao.insertSuccessKilled(id, phone);
        System.out.println("insertCount = " + insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id = 1001L;
        long phone = 12411112222L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
        /**
         *
         * SuccessKilled{seckillId=1001, userPhone=12411112222, state=0, createTime=Thu Aug 04 07:47:04 CST 2016}
         Seckill{seckillId=1001, name='500元秒杀iPad2', number=0, startTime=Tue Nov 01 14:00:00 CST 2005, endTime=Wed Nov 02 14:00:00 CST 2005, createTIme=Thu Aug 04 05:00:17 CST 2016}

         */
    }

}