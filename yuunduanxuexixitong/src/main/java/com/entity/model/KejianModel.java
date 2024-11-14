package com.entity.model;

import com.entity.KejianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学习课件
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-03
 */
public class KejianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 视频标题
     */
    private String kejianName;


    /**
     * 课件类型
     */
    private Integer kejianTypes;


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


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：视频标题
	 */
    public String getKejianName() {
        return kejianName;
    }


    /**
	 * 设置：视频标题
	 */
    public void setKejianName(String kejianName) {
        this.kejianName = kejianName;
    }
    /**
	 * 获取：课件类型
	 */
    public Integer getKejianTypes() {
        return kejianTypes;
    }


    /**
	 * 设置：课件类型
	 */
    public void setKejianTypes(Integer kejianTypes) {
        this.kejianTypes = kejianTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getKejianPhoto() {
        return kejianPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setKejianPhoto(String kejianPhoto) {
        this.kejianPhoto = kejianPhoto;
    }
    /**
	 * 获取：课件
	 */
    public String getKejianFile() {
        return kejianFile;
    }


    /**
	 * 设置：课件
	 */
    public void setKejianFile(String kejianFile) {
        this.kejianFile = kejianFile;
    }
    /**
	 * 获取：详情信息
	 */
    public String getKejianContent() {
        return kejianContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setKejianContent(String kejianContent) {
        this.kejianContent = kejianContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
