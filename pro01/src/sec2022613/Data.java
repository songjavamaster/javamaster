package sec2022613;

public class Data<T> { //클래스명 옆에 제네릭 기호<>를 적고 그 안에 매개변수 기술함.
	T obj;
	Data(T ob){
		obj = ob;
	}
	T getObj() {
		return obj;
	}
	void showType() {
		System.out.println("Type of T:"+obj.getClass().getName());
	}
	
}

