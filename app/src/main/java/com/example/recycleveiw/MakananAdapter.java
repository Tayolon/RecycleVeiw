package com.example.recycleveiw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
//androids.recyclerview.widget.RecyclerView;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {
    // array list data yang akan kita olah di adapter

    ArrayList<ModelMakanan> listMakanan;
    private final OnItemClickListener listener; /////////////error

    public interface OnItemClickListener {
        void onItemClick(ModelMakanan makananModel);
    }

    public MakananAdapter(ArrayList<ModelMakanan> listMakananModel , OnItemClickListener listener) {
        this.listMakanan = listMakananModel;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelMakanan makanan = listMakanan.get(position);
        holder.tvNamaMakanan.setText(makanan.getNamaMakanan());
        holder.tvHargaMakanan.setText(makanan.getHargaMakanan());
        holder.ivMakanan.setImageResource(makanan.getGambarasal());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(makanan));
    }

    @Override
    public int getItemCount() {
        return this.listMakanan.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvHargaMakanan;
        TextView tvNamaMakanan;
        ImageView ivMakanan;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNamaMakanan = itemView.findViewById(R.id.tvNamaMakanan);
            tvHargaMakanan = itemView.findViewById(R.id.tvHargaMakanan);
            ivMakanan = itemView.findViewById(R.id.ivMakanan);
        }

    }

    }

