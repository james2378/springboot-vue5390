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


import com.dao.XuanjianghuiDao;
import com.entity.XuanjianghuiEntity;
import com.service.XuanjianghuiService;
import com.entity.vo.XuanjianghuiVO;
import com.entity.view.XuanjianghuiView;

@Service("xuanjianghuiService")
public class XuanjianghuiServiceImpl extends ServiceImpl<XuanjianghuiDao, XuanjianghuiEntity> implements XuanjianghuiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuanjianghuiEntity> page = this.selectPage(
                new Query<XuanjianghuiEntity>(params).getPage(),
                new EntityWrapper<XuanjianghuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuanjianghuiEntity> wrapper) {
		  Page<XuanjianghuiView> page =new Query<XuanjianghuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuanjianghuiVO> selectListVO(Wrapper<XuanjianghuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuanjianghuiVO selectVO(Wrapper<XuanjianghuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuanjianghuiView> selectListView(Wrapper<XuanjianghuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuanjianghuiView selectView(Wrapper<XuanjianghuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
