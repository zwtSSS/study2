package com.zouwentao.senior1.week1.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zouwentao.senior1.week1.domain.Brand;
import com.zouwentao.senior1.week1.domain.Goods;
import com.zouwentao.senior1.week1.domain.Type;
import com.zouwentao.senior1.week1.service.GoodsService;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "3")Integer pageSize,Goods goods) {
		PageHelper.startPage(pageNum, pageSize);
		List<Goods> list = goodsService.list(goods);
		System.out.println(list);
		PageInfo<Goods> pg = new PageInfo<Goods>(list);
		
		model.addAttribute("list", list);
		model.addAttribute("pg", pg);
		model.addAttribute("goods", goods);
		
		return "list";
	}
	
	
	@RequestMapping("toadd")
	public String toadd(Model model) {
		model.addAttribute("goods", new Goods());
		
		return "add";
	}
	
	@RequestMapping("add")
	public String add(@Validated @ModelAttribute("goods")Goods goods,BindingResult br, @RequestParam("file")MultipartFile file) throws IllegalStateException, IOException {
		if(file.isEmpty()) {
			return "add";
		}
		String path="f:/picture/";
		String oldfilename = file.getOriginalFilename();
		String filename=UUID.randomUUID()+file.getOriginalFilename().substring(oldfilename.lastIndexOf("."));
		File file2 = new File(path+filename);
		
		file.transferTo(file2);
		goods.setPic(filename);
		
		goodsService.add(goods);
		return "redirect:list";
	}
	
	@ResponseBody
	@RequestMapping("selbid")
	public List<Brand> selbid() {
		List<Brand> list = goodsService.selbid();
		System.out.println(list);
		return list;
	}
	@ResponseBody
	@RequestMapping("seltid")
	public List<Type> seltid() {
		List<Type> list = goodsService.seltid();
		System.out.println(list);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("deletes")
	public int delete(String id) {
		System.out.println(id);
		int i = goodsService.delete(id);
		
		return i;
	}
	
	@RequestMapping("toupdate")
	public String toupdate(int id,Model model) {
		Goods goods = goodsService.toupdate(id);
		System.out.println(goods);
		model.addAttribute("goods", goods);
		return "update";
	}
	
	@RequestMapping("update")
	public String delete(@Validated @ModelAttribute("goods")Goods goods,BindingResult br, @RequestParam("file")MultipartFile file) throws IllegalStateException, IOException {
		if(file.isEmpty()) {
			return "add";
		}
		String path="f:/picture/";
		String oldfilename = file.getOriginalFilename();
		String filename=UUID.randomUUID()+file.getOriginalFilename().substring(oldfilename.lastIndexOf("."));
		File file2 = new File(path+filename);
		
		file.transferTo(file2);
		goods.setPic(filename);
		
		goodsService.delete(goods);
		return "redirect:list";
	}
	
	@RequestMapping("xinxi")
	public String xinxi(int id,Model model) {
		Goods goods = goodsService.toupdate(id);
		System.out.println(goods);
		model.addAttribute("goods", goods);
		return "xinxi";
	}
}
