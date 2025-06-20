package com.entity.view;

import com.entity.XueshengbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
@TableName("xueshengbaoming")
public class XueshengbaomingView  extends XueshengbaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengbaomingView(){
	}
 
 	public XueshengbaomingView(XueshengbaomingEntity xueshengbaomingEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengbaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
