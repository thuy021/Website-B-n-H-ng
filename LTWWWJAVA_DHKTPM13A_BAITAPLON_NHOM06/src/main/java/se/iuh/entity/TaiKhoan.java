package se.iuh.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan implements Serializable{
	@Id
	@Column(name = "maTK")
	private String maTK;
	private String email;
	private String matKhau;
	private String ten;
	private String diaChi;
	private String sdt;
	private String loaiTK;
	public TaiKhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TaiKhoan(String maTK, String email, String matKhau, String ten, String diaChi, String sdt, String loaiTK) {
		super();
		this.maTK = maTK;
		this.email = email;
		this.matKhau = matKhau;
		this.ten = ten;
		this.diaChi = diaChi;
		this.sdt = sdt;
		this.loaiTK = loaiTK;
	}
	public String getMaTK() {
		return maTK;
	}
	public void setMaTK(String maTK) {
		this.maTK = maTK;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getLoaiTK() {
		return loaiTK;
	}
	public void setLoaiTK(String loaiTK) {
		this.loaiTK = loaiTK;
	}
	@Override
	public String toString() {
		return "TaiKhoan [maTK=" + maTK + ", email=" + email + ", matKhau=" + matKhau + ", ten=" + ten + ", diaChi="
				+ diaChi + ", sdt=" + sdt + ", loaiTK=" + loaiTK + "]";
	}
	
	
	
}
