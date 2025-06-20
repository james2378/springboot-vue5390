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


import com.dao.KaoyanxinxiDao;
import com.entity.KaoyanxinxiEntity;
import com.service.KaoyanxinxiService;
import com.entity.vo.KaoyanxinxiVO;
import com.entity.view.KaoyanxinxiView;

@Service("kaoyanxinxiService")
public class KaoyanxinxiServiceImpl extends ServiceImpl<KaoyanxinxiDao, KaoyanxinxiEntity> implements KaoyanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoyanxinxiEntity> page = this.selectPage(
                new Query<KaoyanxinxiEntity>(params).getPage(),
                new EntityWrapper<KaoyanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoyanxinxiEntity> wrapper) {
		  Page<KaoyanxinxiView> page =new Query<KaoyanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoyanxinxiVO> selectListVO(Wrapper<KaoyanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoyanxinxiVO selectVO(Wrapper<KaoyanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoyanxinxiView> selectListView(Wrapper<KaoyanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoyanxinxiView selectView(Wrapper<KaoyanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<KaoyanxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<KaoyanxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<KaoyanxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
