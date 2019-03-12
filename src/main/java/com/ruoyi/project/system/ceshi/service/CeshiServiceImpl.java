package com.ruoyi.project.system.ceshi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.system.ceshi.mapper.CeshiMapper;
import com.ruoyi.project.system.ceshi.domain.Ceshi;
import com.ruoyi.project.system.ceshi.service.ICeshiService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 测试格 服务层实现
 * 
 * @author ruoyi
 * @date 2019-03-12
 */
@Service
public class CeshiServiceImpl implements ICeshiService 
{
	@Autowired
	private CeshiMapper ceshiMapper;

	/**
     * 查询测试格信息
     * 
     * @param id 测试格ID
     * @return 测试格信息
     */
    @Override
	public Ceshi selectCeshiById(Integer id)
	{
	    return ceshiMapper.selectCeshiById(id);
	}
	
	/**
     * 查询测试格列表
     * 
     * @param ceshi 测试格信息
     * @return 测试格集合
     */
	@Override
	public List<Ceshi> selectCeshiList(Ceshi ceshi)
	{
	    return ceshiMapper.selectCeshiList(ceshi);
	}
	
    /**
     * 新增测试格
     * 
     * @param ceshi 测试格信息
     * @return 结果
     */
	@Override
	public int insertCeshi(Ceshi ceshi)
	{
	    return ceshiMapper.insertCeshi(ceshi);
	}
	
	/**
     * 修改测试格
     * 
     * @param ceshi 测试格信息
     * @return 结果
     */
	@Override
	public int updateCeshi(Ceshi ceshi)
	{
	    return ceshiMapper.updateCeshi(ceshi);
	}

	/**
     * 删除测试格对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCeshiByIds(String ids)
	{
		return ceshiMapper.deleteCeshiByIds(Convert.toStrArray(ids));
	}
	
}
