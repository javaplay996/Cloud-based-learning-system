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

import com.dao.KechengCollectionDao;
import com.entity.KechengCollectionEntity;
import com.service.KechengCollectionService;
import com.entity.view.KechengCollectionView;

/**
 * 课程信息收藏 服务实现类
 * @author 
 * @since 2021-05-03
 */
@Service("kechengCollectionService")
@Transactional
public class KechengCollectionServiceImpl extends ServiceImpl<KechengCollectionDao, KechengCollectionEntity> implements KechengCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<KechengCollectionView> page =new Query<KechengCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
