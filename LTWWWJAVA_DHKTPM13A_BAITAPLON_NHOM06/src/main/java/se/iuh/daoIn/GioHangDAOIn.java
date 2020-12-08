package se.iuh.daoIn;

import java.util.ArrayList;

import se.iuh.entity.GioHang;

public interface GioHangDAOIn {
	public int getSLLoaiSPMua();
	public void deleteCardItem(String vitrixoa);
	public void updateCardItem(String vitri,String soluongmua);
	public GioHang getCardItem(int itemIndex);
	public int getCardItemByMaSP(String maSP);
	public ArrayList<GioHang> getAllCardItem();
	public void setCardItems(ArrayList<GioHang> allCardItems);
	public double getTongTienHD();
	public void setTongTienHD(double tongTienHD);
//	protected void tinhTongTienHD();
	public void addCardItem(String maSP,String tenSP,String gia,String soluong,String hinhAnh,String slton);
	
	
}
