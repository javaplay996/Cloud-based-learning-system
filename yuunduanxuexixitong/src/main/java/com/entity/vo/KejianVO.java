package com.entity.vo;

import com.entity.KejianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学习课件
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-05-03
 */
@TableName("kejian")
public class KejianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 视频标题
     */

    @TableField(value = "kejian_name")
    private String kejianName;


    /**
     * 课件类型
     */

    @TableField(value = "kejian_types")
    private Integer kejianTypes;


    /**
     * 封面
     */

    @TableField(value = "kejian_photo")
    private String kejianPhoto;


    /**
     * 课件
     */

    @TableField(value = "kejian_file")
    private String kejianFile;


    /**
     * 详情信息
     */

    @TableField(value = "kejian_content")
    private String kejianContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：视频标题
	 */
    public String getKejianName() {
        return kejianName;
    }


    /**
	 * 获取：视频标题
	 */

    public void setKejianName(String kejianName) {
        this.kejianName = kejianName;
    }
    /**
	 * 设置：课件类型
	 */
    public Integer getKejianTypes() {
        return kejianTypes;
    }


    /**
	 * 获取：课件类型
	 */

    public void setKejianTypes(Integer kejianTypes) {
        this.kejianTypes = kejianTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getKejianPhoto() {
        return kejianPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setKejianPhoto(String kejianPhoto) {
        this.kejianPhoto = kejianPhoto;
    }
    /**
	 * 设置：课件
	 */
    public String getKejianFile() {
        return kejianFile;
    }


    /**
	 * 获取：课件
	 */

    public void setKejianFile(String kejianFile) {
        this.kejianFile = kejianFile;
    }
    /**
	 * 设置：详情信息
	 */
    public String getKejianContent() {
        return kejianContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setKejianContent(String kejianContent) {
        this.kejianContent = kejianContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
