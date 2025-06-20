package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TouzhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TouzhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TouzhixinxiView;


/**
 * 投掷信息
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
public interface TouzhixinxiService extends IService<TouzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TouzhixinxiVO> selectListVO(Wrapper<TouzhixinxiEntity> wrapper);
   	
   	TouzhixinxiVO selectVO(@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);
   	
   	List<TouzhixinxiView> selectListView(Wrapper<TouzhixinxiEntity> wrapper);
   	
   	TouzhixinxiView selectView(@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TouzhixinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<TouzhixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<TouzhixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<TouzhixinxiEntity> wrapper);
}

