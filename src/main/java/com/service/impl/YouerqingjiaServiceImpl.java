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


import com.dao.YouerqingjiaDao;
import com.entity.YouerqingjiaEntity;
import com.service.YouerqingjiaService;
import com.entity.vo.YouerqingjiaVO;
import com.entity.view.YouerqingjiaView;

@Service("youerqingjiaService")
public class YouerqingjiaServiceImpl extends ServiceImpl<YouerqingjiaDao, YouerqingjiaEntity> implements YouerqingjiaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouerqingjiaEntity> page = this.selectPage(
                new Query<YouerqingjiaEntity>(params).getPage(),
                new EntityWrapper<YouerqingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouerqingjiaEntity> wrapper) {
		  Page<YouerqingjiaView> page =new Query<YouerqingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouerqingjiaVO> selectListVO(Wrapper<YouerqingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouerqingjiaVO selectVO(Wrapper<YouerqingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouerqingjiaView> selectListView(Wrapper<YouerqingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouerqingjiaView selectView(Wrapper<YouerqingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
