package ru.startandroid.moxyexample.UI.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import ru.startandroid.moxyexample.R;

public class MainActivity
        extends MvpAppCompatActivity
        implements MainView{

    @InjectPresenter
    MainPresenter mainPresenter;

    private TextView tvMessage;
    private Button btnMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        tvMessage = findViewById(R.id.tvMessage);
        btnMessage = findViewById(R.id.btnMessage);
    }

    @Override
    public void showMessage(int example) {
        tvMessage.setText(String.valueOf(example));
    }

    public void onClick(View view) {
        mainPresenter.showMessage();
    }
}
