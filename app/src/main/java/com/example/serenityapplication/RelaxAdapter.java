package com.example.serenityapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RelaxAdapter extends RecyclerView.Adapter<RelaxAdapter.RelaxAdapterVh> {

    private List<RelaxMode> relaxModeList;
    private Context context;

    public RelaxAdapter(List<RelaxMode> relaxModeList) {
        this.relaxModeList = relaxModeList;
    }

    @NonNull
    @Override
    public RelaxAdapter.RelaxAdapterVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();

        return new RelaxAdapterVh(LayoutInflater.from(context).inflate(R.layout.row_relax, null));
    }

    @Override
    public void onBindViewHolder(@NonNull RelaxAdapter.RelaxAdapterVh holder, int position) {
        RelaxMode relaxMode = relaxModeList.get(position);

        String relaxname1 = relaxMode.getRelax();
        String dppic = relaxMode.getRelax().substring(0,1);

        holder.tvrelaxname1.setText(relaxname1);
        holder.tvdppic.setText(dppic);
    }

    @Override
    public int getItemCount() {
        return relaxModeList.size();
    }

    public class RelaxAdapterVh extends RecyclerView.ViewHolder {

        TextView tvdppic;
        TextView tvrelaxname1;
        ImageView imIcon;
        public RelaxAdapterVh(@NonNull View itemView) {
            super(itemView);
            tvdppic = itemView.findViewById(R.id.dppic);
            tvrelaxname1 = itemView.findViewById(R.id.relaxname1);
            imIcon = itemView.findViewById(R.id.imgview);
        }
    }
}
