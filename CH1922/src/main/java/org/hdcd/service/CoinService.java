package org.hdcd.service;

import java.util.List;

import org.hdcd.domain.ChargeCoin;

public interface CoinService {

	public void charge(ChargeCoin chargeCoin) throws Exception;

	public List<ChargeCoin> list(int userNo) throws Exception;

}
