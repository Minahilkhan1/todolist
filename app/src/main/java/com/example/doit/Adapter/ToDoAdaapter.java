package com.example.doit.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.recyclerview.widget.RecyclerView;

import com.example.doit.MainActivity;
import com.example.doit.Model.ToDoModel;
import com.example.doit.R;

import java.util.List;

public class ToDoAdaapter extends RecyclerView.Adapter<ToDoAdaapter.ViewHolder> {

    private List<ToDoModel> toDoList;
    private MainActivity activity;
    public ToDoAdaapter(MainActivity activity){
        this.activity= activity;

    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_layout,parent,false);
        return new ViewHolder(itemview);



    }
    public void onBindViewHolder(ViewHolder holder,int position){
        ToDoModel item= toDoList.get(position);
        holder.task.setText(item.getTasks());
        holder.task.setChecked(toBoolean(item.getStatus()));
    }

    public int getItemCount(){
        return toDoList.size();
    }

    private boolean toBoolean(int n){
        return n!=0;
    }

    public void setTasks(List<ToDoModel> toDoList ){
        this.toDoList= toDoList;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CheckBox task;
        ViewHolder (View view){
            super (view);
            task=view.findViewById(R.id.todoCheckBox);


        }

    }
}
