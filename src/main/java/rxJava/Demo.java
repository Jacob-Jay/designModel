package rxJava;


import rx.Observable;
import rx.Subscriber;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-10-22 18:41
 */
public class Demo {

    public static void main(String[] args) {

    }

    public static void dodo() {
        //事件源
        Observable<String> stringObservable = Observable.create(new Observable.OnSubscribe<String>(){
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("aaa");
                subscriber.onNext("aaa2");
                subscriber.onNext("aaa3");
                subscriber.onCompleted();
            }
        });

        //订阅者


    }
}
