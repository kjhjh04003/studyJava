package chap06;

// 教臂沛
public class Singleton {

	// 沥利鞘靛
	private static Singleton singleton = new Singleton();

	// 积己磊
	private Singleton() {
	}

	static Singleton getInstance() {
		return singleton;
	}

}
