package com.example.doit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.doit.Adapter.ToDoAdaapter;
import com.example.doit.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView tasksRecyclerView;
    private ToDoAdaapter tasksAdapter;

    private List<ToDoModel> taskList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        taskList= new ArrayList<>();

        tasksRecyclerView = findViewById(R.id.tasksRecyclerView);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        tasksAdapter= new ToDoAdaapter(this);
        tasksRecyclerView.setAdapter(tasksAdapter);

        ToDoModel task1= new ToDoModel();
        task1.setTasks("Laundry");
        task1.setStatus(0);
        task1.setId(1);


        ToDoModel task2= new ToDoModel();
        task2.setTasks("Home work");
        task2.setStatus(0);
        task2.setId(1);

        ToDoModel task3= new ToDoModel();
        task3.setTasks("Assignment");
        task3.setStatus(0);
        task3.setId(1);

        ToDoModel task4= new ToDoModel();
        task4.setTasks("Task");
        task4.setStatus(0);
        task4.setId(1);

        ToDoModel task5= new ToDoModel();
        task5.setTasks("Car wash");
        task5.setStatus(0);
        task5.setId(1);

        ToDoModel task6= new ToDoModel();
        task6.setTasks("House clean");
        task6.setStatus(0);
        task6.setId(1);

        ToDoModel task7= new ToDoModel();
        task7.setTasks("Dusting");
        task7.setStatus(0);
        task7.setId(1);

        ToDoModel task8= new ToDoModel();
        task8.setTasks("Setting Almira");
        task8.setStatus(0);
        task8.setId(1);

        ToDoModel task9= new ToDoModel();
        task9.setTasks("Washing Dishes");
        task9.setStatus(0);
        task9.setId(1);

        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        taskList.add(task5);
        taskList.add(task6);
        taskList.add(task7);
        taskList.add(task8);
        taskList.add(task9);
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        taskList.add(task5);


        tasksAdapter.setTasks(taskList);












    }
}