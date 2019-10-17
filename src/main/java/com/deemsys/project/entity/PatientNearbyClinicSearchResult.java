package com.deemsys.project.entity;

// Generated 21 Nov, 2017 4:13:25 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PatientNearbyClinicSearchResult generated by hbm2java
 */
@Entity
@Table(name = "patient_nearby_clinic_search_result", catalog = "injuryreportsdb")
public class PatientNearbyClinicSearchResult implements java.io.Serializable {

	private PatientNearbyClinicSearchResultId id;
	private BigDecimal distance;
	private String travellingTime;
	private Date updatedDateTime;
	private Integer status;

	public PatientNearbyClinicSearchResult() {
	}

	public PatientNearbyClinicSearchResult(PatientNearbyClinicSearchResultId id) {
		this.id = id;
	}

	public PatientNearbyClinicSearchResult(
			PatientNearbyClinicSearchResultId id, BigDecimal distance,
			String travellingTime, Date updatedDateTime, Integer status) {
		this.id = id;
		this.distance = distance;
		this.travellingTime = travellingTime;
		this.updatedDateTime = updatedDateTime;
		this.status = status;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "originLongitude", column = @Column(name = "origin_longitude", nullable = false, precision = 16, scale = 11)),
			@AttributeOverride(name = "originLatitude", column = @Column(name = "origin_latitude", nullable = false, precision = 16, scale = 11)),
			@AttributeOverride(name = "destinationLatitude", column = @Column(name = "destination_latitude", nullable = false, precision = 16, scale = 11)),
			@AttributeOverride(name = "destinationLongitude", column = @Column(name = "destination_longitude", nullable = false, precision = 16, scale = 11)) })
	public PatientNearbyClinicSearchResultId getId() {
		return this.id;
	}

	public void setId(PatientNearbyClinicSearchResultId id) {
		this.id = id;
	}

	@Column(name = "distance", precision = 10, scale = 5)
	public BigDecimal getDistance() {
		return this.distance;
	}

	public void setDistance(BigDecimal distance) {
		this.distance = distance;
	}

	@Column(name = "travelling_time", length = 20)
	public String getTravellingTime() {
		return this.travellingTime;
	}

	public void setTravellingTime(String travellingTime) {
		this.travellingTime = travellingTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date_time", length = 19)
	public Date getUpdatedDateTime() {
		return this.updatedDateTime;
	}

	public void setUpdatedDateTime(Date updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}