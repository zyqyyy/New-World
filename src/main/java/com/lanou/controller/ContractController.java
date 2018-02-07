package com.lanou.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.lanou.bean.ContractBean;
import com.lanou.entity.Contractc;
import com.lanou.entity.Contractproductc;
import com.lanou.entity.Exportc;
import com.lanou.entity.Exportproductc;
import com.lanou.entity.Extcproductc;
import com.lanou.entity.Exteproductc;
import com.lanou.mapper.ExportproductcMapper;
import com.lanou.mapper.ExteproductcMapper;
import com.lanou.service.ContractHisService;
import com.lanou.service.ContractProductService;
import com.lanou.service.ContractService;
import com.lanou.service.ExportService;
import com.lanou.service.ExtCproductService;
import com.lanou.util.UtilFuns;

@Controller
@RequestMapping("/cargo")
public class ContractController {

	@Resource
	private ContractService contractService;
	@Resource
	private ExtCproductService extCproductService;
	@Resource
	private ContractProductService contractProductService;
	@Resource
	private ExportService exportService;
	@Resource
	private ExportproductcMapper exportproductcMapper;
	@Resource
	private ExteproductcMapper exteproductcMapper;
	@Resource
	private ContractHisService contractHisService;
	
	

	@RequestMapping("/contractproduct/tocreate")
	public String selectByAll(HttpServletRequest request) {

		List<ContractBean> dataList = contractService.selectPageContract();
		request.setAttribute("dataList", dataList);

		return "cargo/contract/jContractList";
	}

	/**
	 * 进入添加页面
	 * 
	 * @return
	 */
	@RequestMapping("/contractproduct/toAdd")
	public String toAdd() {

		return "cargo/contract/jContractCreate";
	}

	/**
	 * 添加
	 */
	@RequestMapping("/contractproduct/insert")
	public String insert(Contractc record) {

		record.setSTATE((short) 0);
		record.setSIGNING_DATE(new Date());
		int i = contractService.insertSelective(record);

		if (i > 0) {
			return "redirect:/cargo/contractproduct/tocreate";
		}
		return "cargo/contract/jContractCreate";

	}

	/**
	 * 进入查看页面
	 */
	@RequestMapping("/contractproduct/toView")
	public String selectView(HttpServletRequest request) {
		String contractId = request.getParameter("contractId");
		Contractc selectByPrimaryKey = contractService.selectByPrimaryKey(contractId);

		List<Contractproductc> contractProducts = contractProductService.selectByContractId(contractId);
		System.out.println(contractProducts.size());
		List<Extcproductc> extCproducts = new ArrayList<>();
		for (Contractproductc cp : contractProducts) {
			String id = cp.getCONTRACT_PRODUCT_ID();
			List<Extcproductc> ex = extCproductService.selectByContractProductId(id);
			extCproducts.addAll(ex);
			System.out.println(extCproducts);
		}

		request.setAttribute("contractProducts", contractProducts);
		request.setAttribute("extCproducts", extCproducts);
		request.setAttribute("obj", selectByPrimaryKey);

		return "cargo/contract/jContractView";

	}

	/**
	 * 进入修改页面
	 */
	@RequestMapping("/contractproduct/toUpdate")
	public String toUpdate(HttpServletRequest request) {

		String CONTRACT_ID = request.getParameter("contractId");
		Contractc ct = contractService.selectByPrimaryKey(CONTRACT_ID);
		request.setAttribute("obj", ct);

		return "cargo/contract/jContractUpdate";

	}

	/**
	 * 修改合同
	 */
	@RequestMapping("/contractproduct/update")
	public String update(HttpServletRequest request, Contractc record) {

		String CONTRACT_ID = request.getParameter("CONTRACT_ID");
		record.setCONTRACT_ID(CONTRACT_ID);
		int i = contractService.updateByPrimaryKeySelective(record);
		if (i > 0) {
			return "redirect:/cargo/contractproduct/tocreate";
		}
		return "cargo/contract/jContractUpdate";
	}

