package model;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class testDAO {
	@Autowired 
	SqlSessionFactory factory;
	
	public boolean join(Map map) {
		SqlSession session = factory.openSession();
		System.out.println(map);
		try {
			session.insert("test.join",map);
			session.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			return false;
		}finally {
			session.close();
		}
	}
}
