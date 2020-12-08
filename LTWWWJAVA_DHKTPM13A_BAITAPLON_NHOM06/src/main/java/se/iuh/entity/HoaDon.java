package se.iuh.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HoaDon")
public class HoaDon implements Serializable{
	@Id
	private String maHD;
	private double tongTien;
	private Date ngayTT;
	@ManyToOne
	@JoinColumn(name = "maTK")
	private TaiKhoan tk;
	@OneToMany(mappedBy = "hd")
	private List<ChiTietHoaDon> cthd;
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public Date getNgayTT() {
		return ngayTT;
	}
	public void setNgayTT(Date ngayTT) {
		this.ngayTT = ngayTT;
	}
	public TaiKhoan getTk() {
		return tk;
	}
	public void setTk(TaiKhoan tk) {
		this.tk = tk;
	}
	public List<ChiTietHoaDon> getCthd() {
		return cthd;
	}
	public void setCthd(List<ChiTietHoaDon> cthd) {
		this.cthd = cthd;
	}
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
