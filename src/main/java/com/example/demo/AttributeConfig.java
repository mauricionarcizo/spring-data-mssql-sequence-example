package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATTRIBUTE_CONFIG")
public class AttributeConfig {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attribute_seq")
	@Column(name = "ATTRIBUTE_CONFIG_ID")
	private Long id;

	@Column(name = "TABLE_NAME")
	private String tableName;

	@Column(name = "PREFIX")
	private String prefix;

	@Column(name = "PREFIX_INDEX")
	private Long prefixIndex = 0l;

	@Column(name = "UPDATE_ALL_COMPOSITIONS")
	private boolean updateAllCompositions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Long getPrefixIndex() {
		return prefixIndex;
	}

	public void setPrefixIndex(Long prefixIndex) {
		this.prefixIndex = prefixIndex;
	}

	public boolean isUpdateAllCompositions() {
		return updateAllCompositions;
	}

	public void setUpdateAllCompositions(boolean updateAllCompositions) {
		this.updateAllCompositions = updateAllCompositions;
	}
}
