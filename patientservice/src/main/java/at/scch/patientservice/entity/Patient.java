package at.scch.patientservice.entity;

import com.fasterxml.jackson.annotation.JsonView;

import at.scch.securitylibary.config.jsonview.SecuredEntityViewPolicy;
import at.scch.securitylibary.config.jsonview.Views;

@SecuredEntityViewPolicy(value = "PatientViewPolicy")
public class Patient {
	
	private String firstName;
	private String lastName;
	
	private String tel;
	private Long svnr;
	private String address;
	
	@JsonView(Views.Detail.class)
	private String bloodGroup;
	private String gender;
	
	private Object[] laboratorityResults;
	
	public Patient(String firstName, String lastName, String tel, Long svnr, String bloodGroup, String address,
			String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.tel = tel;
		this.svnr = svnr;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.gender = gender;
	}

	public Patient() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Long getSvnr() {
		return svnr;
	}

	public void setSvnr(Long svnr) {
		this.svnr = svnr;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Object[] getLaboratorityResults() {
		return laboratorityResults;
	}

	public void setLaboratorityResults(Object[] laboratorityResults) {
		this.laboratorityResults = laboratorityResults;
	}
}
