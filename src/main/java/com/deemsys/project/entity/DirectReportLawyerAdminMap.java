package com.deemsys.project.entity;

// Generated 19 Aug, 2017 10:03:05 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DirectReportLawyerAdminMap generated by hbm2java
 */
@Entity
@Table(name = "direct_report_lawyer_admin_map", catalog = "injuryreportsdb")
public class DirectReportLawyerAdminMap implements java.io.Serializable {

	private DirectReportLawyerAdminMapId id;
	private Lawyer lawyer;
	private CrashReport crashReport;
	private LawyerAdmin lawyerAdmin;
	private String notes;
	private Integer isArchived;
	private Date archivedDate;
	private String archivedDateTime;
	private Integer status;

	public DirectReportLawyerAdminMap() {
	}

	public DirectReportLawyerAdminMap(DirectReportLawyerAdminMapId id,
			CrashReport crashReport, LawyerAdmin lawyerAdmin) {
		this.id = id;
		this.crashReport = crashReport;
		this.lawyerAdmin = lawyerAdmin;
	}

	public DirectReportLawyerAdminMap(DirectReportLawyerAdminMapId id,
			Lawyer lawyer, CrashReport crashReport, LawyerAdmin lawyerAdmin,
			String notes, Integer isArchived, Date archivedDate,
			String archivedDateTime, Integer status) {
		this.id = id;
		this.lawyer = lawyer;
		this.crashReport = crashReport;
		this.lawyerAdmin = lawyerAdmin;
		this.notes = notes;
		this.isArchived = isArchived;
		this.archivedDate = archivedDate;
		this.archivedDateTime = archivedDateTime;
		this.status = status;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "crashId", column = @Column(name = "crash_id", nullable = false, length = 45)),
			@AttributeOverride(name = "lawyerAdminId", column = @Column(name = "lawyer_admin_id", nullable = false)) })
	public DirectReportLawyerAdminMapId getId() {
		return this.id;
	}

	public void setId(DirectReportLawyerAdminMapId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lawyer_id")
	public Lawyer getLawyer() {
		return this.lawyer;
	}

	public void setLawyer(Lawyer lawyer) {
		this.lawyer = lawyer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "crash_id", nullable = false, insertable = false, updatable = false)
	public CrashReport getCrashReport() {
		return this.crashReport;
	}

	public void setCrashReport(CrashReport crashReport) {
		this.crashReport = crashReport;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lawyer_admin_id", nullable = false, insertable = false, updatable = false)
	public LawyerAdmin getLawyerAdmin() {
		return this.lawyerAdmin;
	}

	public void setLawyerAdmin(LawyerAdmin lawyerAdmin) {
		this.lawyerAdmin = lawyerAdmin;
	}

	@Column(name = "notes", length = 400)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "is_archived")
	public Integer getIsArchived() {
		return this.isArchived;
	}

	public void setIsArchived(Integer isArchived) {
		this.isArchived = isArchived;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "archived_date", length = 10)
	public Date getArchivedDate() {
		return this.archivedDate;
	}

	public void setArchivedDate(Date archivedDate) {
		this.archivedDate = archivedDate;
	}

	@Column(name = "archived_date_time", length = 45)
	public String getArchivedDateTime() {
		return this.archivedDateTime;
	}

	public void setArchivedDateTime(String archivedDateTime) {
		this.archivedDateTime = archivedDateTime;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}