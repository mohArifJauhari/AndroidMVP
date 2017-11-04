package com.mahesaiqbal.androidmvp.views.base;

/**
 * Created by mahesaiqbal on 11/4/2017.
 */

public interface Presenter<T extends View> {

    void onAttach(T view);

    void onDetach();

}
