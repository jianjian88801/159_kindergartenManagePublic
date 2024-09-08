package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaibanshixiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaibanshixiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaibanshixiangView;


/**
 * 待办事项
 *
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface DaibanshixiangService extends IService<DaibanshixiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaibanshixiangVO> selectListVO(Wrapper<DaibanshixiangEntity> wrapper);
   	
   	DaibanshixiangVO selectVO(@Param("ew") Wrapper<DaibanshixiangEntity> wrapper);
   	
   	List<DaibanshixiangView> selectListView(Wrapper<DaibanshixiangEntity> wrapper);
   	
   	DaibanshixiangView selectView(@Param("ew") Wrapper<DaibanshixiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaibanshixiangEntity> wrapper);
   	
}

