package org.fiware.apps.marketplace.bo.impl;

import java.util.List;

import org.fiware.apps.marketplace.bo.LocaluserBo;
import org.fiware.apps.marketplace.dao.LocaluserDao;
import org.fiware.apps.marketplace.dao.StoreDao;
import org.fiware.apps.marketplace.model.Localuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("localuserBo")
public class LocaluserBoImpl implements LocaluserBo{

	@Autowired
	LocaluserDao localuserDao;
	
	public void setStoreDao (LocaluserDao localuser){
		this.localuserDao = localuser;
	}
	
	@Override
	public void save(Localuser localuser) {
		localuserDao.save(localuser);
		
	}

	@Override
	public void update(Localuser localuser) {
		localuserDao.update(localuser);
		
	}

	@Override
	public void delete(Localuser localuser) {
		localuserDao.delete(localuser);
		
	}

	@Override
	public Localuser findByName(String username) {
		return localuserDao.findByName(username);
		
	}

	@Override
	public List<Localuser> findLocalusers() {
		return localuserDao.findLocalusers();
	}

}
