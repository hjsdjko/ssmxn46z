package com.entity.view;

import com.entity.PindaofenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 频道分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-01 21:27:24
 */
@TableName("pindaofenlei")
public class PindaofenleiView  extends PindaofenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PindaofenleiView(){
	}
 
 	public PindaofenleiView(PindaofenleiEntity pindaofenleiEntity){
 	try {
			BeanUtils.copyProperties(this, pindaofenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
