package com.zouwentao.senior1.week1.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zouwentao.senior1.week1.domain.Brand;
import com.zouwentao.senior1.week1.domain.Goods;
import com.zouwentao.senior1.week1.domain.Type;

public interface GoodsService {

	List<Goods> list(Goods goods);

	List<Brand> selbid();

	List<Type> seltid();

	void add(Goods goods);

	int delete(String id);

	Goods toupdate(int id);

	void delete(Goods goods);

}
