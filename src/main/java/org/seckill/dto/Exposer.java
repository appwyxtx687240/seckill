package org.seckill.dto;

/**
 * 暴露秒杀地址DTO
 * Created by Winter on 16/8/5.
 */
public class Exposer {

    //是否开启秒杀
    private Boolean exposed;
    //一种加密措施
    private String md5;

    private long seckillId;

    //系统当前时间(毫秒)
    private long now;

    //开启时间
    private long start;

    //结束时间
    private long end;

    public Exposer(Boolean exposed, String md5, long seckillId) {
        this.exposed = exposed;
        this.md5 = md5;
        this.seckillId = seckillId;
    }

    public Exposer(Boolean exposed, long seckillId, long now, long start, long end) {
        this.exposed = exposed;
        this.now = now;
        this.start = start;
        this.end = end;
        this.seckillId = seckillId;
    }

    public Exposer(Boolean exposed, long seckillId) {
        this.exposed = exposed;
        this.seckillId = seckillId;
    }

    public Boolean getExposed() {
        return exposed;
    }

    public void setExposed(Boolean exposed) {
        this.exposed = exposed;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }
}

