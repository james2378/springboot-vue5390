package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LuyongtongzhiDao;
import com.entity.LuyongtongzhiEntity;
import com.service.LuyongtongzhiService;
import com.entity.vo.LuyongtongzhiVO;
import com.entity.view.LuyongtongzhiView;

@Service("luyongtongzhiService")
public class LuyongtongzhiServiceImpl extends ServiceImpl<LuyongtongzhiDao, LuyongtongzhiEntity> implements LuyongtongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuyongtongzhiEntity> page = this.selectPage(
                new Query<LuyongtongzhiEntity>(params).getPage(),
                new EntityWrapper<LuyongtongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuyongtongzhiEntity> wrapper) {
		  Page<LuyongtongzhiView> page =new Query<LuyongtongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuyongtongzhiVO> selectListVO(Wrapper<LuyongtongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuyongtongzhiVO selectVO(Wrapper<LuyongtongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuyongtongzhiView> selectListView(Wrapper<LuyongtongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuyongtongzhiView selectView(Wrapper<LuyongtongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<LuyongtongzhiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<LuyongtongzhiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<LuyongtongzhiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
