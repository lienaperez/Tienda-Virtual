package com.example.tiendavirtual.adapters;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiendavirtual.Category;
import com.example.tiendavirtual.R;
import com.google.android.material.card.MaterialCardView;

public class CategoryViewHolder extends RecyclerView.ViewHolder {


    public CategoryViewHolder(@NonNull View itemView){
        super(itemView);
    }

    public void onBindViewHolder(Category category){
     TextView textView = itemView.findViewById(R.id.category_name_item);
     textView.setText(category.getCategory());
     MaterialCardView card = itemView.findViewById(R.id.card);
     card.setOnClickListener(v ->{ Bundle bundle = new Bundle();
        Navigation.findNavController(itemView).navigate(R.id.other_fragment,bundle); });
    }
}
