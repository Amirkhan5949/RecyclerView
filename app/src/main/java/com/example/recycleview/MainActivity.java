package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.recycleview.Adapter.UserAdapter;
import com.example.recycleview.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<User>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list=new ArrayList<>();
        list.add(new User("https://cdn.pixabay.com/photo/2015/11/20/17/29/person-1053543_960_720.jpg","Avani yadav","She is my Crush"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/11/20/17/29/person-1053543_960_720.jpg","Avani yadav","She is my Crush"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/11/20/17/29/person-1053543_960_720.jpg","Avani yadav","She is my Crush"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/11/20/17/29/person-1053543_960_720.jpg","Avani yadav","She is my Crush"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/11/20/17/29/person-1053543_960_720.jpg","Avani yadav","She is my Crush"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/11/20/17/29/person-1053543_960_720.jpg","Avani yadav","She is my Crush"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/11/20/17/29/person-1053543_960_720.jpg","Avani yadav","She is my Crush"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/11/20/17/29/person-1053543_960_720.jpg","Avani yadav","She is my Crush"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/11/20/17/29/person-1053543_960_720.jpg","Avani yadav","She is my Crush"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/12/09/04/27/a-single-person-1084191_960_720.jpg","Aamir khan","I really like you"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/12/09/04/27/a-single-person-1084191_960_720.jpg","Aamir khan","I really like you"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/12/09/04/27/a-single-person-1084191_960_720.jpg","Aamir khan","I really like you"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/12/09/04/27/a-single-person-1084191_960_720.jpg","Aamir khan","I really like you"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/12/09/04/27/a-single-person-1084191_960_720.jpg","Aamir khan","I really like you"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/12/09/04/27/a-single-person-1084191_960_720.jpg","Aamir khan","I really like you"));
        list.add(new User("https://cdn.pixabay.com/photo/2015/12/09/04/27/a-single-person-1084191_960_720.jpg","Aamir khan","I really like you"));

        recyclerView.setAdapter(new UserAdapter(this,list));
    }
}
