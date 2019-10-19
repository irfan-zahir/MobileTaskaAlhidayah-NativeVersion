package com.android.taskaalhidayah.Home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.taskaalhidayah.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mUrls = new ArrayList<>();



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initBitmapImages();
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.recycler_View);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames,mUrls,this);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( getActivity() );
        recyclerView.setLayoutManager( layoutManager);
        return view;
    }





    public void initBitmapImages(){
        mNames.add("Activity Week 1");
        mUrls.add("https://firebasestorage.googleapis.com/v0/b/taskaalhidayah-87f2a.appspot.com/o/Images%2Fimages.jpg?alt=media&token=66f58005-ef1c-4db4-80b0-ef950574288f");

        mNames.add("Activity Week 2");
        mUrls.add("https://firebasestorage.googleapis.com/v0/b/taskaalhidayah-87f2a.appspot.com/o/Images%2Fimages%20(2).jpg?alt=media&token=90486463-0278-4307-b95b-f0584cbaef65");

        mNames.add("Activity Week 3");
        mUrls.add("https://firebasestorage.googleapis.com/v0/b/taskaalhidayah-87f2a.appspot.com/o/Images%2Fimages%20(1).jpg?alt=media&token=86976855-7999-42df-82e5-3b12fcee93d0");

    }

}
