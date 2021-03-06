package com.fil.dao.database.daoImp;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fil.dao.database.DBConnection;
import com.fil.dao.database.dao.SupplyDAO;
import com.fil.dao.database.entity.SupplyEntity;

public class SupplyDAOImpl implements SupplyDAO {
	
	List<SupplyEntity> entityList = new ArrayList<SupplyEntity>();

	public SupplyDAOImpl() {
		// TODO Auto-generated constructor stub
		
		try {
			Statement statement = DBConnection.getDBConnection().createStatement();
			ResultSet set = statement.executeQuery("select * from supply");
			while(set.next()) {
				SupplyEntity entity = new SupplyEntity(set.getInt("sid"), set.getInt("supply_id"),set.getInt("pid"), set.getInt("qty"), set.getDate("supdate") ); 
				entityList.add(entity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<SupplyEntity> getAllSupplyList() {
		// TODO Auto-generated method stub
		return entityList;
	}

	@Override
	public boolean addSupplyEntry(SupplyEntity entry) {
		// TODO Auto-generated method stub
		try {
			Statement statement = DBConnection.getDBConnection().createStatement();
			System.out.println(entry.getDate());
			int set = statement.executeUpdate("insert into supply values(" + entry.getSupply_id()+","+entry.getSid()+","+entry.getPid()+","+entry.getQty()+",'"+entry.getDate()+"')");
			//System.out.println(set);
			entityList.add(entry);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean deleteSupplyEntry(SupplyEntity entry) {
		// TODO Auto-generated method stub
		
		return false;
	}

}
