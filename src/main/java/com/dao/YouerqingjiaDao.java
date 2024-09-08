package com.dao;

import com.entity.YouerqingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouerqingjiaVO;
import com.entity.view.YouerqingjiaView;


/**
 * 幼儿请假
 * 
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface YouerqingjiaDao extends BaseMapper<YouerqingjiaEntity> {
	
	List<YouerqingjiaVO> selectListVO(@Param("ew") Wrapper<YouerqingjiaEntity> wrapper);
	
	YouerqingjiaVO selectVO(@Param("ew") Wrapper<YouerqingjiaEntity> wrapper);
	
	List<YouerqingjiaView> selectListView(@Param("ew") Wrapper<YouerqingjiaEntity> wrapper);

	List<YouerqingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<YouerqingjiaEntity> wrapper);
	
	YouerqingjiaView selectView(@Param("ew") Wrapper<YouerqingjiaEntity> wrapper);
	
}
