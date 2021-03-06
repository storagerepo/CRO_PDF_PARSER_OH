package com.deemsys.project.entity;

// Generated 19 Aug, 2017 10:03:05 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PatientLawyerAdminMapId generated by hbm2java
 */
@Embeddable
public class PatientLawyerAdminMapId implements java.io.Serializable {

	private String patientId;
	private int lawyerAdminId;

	public PatientLawyerAdminMapId() {
	}

	public PatientLawyerAdminMapId(String patientId, int lawyerAdminId) {
		this.patientId = patientId;
		this.lawyerAdminId = lawyerAdminId;
	}

	@Column(name = "patient_id", nullable = false, length = 32)
	public String getPatientId() {
		return this.patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	@Column(name = "lawyer_admin_id", nullable = false)
	public int getLawyerAdminId() {
		return this.lawyerAdminId;
	}

	public void setLawyerAdminId(int lawyerAdminId) {
		this.lawyerAdminId = lawyerAdminId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PatientLawyerAdminMapId))
			return false;
		PatientLawyerAdminMapId castOther = (PatientLawyerAdminMapId) other;

		return ((this.getPatientId() == castOther.getPatientId()) || (this
				.getPatientId() != null && castOther.getPatientId() != null && this
				.getPatientId().equals(castOther.getPatientId())))
				&& (this.getLawyerAdminId() == castOther.getLawyerAdminId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPatientId() == null ? 0 : this.getPatientId().hashCode());
		result = 37 * result + this.getLawyerAdminId();
		return result;
	}

}
