package com.fil.dao.database.dao;

import java.util.List;

import com.fil.dao.database.entity.SupplyEntity;

public interface SupplyDAO {

	List<SupplyEntity> getAllSupplyList();
	boolean addSupplyEntry(SupplyEntity entry);
	boolean deleteSupplyEntry(SupplyEntity entry);
	
}
