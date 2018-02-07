package com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanou.entity.Packinglistc;
import com.lanou.mapper.PackinglistcMapper;
import com.lanou.service.PackingListService;
@Transactional
@Service
public class PackingListServiceImpl implements PackingListService {

	@Resource
	private PackinglistcMapper packingListMapper;
	
	@Override
	public List<Packinglistc> selectPackingAll() {
		
		return packingListMapper.selectPackingAll();
	}

	@Override
	public int deleteByPrimaryKey(String[] PACKING_LIST_ID) {
		// TODO Auto-generated method stub
		return packingListMapper.deleteByPrimaryKey(PACKING_LIST_ID);
	}

	@Override
	public int insertSelective(Packinglistc record) {
		// TODO Auto-generated method stub
		return packingListMapper.insertSelective(record);
	}

	@Override
	public Packinglistc selectByPrimaryKey(String PACKING_LIST_ID) {
		// TODO Auto-generated method stub
		return packingListMapper.selectByPrimaryKey(PACKING_LIST_ID);
	}

	@Override
	public int updateByPrimaryKeySelective(Packinglistc record) {
		// TODO Auto-generated method stub
		return packingListMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int update(String[] id) {
		// TODO Auto-generated method stub
		return packingListMapper.update(id);
	}

}
