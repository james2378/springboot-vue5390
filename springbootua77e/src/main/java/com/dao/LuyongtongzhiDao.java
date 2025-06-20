package com.dao;

import com.entity.LuyongtongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuyongtongzhiVO;
import com.entity.view.LuyongtongzhiView;


/**
 * 录用通知
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
public interface LuyongtongzhiDao extends BaseMapper<LuyongtongzhiEntity> {
	
	List<LuyongtongzhiVO> selectListVO(@Param("ew") Wrapper<LuyongtongzhiEntity> wrapper);
	
	LuyongtongzhiVO selectVO(@Param("ew") Wrapper<LuyongtongzhiEntity> wrapper);
	
	List<LuyongtongzhiView> selectListView(@Param("ew") Wrapper<LuyongtongzhiEntity> wrapper);

	List<LuyongtongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<LuyongtongzhiEntity> wrapper);
	
	LuyongtongzhiView selectView(@Param("ew") Wrapper<LuyongtongzhiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LuyongtongzhiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LuyongtongzhiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<LuyongtongzhiEntity> wrapper);
}
