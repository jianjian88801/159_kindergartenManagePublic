package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YouerqingjiaEntity;
import com.entity.view.YouerqingjiaView;

import com.service.YouerqingjiaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 幼儿请假
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
@RestController
@RequestMapping("/youerqingjia")
public class YouerqingjiaController {
    @Autowired
    private YouerqingjiaService youerqingjiaService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YouerqingjiaEntity youerqingjia,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			youerqingjia.setGonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			youerqingjia.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YouerqingjiaEntity> ew = new EntityWrapper<YouerqingjiaEntity>();
		PageUtils page = youerqingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youerqingjia), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YouerqingjiaEntity youerqingjia, HttpServletRequest request){
        EntityWrapper<YouerqingjiaEntity> ew = new EntityWrapper<YouerqingjiaEntity>();
		PageUtils page = youerqingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, youerqingjia), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YouerqingjiaEntity youerqingjia){
       	EntityWrapper<YouerqingjiaEntity> ew = new EntityWrapper<YouerqingjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( youerqingjia, "youerqingjia")); 
        return R.ok().put("data", youerqingjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YouerqingjiaEntity youerqingjia){
        EntityWrapper< YouerqingjiaEntity> ew = new EntityWrapper< YouerqingjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( youerqingjia, "youerqingjia")); 
		YouerqingjiaView youerqingjiaView =  youerqingjiaService.selectView(ew);
		return R.ok("查询幼儿请假成功").put("data", youerqingjiaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YouerqingjiaEntity youerqingjia = youerqingjiaService.selectById(id);
        return R.ok().put("data", youerqingjia);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YouerqingjiaEntity youerqingjia = youerqingjiaService.selectById(id);
        return R.ok().put("data", youerqingjia);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YouerqingjiaEntity youerqingjia, HttpServletRequest request){
    	youerqingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youerqingjia);
        youerqingjiaService.insert(youerqingjia);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YouerqingjiaEntity youerqingjia, HttpServletRequest request){
    	youerqingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(youerqingjia);
        youerqingjiaService.insert(youerqingjia);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YouerqingjiaEntity youerqingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(youerqingjia);
        youerqingjiaService.updateById(youerqingjia);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        youerqingjiaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YouerqingjiaEntity> wrapper = new EntityWrapper<YouerqingjiaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = youerqingjiaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
