package com.dao;

import com.entity.ErtongtijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErtongtijianVO;
import com.entity.view.ErtongtijianView;


/**
 * 儿童体检
 * 
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface ErtongtijianDao extends BaseMapper<ErtongtijianEntity> {
	
	List<ErtongtijianVO> selectListVO(@Param("ew") Wrapper<ErtongtijianEntity> wrapper);
	
	ErtongtijianVO selectVO(@Param("ew") Wrapper<ErtongtijianEntity> wrapper);
	
	List<ErtongtijianView> selectListView(@Param("ew") Wrapper<ErtongtijianEntity> wrapper);

	List<ErtongtijianView> selectListView(Pagination page,@Param("ew") Wrapper<ErtongtijianEntity> wrapper);
	
	ErtongtijianView selectView(@Param("ew") Wrapper<ErtongtijianEntity> wrapper);
	
}