	/**
	 * 删除合同
	 */
	@RequestMapping("/contractproduct/delete")
	public String deleteContract(String[] contractId) {
		
		List<Contractproductc> list = new ArrayList<>();
		for (String s : contractId) {
			 list = contractProductService.selectByContractId(s);
		Contractc c = contractService.selectByPrimaryKey(s);
		List<Contractproductc> list3 = contractProductService.selectByContractId(s);
		if (c.getSTATE()==0 && list3==null) {
			contractService.delete(s);
		}else {
			int i = contractService.deleteByPrimaryKey(s);

			for (Contractproductc cp : list) {
				
				List<Extcproductc> list2 = extCproductService.selectByContractProductId(cp.getCONTRACT_PRODUCT_ID());
				
				contractProductService.deleteByPrimaryKey(cp.getCONTRACT_PRODUCT_ID());
				
				for (Extcproductc ep : list2) {
					extCproductService.deleteByPrimaryKey(ep.getEXT_CPRODUCT_ID());
				}
				
			}
		}
		
		}

		
		return "redirect:/cargo/contractproduct/tocreate";

	}

	/**
	 * 进入添加商品
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/contractproduct/toProductCreate")
	public String toProduct(HttpServletRequest request) {
		// 获取下拉选
		List<Contractproductc> factoryList = contractProductService.selectByFactory();
		request.setAttribute("factoryList", factoryList);
		// 获取合同id
		String CONTRACT_ID = request.getParameter("contractId");
		request.getSession().setAttribute("CONTRACT_ID", CONTRACT_ID);
		// 根据合同id查询商品信息
		List<Contractproductc> dataList = contractProductService.selectByContractId(CONTRACT_ID);
		request.setAttribute("dataList", dataList);

		return "cargo/contract/jContractProductCreate";

	}
	/**
	 * 上报
	 * @param request
	 * @return
	 */
	@RequestMapping("/updateState")
	public String updateState(String[] contractId,HttpServletRequest request) {
		for (String s : contractId) {
			Contractc key = contractService.selectByPrimaryKey(s);
			if (key.getSTATE()==0) {
				contractService.updateState(s);
				contractHisService.banjia(contractId);
			}
			
		}
		
		
		
 		return "redirect:/cargo/contractproduct/tocreate";
	}

	//总金额
	public void number(HttpServletRequest request) {
		String CONTRACT_ID = (String) request.getSession().getAttribute("CONTRACT_ID");
		//根据合同id查询合同的信息
		Contractc contractc = contractService.selectByPrimaryKey(CONTRACT_ID);
		//根据合同id查询货物的信息
		List<Contractproductc> list = contractProductService.selectByContractId(CONTRACT_ID);
		if (list!=null) {
			//总金额
			BigDecimal sum=BigDecimal.ZERO;
			BigDecimal sum1=BigDecimal.ZERO;
			for (Contractproductc c : list) {
				 sum=sum.add(c.getAMOUNT());
				 //查询附件信息
				 List<Extcproductc> list2 = extCproductService.selectByContractProductId(c.getCONTRACT_PRODUCT_ID());
				 if (list2!=null) {
					 for (Extcproductc e : list2) {
						 sum1=sum1.add(e.getAMOUNT());
					} 
					 
				}
			}
			contractc.setTOTAL_AMOUNT(sum.add(sum1));
			contractService.updateByPrimaryKeySelective(contractc);
			
		}
	}
	
