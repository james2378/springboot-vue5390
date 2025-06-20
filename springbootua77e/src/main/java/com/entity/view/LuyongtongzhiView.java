package com.entity.view;

import com.entity.LuyongtongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 录用通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
@TableName("luyongtongzhi")
public class LuyongtongzhiView  extends LuyongtongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LuyongtongzhiView(){
	}
 
 	public LuyongtongzhiView(LuyongtongzhiEntity luyongtongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, luyongtongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
