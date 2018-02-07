package com.lanou.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lanou.bean.PageBean;
import com.lanou.entity.Factoryc;
import com.lanou.mapper.FactorycMapper;
import com.lanou.service.FactoryService;
import com.lanou.util.Constants;

@Transactional
@Service
public class FactoryServiceImpl implements FactoryService {

	@Resource
	public FactorycMapper factorycMapper;

	@Override
	public int insertSelective(Factoryc f) {
		// 为什么要加request呢，因为后台需要获取前端新增加的值
	//	f.setFACTORY_ID(UUID.randomUUID().toString());
//		f.setFACTORY_NAME(req.getParameter("FACTORY_NAME"));
//		f.setFULL_NAME(req.getParameter("FULL_NAME"));
//		f.setINSPECTOR(req.getParameter("INSPECTOR"));
//		f.setCONTACTS(req.getParameter("CONTACTS"));
//		f.setFAX(req.getParameter("FAX"));
//		f.setCNOTE(req.getParameter("CNOTE"));
//		f.setMOBILE(req.getParameter("MOBILE"));
//		f.setPHONE(req.getParameter("PHONE"));
//		f.setSTATE("1");
		int row = factorycMapper.insertSelective(f);
		return row;
	}

	@Override
	public Factoryc selectByPrimaryKey(String FACTORY_ID) {

		return factorycMapper.selectByPrimaryKey(FACTORY_ID);

	}

	@Override
	public List<Factoryc> selectAll() {
		// TODO Auto-generated method stub
		return factorycMapper.selectAll();
	}

	@Override
	public PageBean<Factoryc> pageFactory(int type, String condition, int pageNo,int pageSize) {
		Map<String, Object> map = new HashMap<>();
		switch (type) {
		case 1:
			map.put("fullName", condition);
			break;

		case 2:
			map.put("factoryName", condition);
			break;
		case 3:
			map.put("contacts", condition);
			break;
		case 4:
			map.put("phone", condition);
			break;
		case 5:
			map.put("mobile", condition);
			break;
		case 6:
			map.put("fax", condition);
			break;
		case 7:
			map.put("cnote", condition);
			break;
		}
		map.put("start", (pageNo-1)*pageSize+1);
		map.put("end", pageNo*pageSize);
		
		PageBean<Factoryc> page = new PageBean<>();
		page.setList(factorycMapper.selectPageByFactory(map));
		page.setTotalCount(factorycMapper.selectPageCount(map));
		page.setPageSize(pageSize);
		page.setPageNo(pageNo);

		return page;
	}

	@Override
	public int updateByPrimaryKeySelective(Factoryc record) {
		// TODO Auto-generated method stub
		return factorycMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteByPrimaryKey(String FACTORY_ID) {
		// TODO Auto-generated method stub
		return factorycMapper.deleteByPrimaryKey(FACTORY_ID);
	}

}
