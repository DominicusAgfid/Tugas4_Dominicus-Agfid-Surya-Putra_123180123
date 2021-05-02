package com.example.daftaranime;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    public ArrayList<MainModel> getMainModels() {
        return mainModels;
    }

    public void setMainModels(ArrayList<MainModel> mainModels) {
        this.mainModels = mainModels;
    }

    public RVAdapter(ArrayList<MainModel> listData, Context context) {
        this.context = context;
    }

    public ArrayList<MainModel> mainModels;
    private Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_anime, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        Glide.with(context).load(getMainModels().get(i).getGambarAnime()).into(holder.photo);
        holder.tvName.setText(getMainModels().get(i).getNamaAnime());
        holder.tvdeskripsi.setText(getMainModels().get(i).getDetailAnime());
        holder.cvCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("photo", getMainModels().get(i).getGambarAnime());
                intent.putExtra("name", getMainModels().get(i).getNamaAnime());
                intent.putExtra("detail", getMainModels().get(i).getDetailAnime());
                intent.putExtra("genre", getMainModels().get(i).getGenreAnime());
                context.startActivities(new Intent[]{intent});
            }
        });
    }

    @Override
    public int getItemCount() {
        return mainModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView photo ;
        private TextView tvName,tvdeskripsi;
        private CardView cvCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.ivphoto);
            tvName = itemView.findViewById(R.id.tvname);
            cvCardView = itemView.findViewById(R.id.cv_item);
            tvdeskripsi = itemView.findViewById(R.id.tvdetail);
        }
    }
}
