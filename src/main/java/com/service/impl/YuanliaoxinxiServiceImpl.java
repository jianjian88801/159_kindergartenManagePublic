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


import com.dao.YuanliaoxinxiDao;
import com.entity.YuanliaoxinxiEntity;
import com.service.YuanliaoxinxiService;
import com.entity.vo.YuanliaoxinxiVO;
import com.entity.view.YuanliaoxinxiView;

@Service("yuanliaoxinxiService")
public class YuanliaoxinxiServiceImpl extends ServiceImpl<YuanliaoxinxiDao, YuanliaoxinxiEntity> implements YuanliaoxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanliaoxinxiEntity> page = this.selectPage(
                new Query<YuanliaoxinxiEntity>(params).getPage(),
                new EntityWrapper<YuanliaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanliaoxinxiEntity> wrapper) {
		  Page<YuanliaoxinxiView> page =new Query<YuanliaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanliaoxinxiVO> selectListVO(Wrapper<YuanliaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanliaoxinxiVO selectVO(Wrapper<YuanliaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanliaoxinxiView> selectListView(Wrapper<YuanliaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanliaoxinxiView selectView(Wrapper<YuanliaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
