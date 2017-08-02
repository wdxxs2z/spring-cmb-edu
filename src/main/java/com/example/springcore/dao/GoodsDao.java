package com.example.springcore.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.springcore.domain.Goods;

@Repository
public class GoodsDao {
	
	public Goods getGoodsByName(String goodsName) {
		Goods goods = new Goods();
		goods.setName("矿泉水");
		goods.setPrice(2.00);
		goods.setLevel(3);;
		return goods;
	}

	public List<Goods> getAllGoods() {
		Goods a = new Goods();
		a.setName("洗衣液");
		a.setPrice(12.50);
		a.setLevel(5);;
		Goods b = new Goods();
		b.setName("食用油");
		b.setPrice(30.50);
		b.setLevel(4);;
		List<Goods> goods = new ArrayList<Goods>();
		goods.add(a);
		goods.add(b);
		return goods;
	}


}
