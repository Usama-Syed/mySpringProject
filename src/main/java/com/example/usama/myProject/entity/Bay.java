package com.example.usama.myProject.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_BAY")
public class Bay {

	/** The bay id. */
	@Id
	@Column(name = "BAY_ID")
	private long bayId;
	
	/** The bay cod. */
	@Column(name = "BAY_COD")
	private String bayCod;

	/** The bay desc. */
	@Column(name = "BAY_DESC")
	private String bayDesc;

	/** The bay seq. */
	@Column(name = "BAY_SEQ")
	private Long baySeq;

	/** The change dat. */
	@Column(name = "CHANGE_DAT")
	private Date changeDat;

	/** The changeset action. */
	@Column(name = "CHANGESET_ACTION", length = 1, columnDefinition = "CHAR")
	private String changesetAction;

	/** The changeset id. */
	@Column(name = "CHANGESET_ID")
	private BigDecimal changesetId;

	/** The data region id. */
	@Column(name = "DATA_REGION_ID")
	private Long dataRegionId;

	/** The is cs. */
	@Column(name = "IS_CS", columnDefinition = "CHAR")
	private String isCs;

	/** The legacy cod. */
	@Column(name = "LEGACY_COD")
	private String legacyCod;

	/** The legacy node type. */
	@Column(name = "LEGACY_NODE_TYPE", length = 1, columnDefinition = "CHAR")
	private String legacyNodeType;

	/** The network type. */
	@Column(name = "NETWORK_TYPE", columnDefinition = "CHAR")
	private String networkType;

	/** The voltage type. */
	@Column(name = "VOLTAGE_TYPE", columnDefinition = "CHAR")
	private String voltageType;

	/** The voltage level id. */
	@Column(name = "VOLTAGE_LEVEL_ID")
	private Long voltageLevelId;

	/** The org id. */
	@Column(name = "ORG_ID")
	private Long orgId;

	/** The ownership id. */
	@Column(name = "OWNERSHIP_ID")
	private Long ownershipId;

	/** The schema cod. */
	@Column(name = "SCHEMA_COD")
	private String schemaCod;

	/** The status id. */
	@Column(name = "STATUS_ID")
	private long statusId;

	/** The tc cod. */
	@Column(name = "TC_COD")
	private String tcCod;

	/** The terr id. */
	@Column(name = "TERR_ID")
	private Long terrId;

	/** The third party id. */
	@Column(name = "THIRD_PARTY_ID")
	private Long thirdPartyId;

	/**
	 * Gets the bay id.
	 *
	 * @return the bay id
	 */
	public long getBayId() {
		return bayId;
	}

	/**
	 * Sets the bay id.
	 *
	 * @param bayId the new bay id
	 */
	public void setBayId(long bayId) {
		this.bayId = bayId;
	}

	/**
	 * Gets the bay cod.
	 *
	 * @return the bay cod
	 */
	public String getBayCod() {
		return bayCod;
	}

	/**
	 * Sets the bay cod.
	 *
	 * @param bayCod the new bay cod
	 */
	public void setBayCod(String bayCod) {
		this.bayCod = bayCod;
	}

	/**
	 * Gets the bay desc.
	 *
	 * @return the bay desc
	 */
	public String getBayDesc() {
		return bayDesc;
	}

	/**
	 * Sets the bay desc.
	 *
	 * @param bayDesc the new bay desc
	 */
	public void setBayDesc(String bayDesc) {
		this.bayDesc = bayDesc;
	}

	/**
	 * Gets the bay seq.
	 *
	 * @return the bay seq
	 */
	public Long getBaySeq() {
		return baySeq;
	}

	/**
	 * Sets the bay seq.
	 *
	 * @param baySeq the new bay seq
	 */
	public void setBaySeq(Long baySeq) {
		this.baySeq = baySeq;
	}

	/**
	 * Gets the change dat.
	 *
	 * @return the change dat
	 */
	public Date getChangeDat() {
		return changeDat;
	}

	/**
	 * Sets the change dat.
	 *
	 * @param changeDat the new change dat
	 */
	public void setChangeDat(Date changeDat) {
		this.changeDat = changeDat;
	}

	/**
	 * Gets the changeset action.
	 *
	 * @return the changeset action
	 */
	public String getChangesetAction() {
		return changesetAction;
	}

	/**
	 * Sets the changeset action.
	 *
	 * @param changesetAction the new changeset action
	 */
	public void setChangesetAction(String changesetAction) {
		this.changesetAction = changesetAction;
	}

	/**
	 * Gets the changeset id.
	 *
	 * @return the changeset id
	 */
	public BigDecimal getChangesetId() {
		return changesetId;
	}

	/**
	 * Sets the changeset id.
	 *
	 * @param changesetId the new changeset id
	 */
	public void setChangesetId(BigDecimal changesetId) {
		this.changesetId = changesetId;
	}

