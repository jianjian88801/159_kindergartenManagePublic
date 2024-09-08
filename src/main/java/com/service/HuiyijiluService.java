package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyijiluView;


/**
 * 会议记录
 *
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface HuiyijiluService extends IService<HuiyijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyijiluVO> selectListVO(Wrapper<HuiyijiluEntity> wrapper);
   	
   	HuiyijiluVO selectVO(@Param("ew") Wrapper<HuiyijiluEntity> wrapper);
   	
   	List<HuiyijiluView> selectListView(Wrapper<HuiyijiluEntity> wrapper);
   	
   	HuiyijiluView selectView(@Param("ew") Wrapper<HuiyijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyijiluEntity> wrapper);
   	
}

