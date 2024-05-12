package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PindaofenleiDao;
import com.entity.PindaofenleiEntity;
import com.service.PindaofenleiService;
import com.entity.vo.PindaofenleiVO;
import com.entity.view.PindaofenleiView;

@Service("pindaofenleiService")
public class PindaofenleiServiceImpl extends ServiceImpl<PindaofenleiDao, PindaofenleiEntity> implements PindaofenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PindaofenleiEntity> page = this.selectPage(
                new Query<PindaofenleiEntity>(params).getPage(),
                new EntityWrapper<PindaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PindaofenleiEntity> wrapper) {
		  Page<PindaofenleiView> page =new Query<PindaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PindaofenleiVO> selectListVO(Wrapper<PindaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PindaofenleiVO selectVO(Wrapper<PindaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PindaofenleiView> selectListView(Wrapper<PindaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PindaofenleiView selectView(Wrapper<PindaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
