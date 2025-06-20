package com.dao;

import com.entity.KaoyanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoyanxinxiVO;
import com.entity.view.KaoyanxinxiView;


/**
 * 考研信息
 * 
 * @author 
 * @email 
 * @date 2022-05-18 14:44:26
 */
public interface KaoyanxinxiDao extends BaseMapper<KaoyanxinxiEntity> {
	
	List<KaoyanxinxiVO> selectListVO(@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);
	
	KaoyanxinxiVO selectVO(@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);
	
	List<KaoyanxinxiView> selectListView(@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);

	List<KaoyanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);
	
	KaoyanxinxiView selectView(@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<KaoyanxinxiEntity> wrapper);
}
