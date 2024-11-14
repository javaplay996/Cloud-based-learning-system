package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinLiuyanEntity;
import java.util.Map;

/**
 * 学习视频留言 服务类
 * @author 
 * @since 2021-05-03
 */
public interface ShipinLiuyanService extends IService<ShipinLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}