	/**
	 * 添加货物商品
	 * 
	 * @param request
	 * @param record
	 * @return
	 */
	@RequestMapping("/contractproduct/productCreate")
	public ModelAndView productCreate(HttpServletRequest request, Contractproductc record) {
		String CONTRACT_ID = (String) request.getSession().getAttribute("CONTRACT_ID");

		// 获取工厂id添加工厂名称
		String FACTORY_ID = request.getParameter("FACTORY_ID");
		Contractproductc name = contractProductService.selectFactoryName(FACTORY_ID);
		record.setFACTORY_NAME(name.getFACTORY_NAME());
		// 获取合同的id
		record.setCONTRACT_ID(CONTRACT_ID);
		// 添加图片
		record.setPRODUCT_IMAGE("01.png");
		Short cnumber = record.getCNUMBER();
		BigDecimal price = record.getPRICE();
		// 获取总金额
		BigDecimal answer = price.multiply(new BigDecimal(cnumber));
		record.setAMOUNT(answer);
		record.setFACTORY_ID(FACTORY_ID);
//		//根据合同id查询合同的信息
//		Contractc contractc = contractService.selectByPrimaryKey(CONTRACT_ID);
//		//查询之前的货物信息
//		List<Contractproductc> list = contractProductService.selectByContractId(CONTRACT_ID);
//		BigDecimal sum=BigDecimal.ZERO;
//		for (Contractproductc c : list) {
//			 sum=sum.add(c.getAMOUNT());
//		}
//		sum=sum.add(answer);
//		System.out.println(sum+".........................................................");
//		
//		contractc.setTOTAL_AMOUNT(sum);
//		contractService.updateByPrimaryKeySelective(contractc);
		
		
		String url = "toProductCreate";
		ModelAndView m = null;

		int i = contractProductService.insertSelective(record);

		if (i > 0) {
			number(request);
			m = new ModelAndView(new RedirectView(url + "?contractId=" + CONTRACT_ID));
			return m;

		}
		return m;

	}

	/**
	 * 进入修改商品
	 */
	@RequestMapping("/contractproduct/toProductUpdate")
	public String toProductUpdate(HttpServletRequest request) {
		String CONTRACT_PRODUCT_ID = request.getParameter("id");
		Contractproductc obj = contractProductService.selectByPrimaryKey(CONTRACT_PRODUCT_ID);
		List<Contractproductc> factoryList = contractProductService.selectByFactory();
		request.getSession().setAttribute("CONTRACT_PRODUCT_ID", CONTRACT_PRODUCT_ID);
		request.setAttribute("obj", obj);
		request.setAttribute("factoryList", factoryList);
		return "cargo/contract/jContractProductUpdate";

	}

	/**
	 * 修改商品
	 */
	@RequestMapping("/contractproduct/ProductUpdate")
	public ModelAndView ProductUpdate(HttpServletRequest request, Contractproductc record) {
		String CONTRACT_ID = (String) request.getSession().getAttribute("CONTRACT_ID");
		String CONTRACT_PRODUCT_ID = (String) request.getSession().getAttribute("CONTRACT_PRODUCT_ID");
		ModelAndView m = null;
		String url = "toProductCreate";
		record.setPRODUCT_IMAGE(record.getPRODUCT_IMAGE());
		int cnumber = record.getCNUMBER();
		BigDecimal price = record.getPRICE();
		// 获取总金额
		BigDecimal answer = price.multiply(new BigDecimal(cnumber));
		record.setAMOUNT(answer);
		// 获取工厂id添加工厂名称
		String FACTORY_ID = request.getParameter("FACTORY_ID");
		record.setCONTRACT_PRODUCT_ID(CONTRACT_PRODUCT_ID);
		Contractproductc name = contractProductService.selectFactoryName(FACTORY_ID);
		record.setFACTORY_NAME(name.getFACTORY_NAME());
		int i = contractProductService.updateByPrimaryKeySelective(record);
		if (i > 0) {
			number(request);
			m = new ModelAndView(new RedirectView(url + "?contractId=" + CONTRACT_ID));
			return m;
		}

		return m;

	}

	/**
	 * 删除商品
	 */
	@RequestMapping("/contractproduct/deleteProduct")
	public ModelAndView deleteProduct(HttpServletRequest request) {
		String CONTRACT_PRODUCT_ID = request.getParameter("id");
		String contractId = request.getParameter("contractId");
		int i = contractProductService.deleteByPrimaryKey(CONTRACT_PRODUCT_ID);
		String url = "toProductCreate";
		ModelAndView m = new ModelAndView(new RedirectView(url + "?contractId=" + contractId));
		if (i > 0) {
			number(request);
			return m;
		}

		return m;

	}

