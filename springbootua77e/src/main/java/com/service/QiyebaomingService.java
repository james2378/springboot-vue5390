package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyebaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyebaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyebaomingView;


/**
 * 企业报名
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
public interface QiyebaomingService extends IService<QiyebaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyebaomingVO> selectListVO(Wrapper<QiyebaomingEntity> wrapper);
   	
   	QiyebaomingVO selectVO(@Param("ew") Wrapper<QiyebaomingEntity> wrapper);
   	
   	List<QiyebaomingView> selectListView(Wrapper<QiyebaomingEntity> wrapper);
   	
   	QiyebaomingView selectView(@Param("ew") Wrapper<QiyebaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyebaomingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<QiyebaomingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<QiyebaomingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<QiyebaomingEntity> wrapper);
}

