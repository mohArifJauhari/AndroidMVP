package com.mahesaiqbal.androidmvp.views.main;

import com.mahesaiqbal.androidmvp.model.Data;
import com.mahesaiqbal.androidmvp.views.base.Presenter;

/**
 * Created by mahesaiqbal on 11/4/2017.
 */

public class MainPresenter implements Presenter<MainView> {

    private MainView mView;

    @Override
    public void onAttach(final MainView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void showFragment() {
        // Set Data
        final Data data = new Data();
        data.setText("Hello from Data!");

        // Show Fragment with Data
        mView.onShowFragment(data);
    }

}
