package se.iuh.daoIn;

import java.util.List;

import se.iuh.entity.HoaDon;

public interface HoaDonDAOIn {
	public List<HoaDon> getAllHD();
	public List<HoaDon> getAllHDByTK(String maTK);
	public List<HoaDon> getHDByTK(String maTK);
	public boolean insertHD(HoaDon hd);

}
