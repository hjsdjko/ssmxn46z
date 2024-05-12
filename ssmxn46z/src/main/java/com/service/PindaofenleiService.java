package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PindaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PindaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PindaofenleiView;


/**
 * 频道分类
 *
 * @author 
 * @email 
 * @date 2022-04-01 21:27:24
 */
public interface PindaofenleiService extends IService<PindaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PindaofenleiVO> selectListVO(Wrapper<PindaofenleiEntity> wrapper);
   	
   	PindaofenleiVO selectVO(@Param("ew") Wrapper<PindaofenleiEntity> wrapper);
   	
   	List<PindaofenleiView> selectListView(Wrapper<PindaofenleiEntity> wrapper);
   	
   	PindaofenleiView selectView(@Param("ew") Wrapper<PindaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PindaofenleiEntity> wrapper);
   	

}

