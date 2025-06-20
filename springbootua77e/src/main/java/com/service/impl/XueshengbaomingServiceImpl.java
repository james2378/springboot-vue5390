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


import com.dao.XueshengbaomingDao;
import com.entity.XueshengbaomingEntity;
import com.service.XueshengbaomingService;
import com.entity.vo.XueshengbaomingVO;
import com.entity.view.XueshengbaomingView;

@Service("xueshengbaomingService")
public class XueshengbaomingServiceImpl extends ServiceImpl<XueshengbaomingDao, XueshengbaomingEntity> implements XueshengbaomingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengbaomingEntity> page = this.selectPage(
                new Query<XueshengbaomingEntity>(params).getPage(),
                new EntityWrapper<XueshengbaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengbaomingEntity> wrapper) {
		  Page<XueshengbaomingView> page =new Query<XueshengbaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengbaomingVO> selectListVO(Wrapper<XueshengbaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengbaomingVO selectVO(Wrapper<XueshengbaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengbaomingView> selectListView(Wrapper<XueshengbaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengbaomingView selectView(Wrapper<XueshengbaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XueshengbaomingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XueshengbaomingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XueshengbaomingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
