package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengbaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengbaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengbaomingView;


/**
 * 学生报名
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
public interface XueshengbaomingService extends IService<XueshengbaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengbaomingVO> selectListVO(Wrapper<XueshengbaomingEntity> wrapper);
   	
   	XueshengbaomingVO selectVO(@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);
   	
   	List<XueshengbaomingView> selectListView(Wrapper<XueshengbaomingEntity> wrapper);
   	
   	XueshengbaomingView selectView(@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengbaomingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XueshengbaomingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XueshengbaomingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XueshengbaomingEntity> wrapper);
}

