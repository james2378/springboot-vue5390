package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宣讲会
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
@TableName("xuanjianghui")
public class XuanjianghuiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuanjianghuiEntity() {
		
	}
	
	public XuanjianghuiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 参加人数
	 */
					
	private Integer canjiarenshu;
	
	/**
	 * 讲会详情
	 */
					
	private String jianghuixiangqing;
	
	/**
	 * 举办时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jubanshijian;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：参加人数
	 */
	public void setCanjiarenshu(Integer canjiarenshu) {
		this.canjiarenshu = canjiarenshu;
	}
	/**
	 * 获取：参加人数
	 */
	public Integer getCanjiarenshu() {
		return canjiarenshu;
	}
	/**
	 * 设置：讲会详情
	 */
	public void setJianghuixiangqing(String jianghuixiangqing) {
		this.jianghuixiangqing = jianghuixiangqing;
	}
	/**
	 * 获取：讲会详情
	 */
	public String getJianghuixiangqing() {
		return jianghuixiangqing;
	}
	/**
	 * 设置：举办时间
	 */
	public void setJubanshijian(Date jubanshijian) {
		this.jubanshijian = jubanshijian;
	}
	/**
	 * 获取：举办时间
	 */
	public Date getJubanshijian() {
		return jubanshijian;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}

}
