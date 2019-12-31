package com.zouwentao.senior1.week1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zouwentao.senior1.week1.domain.Brand;
import com.zouwentao.senior1.week1.domain.Goods;
import com.zouwentao.senior1.week1.domain.Type;

public interface GoodsMapper {

	List<Goods> list(Goods goods);

	@Select("select * from tb_brand")
	List<Brand> selbid();
	
	@Select("select * from tb_goodskind")
	List<Type> seltid();

	@Insert("insert into tb_goods values(0,#{name},#{bid},#{tid},#{chicun},#{price},#{num},#{biaoqian},#{pic})")
	void add(Goods goods);

	@Delete("delete from tb_goods where id in(#{id})")
	int delete(String id);

	@Select("select * from tb_goods where id=#{gid}")
	Goods toupdate(@Param("gid")int id);

	@Update("update tb_goods set name=#{name},bid=#{bid},tid=#{tid},chicun=#{chicun},price=#{price},num=#{num},biaoqian=#{biaoqian},pic=#{pic} where id=#{id}")
	void update(Goods goods);

}
