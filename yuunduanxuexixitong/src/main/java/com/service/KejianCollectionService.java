package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KejianCollectionEntity;
import java.util.Map;

/**
 * 学习课件收藏 服务类
 * @author 
 * @since 2021-05-03
 */
public interface KejianCollectionService extends IService<KejianCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}