package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KejianEntity;
import java.util.Map;

/**
 * 学习课件 服务类
 * @author 
 * @since 2021-05-03
 */
public interface KejianService extends IService<KejianEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}