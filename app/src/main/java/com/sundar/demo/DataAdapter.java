package com.sundar.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.sundar.demo.Model.Banner;
import com.sundar.demo.Model.Categroy;
import com.sundar.demo.Model.Data;
import com.sundar.demo.Model.DtaClass;
import com.sundar.demo.Model.TopItem;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {

   // private ArrayList<TopItem> dataModelList;
    private List<Categroy> dataModelList = new ArrayList<>();
    private Context context;

    public DataAdapter(List<Categroy> dataModelList, Context context) {
        //this.dataModelList = dataModelList;
        this.dataModelList = dataModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

// holder.tvid.setText(Integer.valueOf(dataModelList.get(position).getId()));

        Picasso.with(context).load(dataModelList.get(position).getImage())
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.imgBanner);
       // Picasso.get().load(Banner.get(i).getImageurl()).into(myViewHolder.image);

        holder.tvBannerName.setText(dataModelList.get(position).getName());
      //  holder.tvBannerName.setText(dataModelList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBanner;
        TextView tvBannerName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgBanner = (ImageView) itemView.findViewById(R.id.imgBanner);

            tvBannerName =(TextView) itemView.findViewById(R.id.tvBannerName);

        }
    }
}
