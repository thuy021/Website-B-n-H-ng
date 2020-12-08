package se.iuh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import se.iuh.daoIn.ChiTietHoaDonDAOIn;
import se.iuh.entity.ChiTietHoaDon;
import se.iuh.entity.HoaDon;
import se.iuh.entity.SanPham;

@Repository
public class ChiTietHoaDonDAO implements ChiTietHoaDonDAOIn{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ChiTietHoaDon> getAllCTHD() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<ChiTietHoaDon> cthdList = session.createQuery("from ChiTietHoaDon").list();
		return cthdList;
	}

	@Override
	public List<ChiTietHoaDon> getAllCTHDByMaSP(String maSP) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String sql = "select * from ChiTietHoaDon where maSP='\"+maSP+\"'";
		List<ChiTietHoaDon> listCTHD = session.createQuery(sql, ChiTietHoaDon.class).list();
		return listCTHD;
	}

	@Override
	public boolean insertCTHD(ChiTietHoaDon cthd) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(cthd);
		return true;
	}
	
	
}
