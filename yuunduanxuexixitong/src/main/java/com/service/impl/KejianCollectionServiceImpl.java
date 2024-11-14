package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.KejianCollectionDao;
import com.entity.KejianCollectionEntity;
import com.service.KejianCollectionService;
import com.entity.view.KejianCollectionView;

/**
 * 学习课件收藏 服务实现类
 * @author 
 * @since 2021-05-03
 */
@Service("kejianCollectionService")
@Transactional
public class KejianCollectionServiceImpl extends ServiceImpl<KejianCollectionDao, KejianCollectionEntity> implements KejianCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<KejianCollectionView> page =new Query<KejianCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
