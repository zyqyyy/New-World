package com.lanou.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanou.bean.ExportBean;
import com.lanou.entity.Exportc;
import com.lanou.mapper.ExportcMapper;
import com.lanou.service.ExportService;
@Transactional
@Service
public class ExportServiceImpl implements ExportService {

	@Resource
	private ExportcMapper exportMapper;
	
	@Override
	public List<ExportBean> selectByExport() {
		// TODO Auto-generated method stub
		return exportMapper.selectByExport();
	}

	@Override
	public int deleteByPrimaryKey(String[] id) {
		// TODO Auto-generated method stub
		return exportMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insertSelective(Exportc record) {
		// TODO Auto-generated method stub
		return exportMapper.insertSelective(record);
	}

	@Override
	public Exportc selectByPrimaryKey(String EXPORT_ID) {
		// TODO Auto-generated method stub
		return exportMapper.selectByPrimaryKey(EXPORT_ID);
	}

	@Override
	public int updateByPrimaryKeySelective(Exportc record) {
		// TODO Auto-generated method stub
		return exportMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateState(String[] id) {
		// TODO Auto-generated method stub
		return exportMapper.updateState(id);
	}

}
