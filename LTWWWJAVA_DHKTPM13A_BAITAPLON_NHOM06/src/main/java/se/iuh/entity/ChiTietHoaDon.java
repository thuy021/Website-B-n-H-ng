package se.iuh.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ChiTietHoaDon")
public class ChiTietHoaDon implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "maHD")
	private HoaDon hd;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maSP")
	private SanPham sp;
	private int soLuong;
	public ChiTietHoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon getHd() {
		return hd;
	}
	public void setHd(HoaDon hd) {
		this.hd = hd;
	}
	public SanPham getSp() {
		return sp;
	}
	public void setSp(SanPham sp) {
		this.sp = sp;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	
}
