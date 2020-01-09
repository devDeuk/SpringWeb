package org.hdcd.mapper;

import java.util.List;

import org.hdcd.domain.ChargeCoin;

public interface CoinMapper {

	public void create(ChargeCoin chargeCoin) throws Exception;

	public void charge(ChargeCoin chargeCoin) throws Exception;

	public List<ChargeCoin> list(int userNo) throws Exception;

}
