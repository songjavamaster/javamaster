package sec01.exam05_5;

import java.util.*;

public class HashExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		
		System.out.println("총 객체수:"+set.size());
		

	}

}
