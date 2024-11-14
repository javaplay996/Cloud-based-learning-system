package com.entity.view;

import com.entity.KejianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 学习课件
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-03
 */
@TableName("kejian")
public class KejianView extends KejianEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 课件类型的值
		*/
		private String kejianValue;



	public KejianView() {

	}

	public KejianView(KejianEntity kejianEntity) {
		try {
			BeanUtils.copyProperties(this, kejianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 课件类型的值
			*/
			public String getKejianValue() {
				return kejianValue;
			}
			/**
			* 设置： 课件类型的值
			*/
			public void setKejianValue(String kejianValue) {
				this.kejianValue = kejianValue;
			}















}
