package com.dao;

import com.entity.ZhigongkaoheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhigongkaoheVO;
import com.entity.view.ZhigongkaoheView;


/**
 * 职工考核
 * 
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface ZhigongkaoheDao extends BaseMapper<ZhigongkaoheEntity> {
	
	List<ZhigongkaoheVO> selectListVO(@Param("ew") Wrapper<ZhigongkaoheEntity> wrapper);
	
	ZhigongkaoheVO selectVO(@Param("ew") Wrapper<ZhigongkaoheEntity> wrapper);
	
	List<ZhigongkaoheView> selectListView(@Param("ew") Wrapper<ZhigongkaoheEntity> wrapper);

	List<ZhigongkaoheView> selectListView(Pagination page,@Param("ew") Wrapper<ZhigongkaoheEntity> wrapper);
	
	ZhigongkaoheView selectView(@Param("ew") Wrapper<ZhigongkaoheEntity> wrapper);
	
}
