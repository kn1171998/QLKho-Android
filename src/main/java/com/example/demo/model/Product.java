package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SALE_SAN_PHAM")
public class Product {
	public Product() {}
	String ID_SAN_PHAM;
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String getID_SAN_PHAM() {
		return ID_SAN_PHAM;
	}
	public void setID_SAN_PHAM(String iD_SAN_PHAM) {
		ID_SAN_PHAM = iD_SAN_PHAM;
	}
	public String getMA_SAN_PHAM() {
		return MA_SAN_PHAM;
	}
	public void setMA_SAN_PHAM(String mA_SAN_PHAM) {
		MA_SAN_PHAM = mA_SAN_PHAM;
	}
	public String getTEN_SAN_PHAM() {
		return TEN_SAN_PHAM;
	}
	public void setTEN_SAN_PHAM(String tEN_SAN_PHAM) {
		TEN_SAN_PHAM = tEN_SAN_PHAM;
	}
	public String getKICH_THUOC() {
		return KICH_THUOC;
	}
	public void setKICH_THUOC(String kICH_THUOC) {
		KICH_THUOC = kICH_THUOC;
	}
	public String getMAU_SAC() {
		return MAU_SAC;
	}
	public void setMAU_SAC(String mAU_SAC) {
		MAU_SAC = mAU_SAC;
	}
	public String getMA_VACH() {
		return MA_VACH;
	}
	public void setMA_VACH(String mA_VACH) {
		MA_VACH = mA_VACH;
	}
	String MA_SAN_PHAM;
	String TEN_SAN_PHAM;
	String KICH_THUOC;
	String MAU_SAC;
	String MA_VACH;
}
