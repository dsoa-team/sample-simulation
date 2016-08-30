package com.reuters.provider;

import br.com.bb.stock.Stock;

public class InformationProvider  implements
		br.com.bb.provider.InformationProvider {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "ReutersProvider";
	}

	@Override
	public double getCotation(Stock stock) {
		// TODO Auto-generated method stub
		return Math.random();
	}

}
