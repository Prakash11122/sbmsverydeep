package com.it.profile.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "passport")
public class Passport {

	protected String passportNo;

	protected String passportHolderName;

	protected String issuedBy;

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getPassportHolderName() {
		return passportHolderName;
	}

	public void setPassportHolderName(String passportHolderName) {
		this.passportHolderName = passportHolderName;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", passportHolderName=" + passportHolderName + ", issuedBy="
				+ issuedBy + "]";
	}

}
