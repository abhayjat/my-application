package com.example.myapplication.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Person;
import com.example.myapplication.stub.DummyData;

import java.util.List;

public class FirstFragment extends Fragment {

    PersonAdapter adapter;

    @Override
    public View onCreateView(        LayoutInflater inflater, ViewGroup container,       Bundle savedInstanceState  ) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        DummyData data = new DummyData();
        List<Person> personList = data.getMyFriendsList();
        Log.d("DATA", personList.size()+"");
        adapter = new PersonAdapter(personList);
       adapter.notifyDataSetChanged();

        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();

    }
}