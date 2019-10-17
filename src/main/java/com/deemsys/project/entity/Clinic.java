package com.deemsys.project.entity;

// Generated 19 Aug, 2017 10:03:05 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Clinic generated by hbm2java
 */
@Entity
@Table(name = "clinic", catalog = "injuryreportsdb")
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="clinic")
public class Clinic implements java.io.Serializable {

	private Integer clinicId;
	private CallerAdmin callerAdmin;
	private String clinicName;
	private String address;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private String city;
	private String state;
	private String county;
	private String country;
	private String zipcode;
	private String officeNumber;
	private String faxNumber;
	private String serviceArea;
	private String directions;
	private String notes;
	private Integer status;
	private Set<Doctor> doctors = new HashSet<Doctor>(0);
	private Set<ClinicTimings> clinicTimingses = new HashSet<ClinicTimings>(0);

	public Clinic() {
	}

	public Clinic(CallerAdmin callerAdmin, String clinicName, String address,
			BigDecimal latitude, BigDecimal longitude, String city,
			String state, String county, String country, String zipcode,
			String officeNumber, String faxNumber, String serviceArea,
			String directions, String notes, Integer status,
			Set<Doctor> doctors, Set<ClinicTimings> clinicTimingses) {
		this.callerAdmin = callerAdmin;
		this.clinicName = clinicName;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.city = city;
		this.state = state;
		this.county = county;
		this.country = country;
		this.zipcode = zipcode;
		this.officeNumber = officeNumber;
		this.faxNumber = faxNumber;
		this.serviceArea = serviceArea;
		this.directions = directions;
		this.notes = notes;
		this.status = status;
		this.doctors = doctors;
		this.clinicTimingses = clinicTimingses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "clinic_id", unique = true, nullable = false)
	public Integer getClinicId() {
		return this.clinicId;
	}

	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "caller_admin_id")
	public CallerAdmin getCallerAdmin() {
		return this.callerAdmin;
	}

	public void setCallerAdmin(CallerAdmin callerAdmin) {
		this.callerAdmin = callerAdmin;
	}

	@Column(name = "clinic_name", length = 90)
	public String getClinicName() {
		return this.clinicName;
	}

	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}

	@Column(name = "address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "latitude", precision = 14, scale = 12)
	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", precision = 14, scale = 12)
	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Column(name = "city", length = 45)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", length = 60)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "county", length = 60)
	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	@Column(name = "country", length = 60)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "zipcode", length = 10)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "office_number", length = 20)
	public String getOfficeNumber() {
		return this.officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	@Column(name = "fax_number", length = 20)
	public String getFaxNumber() {
		return this.faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	@Column(name = "service_area", length = 45)
	public String getServiceArea() {
		return this.serviceArea;
	}

	public void setServiceArea(String serviceArea) {
		this.serviceArea = serviceArea;
	}

	@Column(name = "directions")
	public String getDirections() {
		return this.directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clinic")
	public Set<Doctor> getDoctors() {
		return this.doctors;
	}

	public void setDoctors(Set<Doctor> doctors) {
		this.doctors = doctors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clinic")
	public Set<ClinicTimings> getClinicTimingses() {
		return this.clinicTimingses;
	}

	public void setClinicTimingses(Set<ClinicTimings> clinicTimingses) {
		this.clinicTimingses = clinicTimingses;
	}

}