	/**
	 * 进入附件
	 */
	@RequestMapping("/contractproduct/toExtProductCreate")
	public String toProductCreate(HttpServletRequest request) {
		
		String contractId = (String) request.getSession().getAttribute("CONTRACT_ID");
		List<Contractproductc> factoryList = contractProductService.selectByFactory();
		request.setAttribute("factoryList", factoryList);
		String contractProductId = request.getParameter("contractProductId");
		List<Extcproductc> dataList = extCproductService.selectByContractProductId(contractProductId);
		request.setAttribute("dataList", dataList);
		request.setAttribute("ContractProductId", contractProductId);
		request.setAttribute("contractId", contractId);
		return "cargo/contract/jExtCproductCreate";

	}

	/**
	 * 添加附件
	 */
	@RequestMapping("/contractproduct/addExtProductCreate")
	public ModelAndView addExtProductCreate(HttpServletRequest request,Extcproductc record) {
		
		// 获取工厂id添加工厂名称
		String FACTORY_ID = request.getParameter("FACTORY_ID");
		Contractproductc name = contractProductService.selectFactoryName(FACTORY_ID);
		record.setFACTORY_NAME(name.getFACTORY_NAME());
		String contractProductId = request.getParameter("ContractProductId");
		record.setCONTRACT_PRODUCT_ID(contractProductId);
		int cnumber = record.getCNUMBER();
		BigDecimal price = record.getPRICE();
		// 获取总金额
		BigDecimal answer = price.multiply(new BigDecimal(cnumber));
		
		
		record.setAMOUNT(answer);
		int i = extCproductService.insertSelective(record);
		
		String url = "toExtProductCreate";
		ModelAndView m = null;


		if (i > 0) {
			number(request);
			m = new ModelAndView(new RedirectView(url + "?contractProductId=" + contractProductId));
			System.out.println("添加成功+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			return m;

		}
		return m;


	}
	
	/**
	 * 进入附件修改页面
	 */
	
	@RequestMapping("/contractproduct/toExtProductupdate")
	public String toExtProductupdate(HttpServletRequest request) {
		
		List<Contractproductc> factoryList = contractProductService.selectByFactory();
		
		
		request.setAttribute("factoryList", factoryList);
		
		
		
		String EXT_CPRODUCT_ID = request.getParameter("extCproductId");
		Extcproductc obj = extCproductService.selectByPrimaryKey(EXT_CPRODUCT_ID);
		request.setAttribute("obj", obj);
		
		return "cargo/contract/jExtCproductUpdate";
	}
	
	/**
	 * 修改附件
	 */
	@RequestMapping("/contractproduct/ExtProductupdate")
	public ModelAndView ExtProductupdate(HttpServletRequest request,Extcproductc record) {
		
		
		String EXT_CPRODUCT_ID = request.getParameter("id");
		String contractProductId = request.getParameter("contractProductId");
		String FACTORY_ID = request.getParameter("FACTORY_ID");
		Contractproductc name = contractProductService.selectFactoryName(FACTORY_ID);
		record.setFACTORY_NAME(name.getFACTORY_NAME());
		record.setPRODUCT_IMAGE(record.getPRODUCT_IMAGE());
		record.setEXT_CPRODUCT_ID(EXT_CPRODUCT_ID);
		record.setCONTRACT_PRODUCT_ID(contractProductId);
		int cnumber = record.getCNUMBER();
		BigDecimal price = record.getPRICE();
		// 获取总金额
		BigDecimal answer = price.multiply(new BigDecimal(cnumber));
		
		
		record.setAMOUNT(answer);
		ModelAndView m = null;
		String url = "toExtProductCreate";
		int i = extCproductService.updateByPrimaryKeySelective(record);
		if (i>0) {
			number(request);
			m = new ModelAndView(new RedirectView(url + "?contractProductId=" + contractProductId));
			return m;
		}
		return m;
	}
	
	/**
	 * 删除附件
	 */
	@RequestMapping("/contractproduct/ExtProductdelete")
	public ModelAndView ExtProductdelete(HttpServletRequest request) {
		String contractProductId = request.getParameter("contractProductId");
		String EXT_CPRODUCT_ID = request.getParameter("extCproductId");
		int i = extCproductService.deleteByPrimaryKey(EXT_CPRODUCT_ID);
		String url = "toExtProductCreate";
		ModelAndView m = new ModelAndView(new RedirectView(url + "?extCproductId=" + EXT_CPRODUCT_ID+"&contractProductId="+contractProductId));
		if (i > 0) {
			number(request);
			return m;
		}

		return m;
		
		
		
	}
	
	//报运
	@RequestMapping("/contractproduct/baoyun")
	public ModelAndView baoyun(String[] contractId) {
		ModelAndView m = new ModelAndView(new RedirectView("/jk/export/toExportList"));
		
		//创建新的报运单对象
		Exportc e = new Exportc();
		//分割报运的合同id
		e.setCONTRACT_IDS(UtilFuns.joinStr(contractId,","));
		StringBuffer sb = new StringBuffer();
		for (String s : contractId) {
			//根据合同id查询合同
			Contractc c = contractService.selectByPrimaryKey(s);
			
			c.setSTATE((short)2);
			
			contractService.updateByPrimaryKeySelective(c);
			
			
			//获取合同号,拼接
			sb.append(c.getCONTRACT_NO()+" ");
		}
		e.setCUSTOMER_CONTRACT(sb.toString());
		e.setINPUT_DATE(new Date());
		e.setSTATE((short)0);
		//添加报运单
		exportService.insertSelective(e);
		
		//添加报运货物
		for (String s : contractId) {
			//根据合同id 查询货物
			List<Contractproductc> list = contractProductService.selectByContractId(s);
			for (Contractproductc cpp : list) {
				//创建一个报运货物对象
				Exportproductc ep = new Exportproductc();
				
				ep.setFACTORY_ID(cpp.getFACTORY_ID());
				ep.setFACTORY_NAME(cpp.getFACTORY_NAME());
				ep.setPRICE(cpp.getPRICE());
				ep.setCNUMBER(cpp.getCNUMBER());
				ep.setPACKING_UNIT(cpp.getPACKING_UNIT());
				ep.setORDER_NO(cpp.getORDER_NO());
				ep.setPRODUCT_NO(cpp.getPRODUCT_NO());
				ep.setPRICE(cpp.getPRICE());
				ep.setEXPORT_ID(e.getEXPORT_ID());
				ep.setBOX_NUM(cpp.getBOX_NUM());
				ep.setEXPORT_PRODUCT_ID(UUID.randomUUID().toString());
				//添加报运货物
				exportproductcMapper.insertSelective(ep);
				String contractProductId = cpp.getCONTRACT_PRODUCT_ID();
				
				List<Extcproductc> list2 = extCproductService.selectByContractProductId(contractProductId);
				for (Extcproductc ec : list2) {
					//创建报运附件对象
					Exteproductc eproduct = new Exteproductc();
					eproduct.setEXT_EPRODUCT_ID(UUID.randomUUID().toString());
					eproduct.setEXPORT_PRODUCT_ID(ep.getEXPORT_PRODUCT_ID());
					eproduct.setAMOUNT(ec.getAMOUNT());
					eproduct.setCNUMBER(ec.getCNUMBER());
					eproduct.setFACTORY_ID(ec.getFACTORY_ID());
					eproduct.setFACTORY_NAME(ec.getFACTORY_NAME());
					eproduct.setPACKING_UNIT(ec.getPACKING_UNIT());
					eproduct.setPRICE(ec.getPRICE());
					eproduct.setPRODUCT_NO(ec.getPRODUCT_NO());
					eproduct.setPRODUCT_IMAGE(ec.getPRODUCT_IMAGE());
					eproduct.setPRODUCT_DESC(ec.getPRODUCT_DESC());
					//添加报运附件
					exteproductcMapper.insertSelective(eproduct);
				}
			}
		}		
		return m ;
	}
}
