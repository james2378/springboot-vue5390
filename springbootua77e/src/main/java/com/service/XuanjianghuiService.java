package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuanjianghuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuanjianghuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuanjianghuiView;


/**
 * 宣讲会
 *
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
public interface XuanjianghuiService extends IService<XuanjianghuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuanjianghuiVO> selectListVO(Wrapper<XuanjianghuiEntity> wrapper);
   	
   	XuanjianghuiVO selectVO(@Param("ew") Wrapper<XuanjianghuiEntity> wrapper);
   	
   	List<XuanjianghuiView> selectListView(Wrapper<XuanjianghuiEntity> wrapper);
   	
   	XuanjianghuiView selectView(@Param("ew") Wrapper<XuanjianghuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuanjianghuiEntity> wrapper);
   	

}

