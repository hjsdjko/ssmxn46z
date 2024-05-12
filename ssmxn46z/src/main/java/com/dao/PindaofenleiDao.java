package com.dao;

import com.entity.PindaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PindaofenleiVO;
import com.entity.view.PindaofenleiView;


/**
 * 频道分类
 * 
 * @author 
 * @email 
 * @date 2022-04-01 21:27:24
 */
public interface PindaofenleiDao extends BaseMapper<PindaofenleiEntity> {
	
	List<PindaofenleiVO> selectListVO(@Param("ew") Wrapper<PindaofenleiEntity> wrapper);
	
	PindaofenleiVO selectVO(@Param("ew") Wrapper<PindaofenleiEntity> wrapper);
	
	List<PindaofenleiView> selectListView(@Param("ew") Wrapper<PindaofenleiEntity> wrapper);

	List<PindaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<PindaofenleiEntity> wrapper);
	
	PindaofenleiView selectView(@Param("ew") Wrapper<PindaofenleiEntity> wrapper);
	

}
