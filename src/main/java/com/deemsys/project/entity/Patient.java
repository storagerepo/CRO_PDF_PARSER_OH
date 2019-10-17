package com.deemsys.project.entity;

// Generated 19 Aug, 2017 10:03:05 AM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Patient generated by hbm2java
 */
@Entity
@Table(name = "patient", catalog = "injuryreportsdb")
//@Cache(usage=CacheConcurrencyStrategy.READ_WRITE, region="patient")
public class Patient implements java.io.Serializable {

	private String patientId;
	private CrashReport crashReport;
	private County county;
	private VehicleMakeAbbreviation vehicleMakeAbbreviation;
	private String localReportNumber;
	private String crashSeverity;
	private String reportingAgencyNcic;
	private String reportingAgencyName;
	private String numberOfUnits;
	private String unitInError;
	private String cityVillageTownship;
	private Date crashDate;
	private Date addedDate;
	private String timeOfCrash;
	private String unitNumber;
	private String name;
	private String dateOfBirth;
	private Integer age;
	private String gender;
	private String address;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private String phoneNumber;
	private String injuries;
	private String emsAgency;
	private String medicalFacility;
	private String atFaultInsuranceCompany;
	private String atFaultPolicyNumber;
	private String victimInsuranceCompany;
	private String victimPolicyNumber;
	private String seatingPosition;
	private Integer damageScale;
	private Integer tier;
	private String vehicleYear;
	private String vin;
	private String licensePlateNumber;
	private Integer typeOfUse;
	private Integer isOwner;
	private Integer patientStatus;
	private String crashReportFileName;
	private Integer isRunnerReport;
	private Integer status;
	private Set<PatientCallerAdminMap> patientCallerAdminMaps = new HashSet<PatientCallerAdminMap>(
			0);
	private Set<PatientLawyerAdminMap> patientLawyerAdminMaps = new HashSet<PatientLawyerAdminMap>(
			0);

	public Patient() {
	}

	public Patient(String patientId) {
		this.patientId = patientId;
	}

	public Patient(String patientId, CrashReport crashReport, County county,
			VehicleMakeAbbreviation vehicleMakeAbbreviation,
			String localReportNumber, String crashSeverity,
			String reportingAgencyNcic, String reportingAgencyName,
			String numberOfUnits, String unitInError,
			String cityVillageTownship, Date crashDate, Date addedDate,
			String timeOfCrash, String unitNumber, String name,
			String dateOfBirth, Integer age, String gender, String address,
			BigDecimal latitude, BigDecimal longitude, String phoneNumber,
			String injuries, String emsAgency, String medicalFacility,
			String atFaultInsuranceCompany, String atFaultPolicyNumber,
			String victimInsuranceCompany, String victimPolicyNumber,
			String seatingPosition, Integer damageScale, Integer tier,
			String vehicleYear, String vin, String licensePlateNumber, Integer typeOfUse,
			Integer isOwner, Integer patientStatus, String crashReportFileName,
			Integer isRunnerReport, Integer status,
			Set<PatientCallerAdminMap> patientCallerAdminMaps,
			Set<PatientLawyerAdminMap> patientLawyerAdminMaps) {
		this.patientId = patientId;
		this.crashReport = crashReport;
		this.county = county;
		this.vehicleMakeAbbreviation = vehicleMakeAbbreviation;
		this.localReportNumber = localReportNumber;
		this.crashSeverity = crashSeverity;
		this.reportingAgencyNcic = reportingAgencyNcic;
		this.reportingAgencyName = reportingAgencyName;
		this.numberOfUnits = numberOfUnits;
		this.unitInError = unitInError;
		this.cityVillageTownship = cityVillageTownship;
		this.crashDate = crashDate;
		this.addedDate = addedDate;
		this.timeOfCrash = timeOfCrash;
		this.unitNumber = unitNumber;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.phoneNumber = phoneNumber;
		this.injuries = injuries;
		this.emsAgency = emsAgency;
		this.medicalFacility = medicalFacility;
		this.atFaultInsuranceCompany = atFaultInsuranceCompany;
		this.atFaultPolicyNumber = atFaultPolicyNumber;
		this.victimInsuranceCompany = victimInsuranceCompany;
		this.victimPolicyNumber = victimPolicyNumber;
		this.seatingPosition = seatingPosition;
		this.damageScale = damageScale;
		this.tier = tier;
		this.vehicleYear = vehicleYear;
		this.vin = vin;
		this.licensePlateNumber = licensePlateNumber;
		this.typeOfUse = typeOfUse;
		this.isOwner = isOwner;
		this.patientStatus = patientStatus;
		this.crashReportFileName = crashReportFileName;
		this.isRunnerReport = isRunnerReport;
		this.status = status;
		this.patientCallerAdminMaps = patientCallerAdminMaps;
		this.patientLawyerAdminMaps = patientLawyerAdminMaps;
	}

