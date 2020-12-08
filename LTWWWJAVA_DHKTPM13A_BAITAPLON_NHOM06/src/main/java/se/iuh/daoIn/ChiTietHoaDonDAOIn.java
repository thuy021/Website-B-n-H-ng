package se.iuh.daoIn;

import java.util.List;

import se.iuh.entity.ChiTietHoaDon;

public interface ChiTietHoaDonDAOIn {
	public List<ChiTietHoaDon> getAllCTHD();
	public List<ChiTietHoaDon> getAllCTHDByMaSP(String maSP);
	public boolean  insertCTHD(ChiTietHoaDon cthd);

}
