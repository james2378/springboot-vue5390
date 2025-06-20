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


import com.dao.TouzhixinxiDao;
import com.entity.TouzhixinxiEntity;
import com.service.TouzhixinxiService;
import com.entity.vo.TouzhixinxiVO;
import com.entity.view.TouzhixinxiView;

@Service("touzhixinxiService")
public class TouzhixinxiServiceImpl extends ServiceImpl<TouzhixinxiDao, TouzhixinxiEntity> implements TouzhixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TouzhixinxiEntity> page = this.selectPage(
                new Query<TouzhixinxiEntity>(params).getPage(),
                new EntityWrapper<TouzhixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TouzhixinxiEntity> wrapper) {
		  Page<TouzhixinxiView> page =new Query<TouzhixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TouzhixinxiVO> selectListVO(Wrapper<TouzhixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TouzhixinxiVO selectVO(Wrapper<TouzhixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TouzhixinxiView> selectListView(Wrapper<TouzhixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TouzhixinxiView selectView(Wrapper<TouzhixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<TouzhixinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<TouzhixinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<TouzhixinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
