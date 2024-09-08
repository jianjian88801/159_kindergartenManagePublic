package com.dao;

import com.entity.YuanliaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanliaoxinxiVO;
import com.entity.view.YuanliaoxinxiView;


/**
 * 原料信息
 * 
 * @author 
 * @email 
 * @date 2021-03-18 15:04:01
 */
public interface YuanliaoxinxiDao extends BaseMapper<YuanliaoxinxiEntity> {
	
	List<YuanliaoxinxiVO> selectListVO(@Param("ew") Wrapper<YuanliaoxinxiEntity> wrapper);
	
	YuanliaoxinxiVO selectVO(@Param("ew") Wrapper<YuanliaoxinxiEntity> wrapper);
	
	List<YuanliaoxinxiView> selectListView(@Param("ew") Wrapper<YuanliaoxinxiEntity> wrapper);

	List<YuanliaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanliaoxinxiEntity> wrapper);
	
	YuanliaoxinxiView selectView(@Param("ew") Wrapper<YuanliaoxinxiEntity> wrapper);
	
}
