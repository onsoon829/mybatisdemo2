package part02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import part02.dao.MemDAO;
import part02.dto.MemDTO;

public class MemTest {

	public static void main(String[] args) {
		MemDAO dao = new MemDAO();
		System.out.printf("Total Record:%d\n", dao.cntMethod());
		
//		dao.insertMethod(new MemDTO("김민재", 28, "경기"));
//		dao.insertMethod(new MemDTO("여진구", 32, " null"));
		
//		HashMap<String, Object> map = new HashMap<>();
//		map.put("name", "유대리");
//		map.put("age", 35);
//		map.put("loc", "제주");
//		map.put("num", 14);
//		dao.updateMethod(map);
		
//		dao.deleteMethod(5);
		
//		List<MemDTO> insertList = new ArrayList<>();
//		insertList.add(new MemDTO("java", 20, "toronto"));
//		insertList.add(new MemDTO("jsp", 15, "summary"));
//		int chk = dao.multiInsertMethod(insertList);
//		System.out.printf("Insert Record : %d\n", chk);
		
//		int chk = dao.multiDeleteMethod(new int[] {15, 16});
//		System.out.printf("Delete Record : %d\n", chk);
//		
//		List<MemDTO> aList = dao.allMethod();
//		display(aList);
		
		//List<MemDTO> aList = dao.searchMethod(new MemDTO());
		
//		dao.multiUpdate(new MemDTO(2, "손대기", 0, null));
//		dao.multiUpdate(new MemDTO(4, null, 40, null));
//		dao.multiUpdate(new MemDTO(2, "밤톨이", 35, "제주"));
		
//		dao.insDymicMethod(new MemDTO("똘똘이", 38, "전주"));
		dao.insDymicMethod(new MemDTO("이기상", 24, null));
				
		List<MemDTO> aList = null;
		aList = dao.searchMethod(new MemDTO());

//		aList = dao.searchMethod(new MemDTO("민재", 0, null));
//		aList = dao.searchMethod(new MemDTO(null, 30, null));
//		aList = dao.searchMethod(new MemDTO("민재", 30, null));// or 조건중 하나만 만족하면 된다.

		
		display(aList);

	}//end main
	
	public static void display(List<MemDTO> aList) {
		for(MemDTO dto: aList) {
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		}
	}//end display

}//end class
