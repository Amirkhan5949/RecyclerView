package com.example.recycleview.Adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recycleview.R;
import com.example.recycleview.model.User;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    Context context;
    List<User>list;

    public UserAdapter(Context context, List<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        final User user=list.get(position);
        holder.name.setText(user.getName());
        holder.status.setText(user.getStatus());
        //Picasso.get().load(user.getImage()).into(holder.imageView);
        Picasso.get().load(user.getImage()).into(holder.imageView);
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Name :"+user.getName()+"\n"+"Status :"+user.getStatus(), Toast.LENGTH_SHORT).show();
            }
        });



    }




    @Override
    public int getItemCount() {
        return list.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imageView;
        TextView name,status;
        LinearLayout layout;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            name=itemView.findViewById(R.id.name);
            status=itemView.findViewById(R.id.status);
            layout=itemView.findViewById(R.id.layout);

        }
    }
}
