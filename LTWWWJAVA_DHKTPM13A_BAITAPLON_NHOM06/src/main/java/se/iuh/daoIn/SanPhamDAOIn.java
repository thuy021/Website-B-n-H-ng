package se.iuh.daoIn;

import java.util.List;

import se.iuh.entity.SanPham;

public interface SanPhamDAOIn {
	public List<SanPham> getAllSP();
	public List<SanPham> getAllSPByLoai(String loaiSP);
	public List<SanPham> timKiemSP(String tim);
	public SanPham getSPByID(String maSP);
	public boolean insertSP(SanPham sp);
	public boolean updateSP(SanPham sp);
	public boolean updateSL(String maSP,int sl);
	public boolean deleteSP(String maSP);
	public List<SanPham> getAllSPLonHon0();
}
