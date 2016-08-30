package com.cnn.provider;

import br.com.bb.stock.Stock;

public class InformationProvider implements
		br.com.bb.provider.InformationProvider {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "CnnProvider";
	}

	@Override
	public double getCotation(Stock stock) {
		// TODO Auto-generated method stub
		return Math.random();
	}

}
