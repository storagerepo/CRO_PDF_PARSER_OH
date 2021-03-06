package com.deemsys.project.entity;

// Generated 19 Aug, 2017 10:03:05 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ClinicTimingsId generated by hbm2java
 */
@Embeddable
public class ClinicTimingsId implements java.io.Serializable {

	private int clinicId;
	private int day;

	public ClinicTimingsId() {
	}

	public ClinicTimingsId(int clinicId, int day) {
		this.clinicId = clinicId;
		this.day = day;
	}

	@Column(name = "clinic_id", nullable = false)
	public int getClinicId() {
		return this.clinicId;
	}

	public void setClinicId(int clinicId) {
		this.clinicId = clinicId;
	}

	@Column(name = "day", nullable = false)
	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClinicTimingsId))
			return false;
		ClinicTimingsId castOther = (ClinicTimingsId) other;

		return (this.getClinicId() == castOther.getClinicId())
				&& (this.getDay() == castOther.getDay());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getClinicId();
		result = 37 * result + this.getDay();
		return result;
	}

}
