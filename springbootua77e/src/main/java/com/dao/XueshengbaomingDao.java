package com.dao;

import com.entity.XueshengbaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengbaomingVO;
import com.entity.view.XueshengbaomingView;


/**
 * 学生报名
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
public interface XueshengbaomingDao extends BaseMapper<XueshengbaomingEntity> {
	
	List<XueshengbaomingVO> selectListVO(@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);
	
	XueshengbaomingVO selectVO(@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);
	
	List<XueshengbaomingView> selectListView(@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);

	List<XueshengbaomingView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);
	
	XueshengbaomingView selectView(@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XueshengbaomingEntity> wrapper);
}
