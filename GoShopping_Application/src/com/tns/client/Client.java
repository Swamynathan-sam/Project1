package com.tns.client;

import com.tns.application.*;
import com.tns.framework.*;
public class Client {

	public static void main(String[] args) {
		ShopFactory sp=new GSShopFactory();
		PrimeAcc pa=new GSPrimeAcc(123, "david", 1000, true);
		NormalAcc na=new GSNormalAcc(143, "Sam", 1000, 50);
		pa.bookProduct(0);
		na.bookProduct(50);
	}

}
