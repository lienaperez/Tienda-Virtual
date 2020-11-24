package com.example.tiendavirtual.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiendavirtual.R;
import com.example.tiendavirtual.entities.Category;
import com.example.tiendavirtual.entities.Product;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder>{
    private List<Product> products;

    public ProductAdapter(List<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout cardView = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.products_list_item,parent,false);
        return new ProductViewHolder(cardView);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.onBindViewHolder(products.get(0));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
