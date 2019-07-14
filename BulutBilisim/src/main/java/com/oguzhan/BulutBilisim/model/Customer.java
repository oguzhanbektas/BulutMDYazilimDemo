package com.oguzhan.BulutBilisim.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String fullname;

	private String tc;

	private String address;

	private String phone;

	private String email;

	@Column(name = "date_of_birth")
	@DateTimeFormat(iso = ISO.DATE)
	private Date dateOfBirth;

	@Column(name = "retail_trade")
	private String retailTrade;// Parakende Ticaretle uğraştınız mı ?

	@Column(name = "lokumcu_baba_to_choose")
	private String lokumcuBabaToChoose;// Lokumcu Babayı tercih Etme sebebi

	@Column(name = "lokumcu_baba_location")
	private String lokumcuBabaLocation;// Hangi il ilçe vs için düşünüyorsunuz

	@Column(name = "investment_amount")
	private int investmentAmount;// Yatırım Miktarı

	@Column(name = "want_to_add")
	private String wantToAdd;// Eklemek İstedikleriniz.

	public Customer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRetailTrade() {
		return retailTrade;
	}

	public String isRetailTrade() {
		return retailTrade;
	}

	public void setRetailTrade(String retailTrade) {
		this.retailTrade = retailTrade;
	}

	public String getLokumcuBabaToChoose() {
		return lokumcuBabaToChoose;
	}

	public void setLokumcuBabaToChoose(String lokumcuBabaToChoose) {
		this.lokumcuBabaToChoose = lokumcuBabaToChoose;
	}

	public String getLokumcuBabaLocation() {
		return lokumcuBabaLocation;
	}

	public void setLokumcuBabaLocation(String lokumcuBabaLocation) {
		this.lokumcuBabaLocation = lokumcuBabaLocation;
	}

	public int getInvestmentAmount() {
		return investmentAmount;
	}

	public void setInvestmentAmount(int investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public String getWantToAdd() {
		return wantToAdd;
	}

	public void setWantToAdd(String wantToAdd) {
		this.wantToAdd = wantToAdd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fullname=" + fullname + ", tc=" + tc + ", address=" + address + ", phone="
				+ phone + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", retailTrade=" + retailTrade
				+ ", lokumcuBabaToChoose=" + lokumcuBabaToChoose + ", lokumcuBabaLocation=" + lokumcuBabaLocation
				+ ", investmentAmount=" + investmentAmount + ", wantToAdd=" + wantToAdd + "]";
	}
}
