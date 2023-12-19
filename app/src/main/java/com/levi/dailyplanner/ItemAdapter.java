package com.levi.dailyplanner;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.levi.dailyplanner.model.Item;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private List<Item> itemList;

    public ItemAdapter(List<Item> itemsList) {
        this.itemList = itemsList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = itemList.get(position);

        holder.itemText.setText(item.getItemName());
        holder.itemPriority.setText(item.getPriority().toString());
        holder.itemTime.setText(item.getItemTime());
        // TODO: add desccription and checkbox
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        TextView itemText;
        CheckBox itemCheckbox;
        TextView itemPriority;
        TextView itemTime;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemText = itemView.findViewById(R.id.itemText);
            itemCheckbox = itemView.findViewById(R.id.itemCheckbox);
            itemPriority = itemView.findViewById(R.id.itemPriority);
            itemTime = itemView.findViewById(R.id.itemTime);
        }
    }
}
