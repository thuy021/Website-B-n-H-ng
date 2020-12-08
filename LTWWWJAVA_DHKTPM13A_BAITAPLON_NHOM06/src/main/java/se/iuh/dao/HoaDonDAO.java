package se.iuh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import se.iuh.daoIn.HoaDonDAOIn;
import se.iuh.entity.HoaDon;
import se.iuh.entity.SanPham;

@Repository
public class HoaDonDAO implements HoaDonDAOIn{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<HoaDon> getAllHD() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<HoaDon> hoadonsList = session.createQuery("from HoaDon").list();
		return hoadonsList;
	}

	@Override
	public List<HoaDon> getAllHDByTK(String maTK) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String sql = "select * from HoaDon where maTK='\"+maTK+\"'";
		List<HoaDon> listHoaDon = session.createQuery(sql, HoaDon.class).list();
		return listHoaDon;
	}

	@Override
	public List<HoaDon> getHDByTK(String maTK) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String sql = "select * from SanPham where maTK='\"+maTK+\"'";
		List<HoaDon> listHoaDon = session.createQuery(sql, HoaDon.class).list();
		return listHoaDon;
	}

	@Override
	public boolean insertHD(HoaDon hd) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(hd);
		return true;
	}

}
