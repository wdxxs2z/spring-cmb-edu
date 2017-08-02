package com.example.springcore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.springcore.dao.GoodsDao;
import com.example.springcore.domain.Goods;
import com.example.springcore.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	private GoodsDao gd;
	
	@Autowired
	@Qualifier("goodsDao")
	private void setGoodsDao(GoodsDao goodsDao) {
		this.gd = goodsDao;
	}

	@Override
	public Goods getGoodsByName(String goodsName) {
		return gd.getGoodsByName(goodsName);
	}

	@Override
	public List<Goods> getAllGoods() {
		return gd.getAllGoods();
	}

}
