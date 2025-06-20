package com.entity.view;

import com.entity.KaoyanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考研信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
@TableName("kaoyanxinxi")
public class KaoyanxinxiView  extends KaoyanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoyanxinxiView(){
	}
 
 	public KaoyanxinxiView(KaoyanxinxiEntity kaoyanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, kaoyanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
