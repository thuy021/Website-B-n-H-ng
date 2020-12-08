package se.iuh.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import se.iuh.daoIn.GioHangDAOIn;
import se.iuh.entity.GioHang;
import se.iuh.entity.SanPham;

@Repository
public class GioHangDAO implements GioHangDAOIn {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int getSLLoaiSPMua() {
		// TODO Auto-generated method stub
		ArrayList<GioHang> allCardItems = new ArrayList<GioHang>();
		return allCardItems.size();
	}

	@Override
	public void deleteCardItem(String vitrixoa) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		GioHang p = (GioHang) session.load(GioHang.class, new Integer(vitrixoa));
		if (null != p) {
			session.delete(p);
		}

	}

	@Override
	public void updateCardItem(String vitri, String soluongmua) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
	//	session.update(p);

	}

	@Override
	public GioHang getCardItem(int itemIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCardItemByMaSP(String maSP) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<GioHang> getAllCardItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCardItems(ArrayList<GioHang> allCardItems) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getTongTienHD() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTongTienHD(double tongTienHD) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCardItem(String maSP, String tenSP, String gia, String soluong, String hinhAnh, String slton) {
		// TODO Auto-generated method stub

	}

}
