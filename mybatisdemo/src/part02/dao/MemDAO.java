package part02.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import part02.dto.MemDTO;

public class MemDAO {
	private SqlSession session;
	
	public MemDAO() {
		//1. 트랜잭션이 설정되어 있는 파일의 경로를 정의한다.
		String resource = "part02/config/configuration.xml";
		
		try {
			
			//2. 설정파일을 로딩하기 위해서 입력스트림과 연결한다.
			Reader reader = Resources.getResourceAsReader(resource);
			
			//3.설정파일을 저장하기 위한 팩토리를 생성해 줄 수 있는 빌더를 생성한다.
			SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();
			
			//4. 설정파일의 정보를 읽어와서 sqlBuilder에 생성한다.
			SqlSessionFactory factory = sqlBuilder.build(reader);
			
			//5. 쿼리문을 접근할 수 있도록 sqlSession 객체를 리턴한다.
			// openSession()의 기본은 false이다.
			// 자동 커밋을 설정하고 싶으면 openSession(true)로 설정한다.
			//실무에서는 자동커밋을 사용하지 않는다.
			session = factory.openSession(true);// 자동커밋이 해제된 상태
			
			//6.입력스트림 연결 종료한다.(다 읽어왔으므로)
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//end employeesDAO
	
	public int cntMethod() {
		return session.selectOne("mem.cnt");
	}
	
	public List<MemDTO> allMethod() {
		return session.selectList("mem.all");
	}
	
	public int insertMethod(MemDTO dto) {
		return session.insert("mem.ins", dto);
	}
	
	public int updateMethod(HashMap<String, Object> map) {
		//System.out.println(map.get("name"));
		return session.update("mem.upt", map);
	}
	
	public int deleteMethod(int num) {
		return session.delete("mem.del", num);
	}
	
	public int multiInsertMethod(List<MemDTO> list) {
		return session.insert("mem.multiIns", list);
	}
	
	public int multiDeleteMethod(int[] numArr) {
		return session.delete("mem.multiDel", numArr);
	}
	
	public List<MemDTO> searchMethod(MemDTO dto){
		return session.selectList("mem.search", dto);
	}
	
	public int multiUpdate(MemDTO dto) {
		return session.update("mem.multiUpdate", dto);
	}
	
	public int insDymicMethod(MemDTO dto) {
		return session.insert("mem.insData", dto);
	}

}//end class
