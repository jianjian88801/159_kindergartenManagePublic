package com.dao;

import com.entity.HuiyijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyijiluVO;
import com.entity.view.HuiyijiluView;


/**
 * 会议记录
 * 
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface HuiyijiluDao extends BaseMapper<HuiyijiluEntity> {
	
	List<HuiyijiluVO> selectListVO(@Param("ew") Wrapper<HuiyijiluEntity> wrapper);
	
	HuiyijiluVO selectVO(@Param("ew") Wrapper<HuiyijiluEntity> wrapper);
	
	List<HuiyijiluView> selectListView(@Param("ew") Wrapper<HuiyijiluEntity> wrapper);

	List<HuiyijiluView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyijiluEntity> wrapper);
	
	HuiyijiluView selectView(@Param("ew") Wrapper<HuiyijiluEntity> wrapper);
	
}
