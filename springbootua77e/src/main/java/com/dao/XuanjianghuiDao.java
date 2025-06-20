package com.dao;

import com.entity.XuanjianghuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuanjianghuiVO;
import com.entity.view.XuanjianghuiView;


/**
 * 宣讲会
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
public interface XuanjianghuiDao extends BaseMapper<XuanjianghuiEntity> {
	
	List<XuanjianghuiVO> selectListVO(@Param("ew") Wrapper<XuanjianghuiEntity> wrapper);
	
	XuanjianghuiVO selectVO(@Param("ew") Wrapper<XuanjianghuiEntity> wrapper);
	
	List<XuanjianghuiView> selectListView(@Param("ew") Wrapper<XuanjianghuiEntity> wrapper);

	List<XuanjianghuiView> selectListView(Pagination page,@Param("ew") Wrapper<XuanjianghuiEntity> wrapper);
	
	XuanjianghuiView selectView(@Param("ew") Wrapper<XuanjianghuiEntity> wrapper);
	

}
