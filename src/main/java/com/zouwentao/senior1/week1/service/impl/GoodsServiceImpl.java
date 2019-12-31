package com.zouwentao.senior1.week1.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zouwentao.senior1.week1.dao.GoodsMapper;
import com.zouwentao.senior1.week1.domain.Brand;
import com.zouwentao.senior1.week1.domain.Goods;
import com.zouwentao.senior1.week1.domain.Type;
import com.zouwentao.senior1.week1.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsMapper goodsMapper;
	
	@Override
	public List<Goods> list(Goods goods) {
		List<Goods> list = goodsMapper.list(goods);
		return list;
	}

	@Override
	public List<Brand> selbid() {
		
		return goodsMapper.selbid();
	}

	@Override
	public List<Type> seltid() {
		
		return goodsMapper.seltid();
	}

	@Override
	public void add(Goods goods) {
		goodsMapper.add(goods);
		
	}

	@Override
	public int delete(String id) {
		
		return goodsMapper.delete(id);
	}

	@Override
	public Goods toupdate(int id) {
		
		return goodsMapper.toupdate(id);
	}

	@Override
	public void delete(Goods goods) {
		
		goodsMapper.update(goods);
	}

}
