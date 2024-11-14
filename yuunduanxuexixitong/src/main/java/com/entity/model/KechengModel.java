package com.entity.model;

import com.entity.KechengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-03
 */
public class KechengModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 课程名称
     */
    private String kechengName;


    /**
     * 课程类型
     */
    private Integer kechengTypes;


    /**
     * 课程图片
     */
    private String kechengPhoto;


    /**
     * 负责教师
     */
    private String kechengJiaoshi;


    /**
     * 课程时间
     */
    private String kechengShijian;


    /**
     * 课程信息介绍
     */
    private String kechengContent;


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
	 * 获取：课程名称
	 */
    public String getKechengName() {
        return kechengName;
    }


    /**
	 * 设置：课程名称
	 */
    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 获取：课程类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }


    /**
	 * 设置：课程类型
	 */
    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 获取：课程图片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }


    /**
	 * 设置：课程图片
	 */
    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 获取：负责教师
	 */
    public String getKechengJiaoshi() {
        return kechengJiaoshi;
    }


    /**
	 * 设置：负责教师
	 */
    public void setKechengJiaoshi(String kechengJiaoshi) {
        this.kechengJiaoshi = kechengJiaoshi;
    }
    /**
	 * 获取：课程时间
	 */
    public String getKechengShijian() {
        return kechengShijian;
    }


    /**
	 * 设置：课程时间
	 */
    public void setKechengShijian(String kechengShijian) {
        this.kechengShijian = kechengShijian;
    }
    /**
	 * 获取：课程信息介绍
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 设置：课程信息介绍
	 */
    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
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
