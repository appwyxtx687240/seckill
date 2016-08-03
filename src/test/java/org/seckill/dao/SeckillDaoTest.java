package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Winter on 16/8/3.
 */
//配置spring和junit整合 ,junit启动地加载springIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉 junit spring 配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //注入Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;


    @Test
    public void queryById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
        /**
         *
         * 1000元秒杀iPhone6
         Seckill{seckillId=1000, name='1000元秒杀iPhone6', number=100, startTime=Tue Nov 01 14:00:00 CST 2005, endTime=Wed Nov 02 14:00:00 CST 2005, createTIme=Thu Aug 04 05:00:17 CST 2016}
         */
    }

    @Test
    public void queryAll() throws Exception {
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        for (Seckill seckill : seckills){
            System.out.println(seckill);
        }
        /**
         * Seckill{seckillId=1000, name='1000元秒杀iPhone6', number=100, startTime=Tue Nov 01 14:00:00 CST 2005, endTime=Wed Nov 02 14:00:00 CST 2005, createTIme=Thu Aug 04 05:00:17 CST 2016}
         Seckill{seckillId=1001, name='500元秒杀iPad2', number=200, startTime=Tue Nov 01 14:00:00 CST 2005, endTime=Wed Nov 02 14:00:00 CST 2005, createTIme=Thu Aug 04 05:00:17 CST 2016}
         Seckill{seckillId=1002, name='300元秒杀小米4', number=300, startTime=Tue Nov 01 14:00:00 CST 2005, endTime=Wed Nov 02 14:00:00 CST 2005, createTIme=Thu Aug 04 05:00:17 CST 2016}
         Seckill{seckillId=1003, name='200元秒杀红米note', number=400, startTime=Tue Nov 01 14:00:00 CST 2005, endTime=Wed Nov 02 14:00:00 CST 2005, createTIme=Thu Aug 04 05:00:17 CST 2016}
         */
    }

    @Test
    public void reduceNumber() throws Exception {
        Date killTime = new Date();
        int updateCount  = seckillDao.reduceNumber(1000L, killTime);
        System.out.println("updateCount = " + updateCount);

    }


}