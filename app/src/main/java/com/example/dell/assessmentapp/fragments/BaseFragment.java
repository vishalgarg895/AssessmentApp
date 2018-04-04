package com.example.dell.assessmentapp.fragments;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.dell.assessmentapp.R;

public class BaseFragment extends Fragment {

    public ProgressDialog mProgressDialog;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initializeProgressBar();
    }

    private void initializeProgressBar() {
        mProgressDialog = ProgressDialog.show(getActivity(),
                getString(R.string.progress_dialog_title),
                getString(R.string.show_progress_message));
    }
}
