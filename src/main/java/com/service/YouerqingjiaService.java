package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouerqingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouerqingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouerqingjiaView;


/**
 * 幼儿请假
 *
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface YouerqingjiaService extends IService<YouerqingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouerqingjiaVO> selectListVO(Wrapper<YouerqingjiaEntity> wrapper);
   	
   	YouerqingjiaVO selectVO(@Param("ew") Wrapper<YouerqingjiaEntity> wrapper);
   	
   	List<YouerqingjiaView> selectListView(Wrapper<YouerqingjiaEntity> wrapper);
   	
   	YouerqingjiaView selectView(@Param("ew") Wrapper<YouerqingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouerqingjiaEntity> wrapper);
   	
}

