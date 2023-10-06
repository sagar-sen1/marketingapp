package com.marketingapp6.service;

import java.util.List;

import com.marketingapp6.entities.Lead;


public interface LeadService {
	public void saveLead(Lead lead);
	public List<Lead> getAllLeads();
	public void deleteLeadbyId(long id);
	public Lead findLeadById(long id);
}
