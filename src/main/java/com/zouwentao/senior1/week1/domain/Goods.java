package com.zouwentao.senior1.week1.domain;

public class Goods {
	
	private Integer id;
	private String name;
	private Integer bid;
	private Integer tid;
	private double chicun;
	private double price;
	private Integer num;
	private String biaoqian;
	private String pic;
	private String bname;
	private String tname;
	public Goods(Integer id, String name, Integer bid, Integer tid, double chicun, double price, Integer num,
			String biaoqian, String pic, String bname, String tname) {
		super();
		this.id = id;
		this.name = name;
		this.bid = bid;
		this.tid = tid;
		this.chicun = chicun;
		this.price = price;
		this.num = num;
		this.biaoqian = biaoqian;
		this.pic = pic;
		this.bname = bname;
		this.tname = tname;
	}
	public Goods() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public double getChicun() {
		return chicun;
	}
	public void setChicun(double chicun) {
		this.chicun = chicun;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBiaoqian() {
		return biaoqian;
	}
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", bid=" + bid + ", tid=" + tid + ", chicun=" + chicun
				+ ", price=" + price + ", num=" + num + ", biaoqian=" + biaoqian + ", pic=" + pic + ", bname=" + bname
				+ ", tname=" + tname + "]";
	}
	
}
