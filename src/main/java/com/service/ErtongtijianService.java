package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErtongtijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErtongtijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErtongtijianView;


/**
 * 儿童体检
 *
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface ErtongtijianService extends IService<ErtongtijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErtongtijianVO> selectListVO(Wrapper<ErtongtijianEntity> wrapper);
   	
   	ErtongtijianVO selectVO(@Param("ew") Wrapper<ErtongtijianEntity> wrapper);
   	
   	List<ErtongtijianView> selectListView(Wrapper<ErtongtijianEntity> wrapper);
   	
   	ErtongtijianView selectView(@Param("ew") Wrapper<ErtongtijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErtongtijianEntity> wrapper);
   	
}

