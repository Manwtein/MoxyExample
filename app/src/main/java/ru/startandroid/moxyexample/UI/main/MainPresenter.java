package ru.startandroid.moxyexample.UI.main;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class MainPresenter
        extends MvpPresenter<MainView>{

    private int list;
    final String TAG = "myLogs";

    public MainPresenter() {
        list = 23;
    }

    @Override
    public void attachView(MainView view) {
        super.attachView(view);
    }

    public void showMessage(){
        Log.i(TAG, "showMessage: ");
        getViewState().showMessage(list);
    }
}
