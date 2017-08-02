package com.example.springcore.service;

import java.util.List;

import com.example.springcore.domain.Goods;

public interface GoodsService {
	
	public Goods getGoodsByName(String goodsName);
	
	public List<Goods> getAllGoods();

}
