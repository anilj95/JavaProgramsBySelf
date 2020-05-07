package DesignPattern;

public class SingletonDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Thread safety is guarantee by JVM. because instance is static.
//It will be initialized during class loading only.

class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
	};

	public static EagerSingleton getInstance() {

		return instance;
	}

}

//Not Thread safe.Two different thread can create two object.Or race round condition can occur.

class LazySingleton {

	private static LazySingleton instance;

	private LazySingleton() {
	};

	public static LazySingleton getInstance() {

		if (instance == null) {

			instance = new LazySingleton();
		}

		return instance;
	}

}

//Thread safe singleton method. Whole method is Synchronized.
//For read operation also only 1 thread is allowed.

class SynchronizedMethodSingleton {

	private static SynchronizedMethodSingleton instance;

	private SynchronizedMethodSingleton() {
	};

	public static synchronized SynchronizedMethodSingleton getInstance() {

		if (instance == null) {

			instance = new SynchronizedMethodSingleton();
		}

		return instance;
	}

}

// Block is synchronized, only one thread is allowed to create instance of the class(write operation) if instance is null.
// otherwise many threads can access for read operation. Below arrangement is called Doubled check Locking.
//Problem: Suppose Thread T1 initialized instance, still Thread T2,T3,T4....threads will enter into synchronized block
//& check if instance is null. Which will slow down our Application. See Variation of below code.

class SynchronizedBlockSingleton {

	private static SynchronizedBlockSingleton instance;

	private SynchronizedBlockSingleton() {
	};

	public static SynchronizedBlockSingleton getInstance() {

		synchronized (SynchronizedBlockSingleton.class) {

			if (instance == null) {

				instance = new SynchronizedBlockSingleton();
			}
		}

		return instance;
	}

}

//Added one more null check so that every thread will not Acquired expensive lock & enter into synchronized block 
//& check for null instance. It will make application faster. We got Lazy initialization,thread safety,speed.

//Problem: This approach is also having some problem because of Java memory model. See Line A in below code.
//3 task are being performed in line A. 1. construct empty resource: instance 2. assign to instance: instance =
//3. calling constructor : instance = new SynchronizedBlockSingleton2();
//As per java memory model semantics it may not occur in same order i.e JVM is allowed to reorder these instructions.
//It could happen that, it could construct the empty object & assign to variable instance, in this case, instance is 
// not null, but empty object. Now when Thread 2 will come it will check if(instance==null) & it is not null as it
//has been assign to an empty object. & it will start using empty object.

class SynchronizedBlockSingleton2 {

	private static SynchronizedBlockSingleton2 instance;

	private SynchronizedBlockSingleton2() {
	};

	public static SynchronizedBlockSingleton2 getInstance() {

		if (instance == null) { // added one more null check.

			synchronized (SynchronizedBlockSingleton.class) {

				if (instance == null) {

					instance = new SynchronizedBlockSingleton2(); // Line A
				}
			}
		}

		return instance;
	}

}

//Solution: Use volatile keyword before declaring instance, it will not allow JVM to reorder the code or instructions.

class SynchronizedBlockSingleton3 {
	// added volatile keyword
	private static volatile SynchronizedBlockSingleton3 instance;

	private SynchronizedBlockSingleton3() {
	};

	public static SynchronizedBlockSingleton3 getInstance() {

		if (instance == null) {

			synchronized (SynchronizedBlockSingleton3.class) {

				if (instance == null) {

					instance = new SynchronizedBlockSingleton3();
				}
			}
		}

		return instance;
	}

}

//Simple & clean way: using Holder pattern.

class SinlgetonHolder {

	// private class. It will create only when it will be called first time.(Lazy
	// loading achieved)
	private static class Holder {

		// final keyword is used, JVM will guarantee for Thread safety.
		static final SinlgetonHolder INSTANCE = new SinlgetonHolder();
	}

// public method to get instance
	public static SinlgetonHolder getInstance() {

		return Holder.INSTANCE;
	}

//private constructor to prevent new instance creation, out of this class.
	private SinlgetonHolder() {
	};

}

// using enum to create singleton pattern. enum is the pack of constants.
enum SingletonEnum {

	INSTANCE;

	private SingletonEnum() {
	};

}
