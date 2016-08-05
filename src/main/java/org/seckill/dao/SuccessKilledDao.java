package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;
import org.springframework.stereotype.Repository;

/**
 * Created by Winter on 16/8/3.
 */
@Repository(value="successKilledDao")
public interface SuccessKilledDao {

    /**
     * 插入购买明细, 可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 插入的行数, 返回0表示插入失败
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据id查询SuccessKilled, 并拾秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
