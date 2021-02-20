package ls.main.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.netease.nim.demo.R;

import ls.main.activities.YinsiActivity;
import ls.main.base.BaseFragment;
import ls.main.utils.MyDialog;


public class UserFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = View.inflate(activity, R.layout.frag_user, null);
        TextView name = view.findViewById(R.id.my_name);



        view.findViewById(R.id.wdfk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show2();
            }
        });
        view.findViewById(R.id.wdqc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show3();
            }
        });
        view.findViewById(R.id.wdgy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show5();
            }
        });

        view.findViewById(R.id.rl_yinsi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().startActivity(new Intent(UserFragment.this.getActivity(), YinsiActivity.class));
            }
        });


        return view;
    }


    private void show2() {
        View view = getLayoutInflater().inflate(R.layout.dialog_2, null);
        MyDialog mMyDialog1 = new MyDialog(getContext(), 0, 0, view, R.style.DialogTheme);
        mMyDialog1.setCancelable(true);
        mMyDialog1.show();
        view.findViewById(R.id.qr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMyDialog1.dismiss();
                Toast.makeText(getContext(), "已确认", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void show3() {
        View view = getLayoutInflater().inflate(R.layout.dialog_3, null);
        MyDialog mMyDialog1 = new MyDialog(getContext(), 0, 0, view, R.style.DialogTheme);
        mMyDialog1.setCancelable(true);
        mMyDialog1.show();
        view.findViewById(R.id.d3_qx).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMyDialog1.dismiss();
                Toast.makeText(getContext(), "已取消", Toast.LENGTH_SHORT).show();
            }
        });
        view.findViewById(R.id.d3_qr).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMyDialog1.dismiss();
                Toast.makeText(getContext(), "已清除", Toast.LENGTH_SHORT).show();
            }
        });

    }


    private void show5() {
        View view = getLayoutInflater().inflate(R.layout.dialog_5, null);
        MyDialog mMyDialog1 = new MyDialog(getContext(), 0, 0, view, R.style.DialogTheme);
        mMyDialog1.setCancelable(true);
        mMyDialog1.show();

    }
}