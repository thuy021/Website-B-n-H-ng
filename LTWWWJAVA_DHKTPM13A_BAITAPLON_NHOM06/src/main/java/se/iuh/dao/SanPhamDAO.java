package se.iuh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import se.iuh.daoIn.SanPhamDAOIn;
import se.iuh.entity.SanPham;

@Repository
public class SanPhamDAO implements SanPhamDAOIn{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SanPham> getAllSP() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<SanPham> personsList = session.createQuery("from SanPham").list();
		return personsList;

	}

	@Override
	public List<SanPham> getAllSPByLoai(String loaiSP) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		//String sql = "from SanPham where loaiSP =" + loaiSP;
		String sql = "select * from SanPham where loaiSP='\"+loaiSP+\"' and soLuongTon > 0";
		List<SanPham> listSanPham = session.createQuery(sql, SanPham.class).list();
		return listSanPham;
	}

	@Override
	public List<SanPham> timKiemSP(String tim) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String sql = "select * from SanPham where tenSP like N'%\"+tim+\"%'";
		List<SanPham> listSanPham = session.createQuery(sql, SanPham.class).list();
		return listSanPham;
	}

	@Override
	public SanPham getSPByID(String maSP) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		SanPham sp = (SanPham) session.load(SanPham.class, new Integer(maSP));
		return sp;
	}

	@Override
	public boolean insertSP(SanPham sp) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(sp);
		return true;
	}

	@Override
	public boolean updateSP(SanPham sp) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(sp);

		return true;
	}

	@Override
	public boolean updateSL(String maSP, int sl) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String sql =  "Update SanPham set soLuongTon=\"+sl+\" where maSP='\"+maSP+\"'";
		session.update(sql);
		return true;
	}

	@Override
	public boolean deleteSP(String maSP) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		SanPham p = (SanPham) session.load(SanPham.class, new Integer(maSP));
		if (null != p) {
			session.delete(p);
		}
		return true;
	}

	@Override
	public List<SanPham> getAllSPLonHon0() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		String sql = "select * from SanPham where soLuongTon > 0";
		List<SanPham> listSanPham = session.createQuery(sql, SanPham.class).list();
		return listSanPham;
		
	}
	

}