	/**
	 * Gets the data region id.
	 *
	 * @return the data region id
	 */
	public Long getDataRegionId() {
		return dataRegionId;
	}

	/**
	 * Sets the data region id.
	 *
	 * @param dataRegionId the new data region id
	 */
	public void setDataRegionId(Long dataRegionId) {
		this.dataRegionId = dataRegionId;
	}

	/**
	 * Gets the checks if is cs.
	 *
	 * @return the checks if is cs
	 */
	public String getIsCs() {
		return isCs;
	}

	/**
	 * Sets the checks if is cs.
	 *
	 * @param isCs the new checks if is cs
	 */
	public void setIsCs(String isCs) {
		this.isCs = isCs;
	}

	/**
	 * Gets the legacy cod.
	 *
	 * @return the legacy cod
	 */
	public String getLegacyCod() {
		return legacyCod;
	}

	/**
	 * Sets the legacy cod.
	 *
	 * @param legacyCod the new legacy cod
	 */
	public void setLegacyCod(String legacyCod) {
		this.legacyCod = legacyCod;
	}

	/**
	 * Gets the legacy node type.
	 *
	 * @return the legacy node type
	 */
	public String getLegacyNodeType() {
		return legacyNodeType;
	}

	/**
	 * Sets the legacy node type.
	 *
	 * @param legacyNodeType the new legacy node type
	 */
	public void setLegacyNodeType(String legacyNodeType) {
		this.legacyNodeType = legacyNodeType;
	}

	/**
	 * Gets the network type.
	 *
	 * @return the network type
	 */
	public String getNetworkType() {
		return networkType;
	}

	/**
	 * Sets the network type.
	 *
	 * @param networkType the new network type
	 */
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	/**
	 * Gets the voltage type.
	 *
	 * @return the voltage type
	 */
	public String getVoltageType() {
		return voltageType;
	}

	/**
	 * Sets the voltage type.
	 *
	 * @param voltageType the new voltage type
	 */
	public void setVoltageType(String voltageType) {
		this.voltageType = voltageType;
	}

	/**
	 * Gets the voltage level id.
	 *
	 * @return the voltage level id
	 */
	public Long getVoltageLevelId() {
		return voltageLevelId;
	}

	/**
	 * Sets the voltage level id.
	 *
	 * @param voltageLevelId the new voltage level id
	 */
	public void setVoltageLevelId(Long voltageLevelId) {
		this.voltageLevelId = voltageLevelId;
	}

	/**
	 * Gets the org id.
	 *
	 * @return the org id
	 */
	public Long getOrgId() {
		return orgId;
	}

	/**
	 * Sets the org id.
	 *
	 * @param orgId the new org id
	 */
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	/**
	 * Gets the ownership id.
	 *
	 * @return the ownership id
	 */
	public Long getOwnershipId() {
		return ownershipId;
	}

	/**
	 * Sets the ownership id.
	 *
	 * @param ownershipId the new ownership id
	 */
	public void setOwnershipId(Long ownershipId) {
		this.ownershipId = ownershipId;
	}

	/**
	 * Gets the schema cod.
	 *
	 * @return the schema cod
	 */
	public String getSchemaCod() {
		return schemaCod;
	}

	/**
	 * Sets the schema cod.
	 *
	 * @param schemaCod the new schema cod
	 */
	public void setSchemaCod(String schemaCod) {
		this.schemaCod = schemaCod;
	}

	/**
	 * Gets the status id.
	 *
	 * @return the status id
	 */
	public long getStatusId() {
		return statusId;
	}

	/**
	 * Sets the status id.
	 *
	 * @param statusId the new status id
	 */
	public void setStatusId(long statusId) {
		this.statusId = statusId;
	}

	/**
	 * Gets the tc cod.
	 *
	 * @return the tc cod
	 */
	public String getTcCod() {
		return tcCod;
	}

	/**
	 * Sets the tc cod.
	 *
	 * @param tcCod the new tc cod
	 */
	public void setTcCod(String tcCod) {
		this.tcCod = tcCod;
	}

	/**
	 * Gets the terr id.
	 *
	 * @return the terr id
	 */
	public Long getTerrId() {
		return terrId;
	}

	/**
	 * Sets the terr id.
	 *
	 * @param terrId the new terr id
	 */
	public void setTerrId(Long terrId) {
		this.terrId = terrId;
	}

	/**
	 * Gets the third party id.
	 *
	 * @return the third party id
	 */
	public Long getThirdPartyId() {
		return thirdPartyId;
	}

	/**
	 * Sets the third party id.
	 *
	 * @param thirdPartyId the new third party id
	 */
	public void setThirdPartyId(Long thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}
	
}
