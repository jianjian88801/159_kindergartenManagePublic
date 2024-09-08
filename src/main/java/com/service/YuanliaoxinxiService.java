package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanliaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanliaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanliaoxinxiView;


/**
 * 原料信息
 *
 * @author 
 * @email 
 * @date 2021-03-18 15:04:01
 */
public interface YuanliaoxinxiService extends IService<YuanliaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanliaoxinxiVO> selectListVO(Wrapper<YuanliaoxinxiEntity> wrapper);
   	
   	YuanliaoxinxiVO selectVO(@Param("ew") Wrapper<YuanliaoxinxiEntity> wrapper);
   	
   	List<YuanliaoxinxiView> selectListView(Wrapper<YuanliaoxinxiEntity> wrapper);
   	
   	YuanliaoxinxiView selectView(@Param("ew") Wrapper<YuanliaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanliaoxinxiEntity> wrapper);
   	
}

