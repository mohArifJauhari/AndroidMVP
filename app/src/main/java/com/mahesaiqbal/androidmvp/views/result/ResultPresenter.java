package com.mahesaiqbal.androidmvp.views.result;

import com.mahesaiqbal.androidmvp.views.base.Presenter;

/**
 * Created by mahesaiqbal on 11/5/2017.
 */

public class ResultPresenter implements Presenter<ResultView> {
    private ResultView mView;

    @Override
    public void onAttach(final ResultView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    public void showResult(final String text) {
        mView.onShowResult(text);
    }
}