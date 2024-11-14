package com.entity.view;

import com.entity.KejianCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 学习课件收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-03
 */
@TableName("kejian_collection")
public class KejianCollectionView extends KejianCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 kejian
			/**
			* 视频标题
			*/
			private String kejianName;
			/**
			* 课件类型
			*/
			private Integer kejianTypes;
				/**
				* 课件类型的值
				*/
				private String kejianValue;
			/**
			* 封面
			*/
			private String kejianPhoto;
			/**
			* 课件
			*/
			private String kejianFile;
			/**
			* 详情信息
			*/
			private String kejianContent;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 录入时间
			*/
			private Date insertTime;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public KejianCollectionView() {

	}

	public KejianCollectionView(KejianCollectionEntity kejianCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, kejianCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set kejian
					/**
					* 获取： 视频标题
					*/
					public String getKejianName() {
						return kejianName;
					}
					/**
					* 设置： 视频标题
					*/
					public void setKejianName(String kejianName) {
						this.kejianName = kejianName;
					}
					/**
					* 获取： 课件类型
					*/
					public Integer getKejianTypes() {
						return kejianTypes;
					}
					/**
					* 设置： 课件类型
					*/
					public void setKejianTypes(Integer kejianTypes) {
						this.kejianTypes = kejianTypes;
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
					/**
					* 获取： 封面
					*/
					public String getKejianPhoto() {
						return kejianPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setKejianPhoto(String kejianPhoto) {
						this.kejianPhoto = kejianPhoto;
					}
					/**
					* 获取： 课件
					*/
					public String getKejianFile() {
						return kejianFile;
					}
					/**
					* 设置： 课件
					*/
					public void setKejianFile(String kejianFile) {
						this.kejianFile = kejianFile;
					}
					/**
					* 获取： 详情信息
					*/
					public String getKejianContent() {
						return kejianContent;
					}
					/**
					* 设置： 详情信息
					*/
					public void setKejianContent(String kejianContent) {
						this.kejianContent = kejianContent;
					}
					/**
					* 获取： 录入时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 录入时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}






















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
