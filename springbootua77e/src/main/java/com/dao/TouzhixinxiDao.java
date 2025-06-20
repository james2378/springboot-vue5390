package com.dao;

import com.entity.TouzhixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TouzhixinxiVO;
import com.entity.view.TouzhixinxiView;


/**
 * 投掷信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
public interface TouzhixinxiDao extends BaseMapper<TouzhixinxiEntity> {
	
	List<TouzhixinxiVO> selectListVO(@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);
	
	TouzhixinxiVO selectVO(@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);
	
	List<TouzhixinxiView> selectListView(@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);

	List<TouzhixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);
	
	TouzhixinxiView selectView(@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<TouzhixinxiEntity> wrapper);
}
