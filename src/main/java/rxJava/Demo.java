package rxJava;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-10-22 18:41
 */
public class Demo {

    public static void main(String[] args) {
        dodo();
    }

    public static void dodo() {
        //事件源
        Observable<String> stringObservable = Observable.create(new Observable.OnSubscribe<String>(){
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("aaa");
                subscriber.onNext("aaa2");
                subscriber.onNext("aaa3");
                System.out.println(1/0);
                subscriber.onCompleted();
            }
        });



        //订阅者
        Observer<String>observer = new Observer<String>() {
            public void onCompleted() {

            }

            public void onError(Throwable e) {

            }

            public void onNext(String s) {

            }
        };

        Action0 comAc = new Action0() {
            public void call() {
                System.out.println("complete action");
            }
        };

        Action1<String> nextAc = new Action1<String>() {
            public void call(String s) {
                System.out.println("neext action");
            }
        };

        Action1<Throwable> errAc = new Action1<Throwable>() {
            public void call(Throwable throwable) {
                System.out.println("err  action");
            }
        };


        //subscriber是observer的实现，通常用它
        Subscriber<String> subscriber = new Subscriber<String>() {
            public void onCompleted() {
                System.out.println("finished");
            }

            public void onError(Throwable e) {
                System.out.println("error");
            }

            public void onNext(String s) {
                System.out.println(s);
            }
        };

        //发布事件
        Subscription subscribe = stringObservable.subscribe(subscriber);
    }
}
