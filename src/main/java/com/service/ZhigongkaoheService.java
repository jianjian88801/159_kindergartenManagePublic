package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhigongkaoheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhigongkaoheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhigongkaoheView;


/**
 * 职工考核
 *
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public interface ZhigongkaoheService extends IService<ZhigongkaoheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhigongkaoheVO> selectListVO(Wrapper<ZhigongkaoheEntity> wrapper);
   	
   	ZhigongkaoheVO selectVO(@Param("ew") Wrapper<ZhigongkaoheEntity> wrapper);
   	
   	List<ZhigongkaoheView> selectListView(Wrapper<ZhigongkaoheEntity> wrapper);
   	
   	ZhigongkaoheView selectView(@Param("ew") Wrapper<ZhigongkaoheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhigongkaoheEntity> wrapper);
   	
}

