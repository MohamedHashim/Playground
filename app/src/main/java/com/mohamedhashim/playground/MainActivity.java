package com.mohamedhashim.playground;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.AsyncSubject;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;

/**
 * Created by Mohamed Hashim on 6/15/2020.
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coldObservable();
//        connectableObeservable();
//        publishSubject();
//        behaviorSubject();
//        replaySubject();
//        asyncSubject();

        // upstream ==> observable ==> subscribeOn ==> doOnNext
        // downstream ==> observer ==> observeOn ==> subscribe
        Observable.just(1, 2, 3, 4, 5, 6)
                .subscribeOn(Schedulers.io())
                .doOnNext(n -> Log.d(TAG, ">>upstream: " + n + "  " + Thread.currentThread().getName()))
                .observeOn(Schedulers.computation())
                .subscribe(s -> Log.d(TAG, ">>downstreams: " + s + "  " + Thread.currentThread().getName()));

    }

    void sleep(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // it starts from beginning with every new subscribed item (provides data if and only if there are observers)
    void coldObservable() {
        Observable<Long> cold = Observable.intervalRange(0, 5, 0, 1, TimeUnit.SECONDS);
        cold.subscribe(i -> Log.d(TAG, "coldOberservable: student 1 = " + i));
        sleep(3000);
        cold.subscribe(i -> Log.d(TAG, "coldOberservable: student 2 = " + i));
        Log.d(TAG, "---------------------------------");
    }

    // (SAME) it's a hot observable which provides the stream just once and any subscribed item will continue with the flow (provides data even if there are no observers)
    void connectableObeservable() {
        ConnectableObservable<Long> connectableObservable = ConnectableObservable.intervalRange(0, 5, 0, 1, TimeUnit.SECONDS).publish();
        connectableObservable.connect();
        connectableObservable.subscribe(i -> Log.d(TAG, "connectableObeservable: student 1 = " + i));
        sleep(3000);
        connectableObservable.subscribe(i -> Log.d(TAG, "connectableObeservable: student 2 = " + i));
    }

    // (SAME) it's a hot observable which provides the stream just once and any subscribed item will continue with the flow
    void publishSubject() {
        PublishSubject<String> publishSubject = PublishSubject.create();
        publishSubject.subscribe(i -> Log.d(TAG, "publishSubject: student 1 = " + i));
        publishSubject.onNext("A");
        sleep(1000);
        publishSubject.onNext("B");
        sleep(1000);
        publishSubject.onNext("C");
        sleep(1000);
        publishSubject.onNext("D");
        sleep(1000);

        publishSubject.subscribe(i -> Log.d(TAG, "publishSubject: student 2 = " + i));

        publishSubject.onNext("E");
        sleep(1000);
        publishSubject.onNext("F");
        sleep(1000);
        publishSubject.onNext("G");
        sleep(1000);
    }

    // second subscribed item listen the last entered input then continue the rest of stream normally with the first one
    void behaviorSubject() {
        BehaviorSubject<String> behaviorSubject = BehaviorSubject.create();
        behaviorSubject.subscribe(i -> Log.d(TAG, "behaviorSubject: student 1 = " + i));
        behaviorSubject.onNext("A");
        sleep(1000);
        behaviorSubject.onNext("B");
        sleep(1000);
        behaviorSubject.onNext("C");
        sleep(1000);
        behaviorSubject.onNext("D");
        sleep(1000);

        behaviorSubject.subscribe(i -> Log.d(TAG, "behaviorSubject: student 2 = " + i));

        behaviorSubject.onNext("E");
        sleep(1000);
        behaviorSubject.onNext("F");
        sleep(1000);
        behaviorSubject.onNext("G");
        sleep(1000);
    }

    // second subscribed item stop the flow and start from the beginning of stream then continue the rest of stream normally with the first one
    void replaySubject() {
        ReplaySubject<String> replaySubject = ReplaySubject.create();
        replaySubject.subscribe(i -> Log.d(TAG, "replaySubject: student 1 = " + i));
        replaySubject.onNext("A");
        sleep(1000);
        replaySubject.onNext("B");
        sleep(1000);
        replaySubject.onNext("C");
        sleep(1000);
        replaySubject.onNext("D");
        sleep(1000);

        replaySubject.subscribe(i -> Log.d(TAG, "replaySubject: student 2 = " + i));

        replaySubject.onNext("E");
        sleep(1000);
        replaySubject.onNext("F");
        sleep(1000);
        replaySubject.onNext("G");
        sleep(1000);
    }

    // all subscribed items listen only the last input of the stream when onComplete execute
    void asyncSubject() {
        AsyncSubject<String> asyncSubject = AsyncSubject.create();
        asyncSubject.subscribe(i -> Log.d(TAG, "asyncSubject: student 1 = " + i));
        asyncSubject.onNext("A");
        sleep(1000);
        asyncSubject.onNext("B");
        sleep(1000);
        asyncSubject.onNext("C");
        sleep(1000);
        asyncSubject.onNext("D");
        sleep(1000);

        asyncSubject.subscribe(i -> Log.d(TAG, "asyncSubject: student 2 = " + i));

        asyncSubject.onNext("E");
        sleep(1000);
        asyncSubject.onNext("F");
        sleep(1000);
        asyncSubject.onNext("G");
        sleep(1000);
        asyncSubject.onComplete();
    }
}
