package com.dao;

import com.entity.YouerxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouerxinxiVO;
import com.entity.view.YouerxinxiView;


/**
 * 幼儿信息
 * 
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface YouerxinxiDao extends BaseMapper<YouerxinxiEntity> {
	
	List<YouerxinxiVO> selectListVO(@Param("ew") Wrapper<YouerxinxiEntity> wrapper);
	
	YouerxinxiVO selectVO(@Param("ew") Wrapper<YouerxinxiEntity> wrapper);
	
	List<YouerxinxiView> selectListView(@Param("ew") Wrapper<YouerxinxiEntity> wrapper);

	List<YouerxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YouerxinxiEntity> wrapper);
	
	YouerxinxiView selectView(@Param("ew") Wrapper<YouerxinxiEntity> wrapper);
	
}
