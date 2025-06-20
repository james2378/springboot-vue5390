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


import com.dao.QiyebaomingDao;
import com.entity.QiyebaomingEntity;
import com.service.QiyebaomingService;
import com.entity.vo.QiyebaomingVO;
import com.entity.view.QiyebaomingView;

@Service("qiyebaomingService")
public class QiyebaomingServiceImpl extends ServiceImpl<QiyebaomingDao, QiyebaomingEntity> implements QiyebaomingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyebaomingEntity> page = this.selectPage(
                new Query<QiyebaomingEntity>(params).getPage(),
                new EntityWrapper<QiyebaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyebaomingEntity> wrapper) {
		  Page<QiyebaomingView> page =new Query<QiyebaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyebaomingVO> selectListVO(Wrapper<QiyebaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyebaomingVO selectVO(Wrapper<QiyebaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyebaomingView> selectListView(Wrapper<QiyebaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyebaomingView selectView(Wrapper<QiyebaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<QiyebaomingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<QiyebaomingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<QiyebaomingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
