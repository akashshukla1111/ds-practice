package com.collection.practicejava;

//singleton class with the use of static block 

class MyStaticSing {

	private static MyStaticSing mys;

	private MyStaticSing() {
	}

	static {
		mys = new MyStaticSing();
	}

	public static MyStaticSing getInstance() {
		return mys;
	}
	public void call(){
		System.out.println("ganesh");
	}

}

//or we can make it like that

class MySingLzay {

	// making static beacuse it uses memory only once;
	private static MySingLzay mysig = null;

	// using private so that we can only make the object its own class not from
	// outside
	private MySingLzay() {
	}

	// making method static because we can not make the object of that class
	// from outside
	public static MySingLzay getInstance() {
		if (mysig == null) {
			mysig = new MySingLzay();
		}
		return mysig;
	}

}

// code for singleton using initialization at begining
public class MySigtn {

	private static MySigtn mys = new MySigtn();

	private MySigtn() {
	}

	public static MySigtn getInstance() {
		return mys;
	}


}


