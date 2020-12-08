package se.iuh.daoIn;

import java.util.List;

import se.iuh.entity.TaiKhoan;

public interface TaiKhoanDAOIn {
	public List<TaiKhoan> getAllTK();
	public List<TaiKhoan> getAllTKKH();
	public List<TaiKhoan> ktDangNhap(String email,String pass );
	public boolean insertTK(TaiKhoan tk);
	public boolean updateTK(TaiKhoan tk);
	
}
