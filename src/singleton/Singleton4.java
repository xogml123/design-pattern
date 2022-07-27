package singleton;

public class Singleton4 {
    //항상 메인메모리에서 값을 저장하고 가져옴.
    private volatile static Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class){
                instance = new Singleton4();
            }
        }
        return instance;
    }
}
