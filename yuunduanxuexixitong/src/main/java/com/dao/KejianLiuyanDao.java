package com.dao;

import com.entity.KejianLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KejianLiuyanView;

/**
 * 学习课件留言 Dao 接口
 *
 * @author 
 * @since 2021-05-03
 */
public interface KejianLiuyanDao extends BaseMapper<KejianLiuyanEntity> {

   List<KejianLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
