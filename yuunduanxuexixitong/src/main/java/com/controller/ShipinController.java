package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ShipinEntity;

import com.service.ShipinService;
import com.entity.view.ShipinView;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 学习视频
 * 后端接口
 * @author
 * @email
 * @date 2021-05-03
*/
@RestController
@Controller
@RequestMapping("/shipin")
public class ShipinController {
    private static final Logger logger = LoggerFactory.getLogger(ShipinController.class);

    @Autowired
    private ShipinService shipinService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = shipinService.queryPage(params);

        //字典表数据转换
        List<ShipinView> list =(List<ShipinView>)page.getList();
        for(ShipinView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShipinEntity shipin = shipinService.selectById(id);
        if(shipin !=null){
            //entity转view
            ShipinView view = new ShipinView();
            BeanUtils.copyProperties( shipin , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShipinEntity shipin, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shipin:{}",this.getClass().getName(),shipin.toString());
        Wrapper<ShipinEntity> queryWrapper = new EntityWrapper<ShipinEntity>()
            .eq("shipin_name", shipin.getShipinName())
            .eq("shipin_types", shipin.getShipinTypes())
            .eq("shipin_video", shipin.getShipinVideo())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShipinEntity shipinEntity = shipinService.selectOne(queryWrapper);
        if(shipinEntity==null){
            shipin.setInsertTime(new Date());
            shipin.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      shipin.set
        //  }
            shipinService.insert(shipin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShipinEntity shipin, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,shipin:{}",this.getClass().getName(),shipin.toString());
        //根据字段查询是否有相同数据
        Wrapper<ShipinEntity> queryWrapper = new EntityWrapper<ShipinEntity>()
            .notIn("id",shipin.getId())
            .andNew()
            .eq("shipin_name", shipin.getShipinName())
            .eq("shipin_types", shipin.getShipinTypes())
            .eq("shipin_video", shipin.getShipinVideo())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShipinEntity shipinEntity = shipinService.selectOne(queryWrapper);
        if("".equals(shipin.getShipinPhoto()) || "null".equals(shipin.getShipinPhoto())){
                shipin.setShipinPhoto(null);
        }
        if("".equals(shipin.getShipinVideo()) || "null".equals(shipin.getShipinVideo())){
            shipin.setShipinVideo(null);
        }
        if(shipinEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      shipin.set
            //  }
            shipinService.updateById(shipin);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        shipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = shipinService.queryPage(params);

        //字典表数据转换
        List<ShipinView> list =(List<ShipinView>)page.getList();
        for(ShipinView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShipinEntity shipin = shipinService.selectById(id);
            if(shipin !=null){
                //entity转view
        ShipinView view = new ShipinView();
                BeanUtils.copyProperties( shipin , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ShipinEntity shipin, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shipin:{}",this.getClass().getName(),shipin.toString());
        Wrapper<ShipinEntity> queryWrapper = new EntityWrapper<ShipinEntity>()
            .eq("shipin_name", shipin.getShipinName())
            .eq("shipin_types", shipin.getShipinTypes())
            .eq("shipin_video", shipin.getShipinVideo())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    ShipinEntity shipinEntity = shipinService.selectOne(queryWrapper);
        if(shipinEntity==null){
            shipin.setInsertTime(new Date());
            shipin.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      shipin.set
        //  }
        shipinService.insert(shipin);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }





}

