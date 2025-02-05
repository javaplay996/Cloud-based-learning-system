package com.dao;

import com.entity.ShipinCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinCollectionView;

/**
 * 学习视频收藏 Dao 接口
 *
 * @author 
 * @since 2021-05-03
 */
public interface ShipinCollectionDao extends BaseMapper<ShipinCollectionEntity> {

   List<ShipinCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