	@Id
	@Column(name = "patient_id", unique = true, nullable = false, length = 32)
	public String getPatientId() {
		return this.patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "crash_id")
	public CrashReport getCrashReport() {
		return this.crashReport;
	}

	public void setCrashReport(CrashReport crashReport) {
		this.crashReport = crashReport;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "county_id")
	public County getCounty() {
		return this.county;
	}

	public void setCounty(County county) {
		this.county = county;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicle_make")
	public VehicleMakeAbbreviation getVehicleMakeAbbreviation() {
		return this.vehicleMakeAbbreviation;
	}

	public void setVehicleMakeAbbreviation(
			VehicleMakeAbbreviation vehicleMakeAbbreviation) {
		this.vehicleMakeAbbreviation = vehicleMakeAbbreviation;
	}

	@Column(name = "local_report_number", length = 45)
	public String getLocalReportNumber() {
		return this.localReportNumber;
	}

	public void setLocalReportNumber(String localReportNumber) {
		this.localReportNumber = localReportNumber;
	}

	@Column(name = "crash_severity", length = 5)
	public String getCrashSeverity() {
		return this.crashSeverity;
	}

	public void setCrashSeverity(String crashSeverity) {
		this.crashSeverity = crashSeverity;
	}

	@Column(name = "reporting_agency_ncic", length = 10)
	public String getReportingAgencyNcic() {
		return this.reportingAgencyNcic;
	}

	public void setReportingAgencyNcic(String reportingAgencyNcic) {
		this.reportingAgencyNcic = reportingAgencyNcic;
	}

	@Column(name = "reporting_agency_name", length = 100)
	public String getReportingAgencyName() {
		return this.reportingAgencyName;
	}

	public void setReportingAgencyName(String reportingAgencyName) {
		this.reportingAgencyName = reportingAgencyName;
	}

	@Column(name = "number_of_units", length = 5)
	public String getNumberOfUnits() {
		return this.numberOfUnits;
	}

	public void setNumberOfUnits(String numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	@Column(name = "unit_in_error", length = 5)
	public String getUnitInError() {
		return this.unitInError;
	}

	public void setUnitInError(String unitInError) {
		this.unitInError = unitInError;
	}

	@Column(name = "city_village_township", length = 100)
	public String getCityVillageTownship() {
		return this.cityVillageTownship;
	}

	public void setCityVillageTownship(String cityVillageTownship) {
		this.cityVillageTownship = cityVillageTownship;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "crash_date", length = 10)
	public Date getCrashDate() {
		return this.crashDate;
	}

	public void setCrashDate(Date crashDate) {
		this.crashDate = crashDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "added_date", length = 10)
	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Column(name = "time_of_crash", length = 45)
	public String getTimeOfCrash() {
		return this.timeOfCrash;
	}

	public void setTimeOfCrash(String timeOfCrash) {
		this.timeOfCrash = timeOfCrash;
	}

	@Column(name = "unit_number", length = 5)
	public String getUnitNumber() {
		return this.unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "date_of_birth", length = 45)
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "gender", length = 5)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "address", length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "latitude", precision = 16, scale = 11)
	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	@Column(name = "longitude", precision = 16, scale = 11)
	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	@Column(name = "phone_number", length = 20)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "injuries", length = 5)
	public String getInjuries() {
		return this.injuries;
	}

	public void setInjuries(String injuries) {
		this.injuries = injuries;
	}

	@Column(name = "ems_agency", length = 100)
	public String getEmsAgency() {
		return this.emsAgency;
	}

	public void setEmsAgency(String emsAgency) {
		this.emsAgency = emsAgency;
	}

	@Column(name = "medical_facility", length = 100)
	public String getMedicalFacility() {
		return this.medicalFacility;
	}

	public void setMedicalFacility(String medicalFacility) {
		this.medicalFacility = medicalFacility;
	}

	@Column(name = "at_fault_insurance_company", length = 100)
	public String getAtFaultInsuranceCompany() {
		return this.atFaultInsuranceCompany;
	}

	public void setAtFaultInsuranceCompany(String atFaultInsuranceCompany) {
		this.atFaultInsuranceCompany = atFaultInsuranceCompany;
	}

	@Column(name = "at_fault_policy_number", length = 45)
	public String getAtFaultPolicyNumber() {
		return this.atFaultPolicyNumber;
	}

	public void setAtFaultPolicyNumber(String atFaultPolicyNumber) {
		this.atFaultPolicyNumber = atFaultPolicyNumber;
	}

	@Column(name = "victim_insurance_company", length = 100)
	public String getVictimInsuranceCompany() {
		return this.victimInsuranceCompany;
	}

	public void setVictimInsuranceCompany(String victimInsuranceCompany) {
		this.victimInsuranceCompany = victimInsuranceCompany;
	}

	@Column(name = "victim_policy_number", length = 45)
	public String getVictimPolicyNumber() {
		return this.victimPolicyNumber;
	}

	public void setVictimPolicyNumber(String victimPolicyNumber) {
		this.victimPolicyNumber = victimPolicyNumber;
	}

	@Column(name = "seating_position", length = 10)
	public String getSeatingPosition() {
		return this.seatingPosition;
	}

	public void setSeatingPosition(String seatingPosition) {
		this.seatingPosition = seatingPosition;
	}

	@Column(name = "damage_scale")
	public Integer getDamageScale() {
		return this.damageScale;
	}

	public void setDamageScale(Integer damageScale) {
		this.damageScale = damageScale;
	}

	@Column(name = "tier")
	public Integer getTier() {
		return this.tier;
	}

	public void setTier(Integer tier) {
		this.tier = tier;
	}

	@Column(name = "vehicle_year", length = 10)
	public String getVehicleYear() {
		return this.vehicleYear;
	}

	public void setVehicleYear(String vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	@Column(name = "VIN", length = 45)
	public String getVin() {
		return this.vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	@Column(name = "license_plate_number", length = 45)
	public String getLicensePlateNumber() {
		return this.licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	@Column(name = "type_of_use")
	public Integer getTypeOfUse() {
		return typeOfUse;
	}

	public void setTypeOfUse(Integer typeOfUse) {
		this.typeOfUse = typeOfUse;
	}

	@Column(name = "is_owner")
	public Integer getIsOwner() {
		return this.isOwner;
	}

	public void setIsOwner(Integer isOwner) {
		this.isOwner = isOwner;
	}

	@Column(name = "patient_status")
	public Integer getPatientStatus() {
		return this.patientStatus;
	}

	public void setPatientStatus(Integer patientStatus) {
		this.patientStatus = patientStatus;
	}

	@Column(name = "crash_report_file_name", length = 100)
	public String getCrashReportFileName() {
		return this.crashReportFileName;
	}

	public void setCrashReportFileName(String crashReportFileName) {
		this.crashReportFileName = crashReportFileName;
	}

	@Column(name = "is_runner_report")
	public Integer getIsRunnerReport() {
		return this.isRunnerReport;
	}

	public void setIsRunnerReport(Integer isRunnerReport) {
		this.isRunnerReport = isRunnerReport;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<PatientCallerAdminMap> getPatientCallerAdminMaps() {
		return this.patientCallerAdminMaps;
	}

	public void setPatientCallerAdminMaps(
			Set<PatientCallerAdminMap> patientCallerAdminMaps) {
		this.patientCallerAdminMaps = patientCallerAdminMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<PatientLawyerAdminMap> getPatientLawyerAdminMaps() {
		return this.patientLawyerAdminMaps;
	}

	public void setPatientLawyerAdminMaps(
			Set<PatientLawyerAdminMap> patientLawyerAdminMaps) {
		this.patientLawyerAdminMaps = patientLawyerAdminMaps;
	}

}