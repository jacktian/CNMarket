package ruolan.com.cnmarket.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ruolan.com.cnmarket.Contants;
import ruolan.com.cnmarket.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContentFragment extends Fragment {

    private String mTitle;
    private TextView mTvTitle;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recomment, container, false);
        mTvTitle = (TextView) view.findViewById(R.id.title);
        mTitle = getArguments().getString(Contants.FRAGMENT_TITLE);
        if (!TextUtils.isEmpty(mTitle))
            mTvTitle.setText(mTitle);
        return view;
    }



    public static Fragment newInstance(String title) {
        Bundle bundle = new Bundle();
        bundle.putString(Contants.FRAGMENT_TITLE, title);
        ContentFragment fragment = new ContentFragment();
        fragment.setArguments(bundle);
        return fragment;
    }
}
