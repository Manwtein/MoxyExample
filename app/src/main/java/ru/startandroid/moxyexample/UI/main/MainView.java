package ru.startandroid.moxyexample.UI.main;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

public interface MainView
        extends MvpView {

    @StateStrategyType(AddToEndStrategy.class)
    void showMessage(int example);
}
