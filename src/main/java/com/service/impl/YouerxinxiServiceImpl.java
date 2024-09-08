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


import com.dao.YouerxinxiDao;
import com.entity.YouerxinxiEntity;
import com.service.YouerxinxiService;
import com.entity.vo.YouerxinxiVO;
import com.entity.view.YouerxinxiView;

@Service("youerxinxiService")
public class YouerxinxiServiceImpl extends ServiceImpl<YouerxinxiDao, YouerxinxiEntity> implements YouerxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouerxinxiEntity> page = this.selectPage(
                new Query<YouerxinxiEntity>(params).getPage(),
                new EntityWrapper<YouerxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouerxinxiEntity> wrapper) {
		  Page<YouerxinxiView> page =new Query<YouerxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouerxinxiVO> selectListVO(Wrapper<YouerxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouerxinxiVO selectVO(Wrapper<YouerxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouerxinxiView> selectListView(Wrapper<YouerxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouerxinxiView selectView(Wrapper<YouerxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
