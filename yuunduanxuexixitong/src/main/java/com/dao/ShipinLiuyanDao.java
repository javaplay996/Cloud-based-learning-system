package com.dao;

import com.entity.ShipinLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinLiuyanView;

/**
 * 学习视频留言 Dao 接口
 *
 * @author 
 * @since 2021-05-03
 */
public interface ShipinLiuyanDao extends BaseMapper<ShipinLiuyanEntity> {

   List<ShipinLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
