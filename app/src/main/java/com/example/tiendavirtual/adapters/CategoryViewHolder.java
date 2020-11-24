package com.example.tiendavirtual.adapters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiendavirtual.Category;
import com.example.tiendavirtual.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    public CategoryViewHolder(@NonNull View itemView){
        super(itemView);
    }

    public void onBindViewHolder(Category category){
     TextView textView = itemView.findViewById(R.id.category_name_item);
     textView.setText(category.getCategory());
    }
}
