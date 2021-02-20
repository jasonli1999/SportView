package ls.main.base;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import ls.main.activities.MainMenuActivity;


public class BaseFragment extends Fragment {

    protected MainMenuActivity activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = (MainMenuActivity) getActivity();
    }

}
