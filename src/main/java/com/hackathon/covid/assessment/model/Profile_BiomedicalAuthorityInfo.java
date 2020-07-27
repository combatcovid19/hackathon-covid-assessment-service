package com.hackathon.covid.assessment.model;

public class Profile_BiomedicalAuthorityInfo {

	private String biomedicalAuthorityCode;

	private long profileCode;

	private long profileZipCode;

	public Profile_BiomedicalAuthorityInfo() {

	}

	public String getBiomedicalAuthorityCode() {

		return biomedicalAuthorityCode;

	}

	public void setBiomedicalAuthorityCode(String biomedicalAuthorityCode) {

		this.biomedicalAuthorityCode = biomedicalAuthorityCode;

	}

	public long getProfileCode() {

		return profileCode;

	}

	public void setProfileCode(long profileCode) {

		this.profileCode = profileCode;

	}

	public long getProfileZipCode() {

		return profileZipCode;

	}

	public void setProfileZipCode(long profileZipCode) {

		this.profileZipCode = profileZipCode;

	}

}