package com.entity.view;

import com.entity.ShipinLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 学习视频留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-03
 */
@TableName("shipin_liuyan")
public class ShipinLiuyanView extends ShipinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 shipin
			/**
			* 视频标题
			*/
			private String shipinName;
			/**
			* 视频类型
			*/
			private Integer shipinTypes;
				/**
				* 视频类型的值
				*/
				private String shipinValue;
			/**
			* 封面
			*/
			private String shipinPhoto;
			/**
			* 视频
			*/
			private String shipinVideo;
			/**
			* 详情信息
			*/
			private String shipinContent;
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

	public ShipinLiuyanView() {

	}

	public ShipinLiuyanView(ShipinLiuyanEntity shipinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, shipinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set shipin
					/**
					* 获取： 视频标题
					*/
					public String getShipinName() {
						return shipinName;
					}
					/**
					* 设置： 视频标题
					*/
					public void setShipinName(String shipinName) {
						this.shipinName = shipinName;
					}
					/**
					* 获取： 视频类型
					*/
					public Integer getShipinTypes() {
						return shipinTypes;
					}
					/**
					* 设置： 视频类型
					*/
					public void setShipinTypes(Integer shipinTypes) {
						this.shipinTypes = shipinTypes;
					}


						/**
						* 获取： 视频类型的值
						*/
						public String getShipinValue() {
							return shipinValue;
						}
						/**
						* 设置： 视频类型的值
						*/
						public void setShipinValue(String shipinValue) {
							this.shipinValue = shipinValue;
						}
					/**
					* 获取： 封面
					*/
					public String getShipinPhoto() {
						return shipinPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setShipinPhoto(String shipinPhoto) {
						this.shipinPhoto = shipinPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getShipinVideo() {
						return shipinVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setShipinVideo(String shipinVideo) {
						this.shipinVideo = shipinVideo;
					}
					/**
					* 获取： 详情信息
					*/
					public String getShipinContent() {
						return shipinContent;
					}
					/**
					* 设置： 详情信息
					*/
					public void setShipinContent(String shipinContent) {
						this.shipinContent = shipinContent;
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
