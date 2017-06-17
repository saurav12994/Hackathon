package com.example.sourabh.mathsquiz;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sourabh on 24-03-2017.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    static Context context;
    RecyclerAdapter(Context context){
        this.context=context;
    }
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_child,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        if(position==0){
        holder.info.setText("Single Player");}
        if(position==1){
            holder.info.setText("Multiplayer");}
        if(position==2){
            holder.info.setText("Logout");}
    }

    @Override
    public int getItemCount() {
        int count1= 3;
        return count1;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView info;
        ArrayList screens;
        public View view;
        int i=0;
        public ViewHolder(View itemView) {
            super(itemView);
            Context context=itemView.getContext();
            SQLiteDatabase db = context.openOrCreateDatabase("ZomatoDB", Context.MODE_APPEND, null);
            info=(TextView)itemView.findViewById(R.id.info_text);

            view = itemView;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // item clicke
                    String ab=info.getText().toString();
                    if(ab.equals("Single Player")){
                    Toast.makeText(v.getContext(),ab, Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(v.getContext(),MainActivity.class);
                    //intent.putExtra("U",ab);
                    v.getContext().startActivity(intent);}
                    if(ab.equals("Multiplayer")){
                        Toast.makeText(v.getContext(),ab, Toast.LENGTH_LONG).show();
                       // Intent intent=new Intent(v.getContext(),MainActivity.class);
                        //intent.putExtra("U",ab);
                       // v.getContext().startActivity(intent);
                        }
                    if(ab.equals("Logout")){
                        Toast.makeText(v.getContext(),ab, Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(v.getContext(),AlertActivity.class);
                        //intent.putExtra("U",ab);
                        v.getContext().startActivity(intent);
                    }
                }
            });

        }
    }
}
