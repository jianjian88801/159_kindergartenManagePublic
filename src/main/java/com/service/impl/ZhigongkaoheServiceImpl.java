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


import com.dao.ZhigongkaoheDao;
import com.entity.ZhigongkaoheEntity;
import com.service.ZhigongkaoheService;
import com.entity.vo.ZhigongkaoheVO;
import com.entity.view.ZhigongkaoheView;

@Service("zhigongkaoheService")
public class ZhigongkaoheServiceImpl extends ServiceImpl<ZhigongkaoheDao, ZhigongkaoheEntity> implements ZhigongkaoheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhigongkaoheEntity> page = this.selectPage(
                new Query<ZhigongkaoheEntity>(params).getPage(),
                new EntityWrapper<ZhigongkaoheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhigongkaoheEntity> wrapper) {
		  Page<ZhigongkaoheView> page =new Query<ZhigongkaoheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhigongkaoheVO> selectListVO(Wrapper<ZhigongkaoheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhigongkaoheVO selectVO(Wrapper<ZhigongkaoheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhigongkaoheView> selectListView(Wrapper<ZhigongkaoheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhigongkaoheView selectView(Wrapper<ZhigongkaoheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
