package javaee;

import org.junit.Test;

public class DAOPattern {

	// Data Access Object Pattern
	// : 데이터 베이스에 접근하는 클래스를 추상화하고 캡슐화하여 비즈니스 로직과 분리  
	// : DAO 클래스를 통해 데이터 베이스에 접근하여 데이터를 저장, 수정, 삭제하는 등 데이터를 관리
	
	// 1. DTO 또는 Entity 클래스
	// 2. DAO 인터페이스
	// 3. DAO 인터페이스를 구현한 클래스
	// 4. DAO 팩토리 클래스  
	
	
	
	class DTO {}
	
	interface DAO {
		public int insert(DTO dto);
		//public DTO select();
		//public List<DTO> selectList();
		//public int update(DTO dto);
		//public int delete();
	}
	
	class DAOOracleImpl implements DAO {

		@Override
		public int insert(DTO dto) {
			System.out.println("oracle insert");
			return 0;
		}
		
	}
	
	class DAOMySqlImpl implements DAO {

		@Override
		public int insert(DTO dto) {
			System.out.println("mysql insert");
			return 0;
		}
		
	}
	
	class DAOFactory {
		
		public DAO getDao(String db) throws DAOException {
			
			DAO dao = null;

			if(db.equalsIgnoreCase("oracle")) {
				dao = new DAOOracleImpl();
			} else if(db.equalsIgnoreCase("mysql")) {
				dao = new DAOMySqlImpl();
			} else {
				throw new DAOException();
			}
				
			return dao;
		}
	}
	
	@SuppressWarnings("serial")
	class DAOException extends Exception {
		
		String msg;
		
		DAOException(){
			super("DAOException");
		}
				
		DAOException(String msg){
			super(msg);
		}
		
	}
	
	@Test
	public void test() throws DAOException {
		
		final DAO dao = (DAO) new DAOFactory().getDao("oracle");
		
		dao.insert(null);
		
	}
	
}