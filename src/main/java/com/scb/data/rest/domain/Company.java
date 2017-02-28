/**
 * 
 */
package com.scb.data.rest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Simple Domain representation of a Company
 * 
 * @author Manglu
 *
 */
@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer companyID;
	
	
	/**
	 * @param companyID
	 * @param sNameEnglish
	 * @param sNameThai
	 * @param taxID
	 * @param companyStatus

	public Company(Integer companyID, String sNameEnglish, String sNameThai, String taxID, String companyStatus) {
		super();
		this.companyID = companyID;
		this.sNameEnglish = sNameEnglish;
		this.sNameThai = sNameThai;
		this.taxID = taxID;
		this.companyStatus = companyStatus;
	}

	 */
	
	private String sNameEnglish;

	private String sNameThai;
	
	private String taxID;
	
	private String companyStatus;
		
	
	/**
	 * Default Constructor to keep JPA Provider happy
	 */
	protected Company(){
		
	}
	
	
	public Integer getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}

	public String getsNameEnglish() {
		return sNameEnglish;
	}

	public void setsNameEnglish(String sNameEnglish) {
		this.sNameEnglish = sNameEnglish;
	}

	public String getsNameThai() {
		return sNameThai;
	}

	public void setsNameThai(String sNameThai) {
		this.sNameThai = sNameThai;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}


@Override
public String toString() {
	return "Company [companyID=" + companyID + ", sNameEnglish=" + sNameEnglish + ", sNameThai=" + sNameThai
			+ ", taxID=" + taxID + ", companyStatus=" + companyStatus + "]";
}	

}
