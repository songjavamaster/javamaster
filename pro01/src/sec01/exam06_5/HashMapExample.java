package sec01.exam06_5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//* = All
public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String,Integer>map = new HashMap<String,Integer>();
		
		//객체 저장
		map.put("신용권", 85); //(k,v)
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수:"+map.size());
		
		//객체 찾기
		System.out.println("\t홍길동:"+map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String>keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}//key 객체는  맨 마지막걸 덮어 쓰는 
		System.out.println();
		
		//객체 삭제=[remove]
		map.remove("홍길동");
		System.out.println("총Entry 수:"+map.size());

	}

}
