package com.entity.view;

import com.entity.TouzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投掷信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
@TableName("touzhixinxi")
public class TouzhixinxiView  extends TouzhixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TouzhixinxiView(){
	}
 
 	public TouzhixinxiView(TouzhixinxiEntity touzhixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, touzhixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
