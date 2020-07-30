package com.example.myapplication.ui.dashboard;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    public static String TAG = "PersonAdapter";
    List<Person> personList;


    public class PersonViewHolder extends RecyclerView.ViewHolder {
        protected TextView title;
        protected TextView name;

        public PersonViewHolder(View view) {
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.name = (TextView) view.findViewById(R.id.name);
        }
    }

    public PersonAdapter(List<Person> personList) {

        this.personList = personList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_adapter, null);
        PersonViewHolder viewHolder = new PersonViewHolder(view);
        Log.d(TAG, "onCreateViewHolder: ");
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        Person person = personList.get(position);
        Log.d("PERSON", "onBindViewHolder: "+person.getPhone());
        holder.name.setText(person.getName());
        holder.title.setText(String.valueOf(person.getName().charAt(0)));
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }
}
