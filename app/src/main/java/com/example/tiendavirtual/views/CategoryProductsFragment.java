package com.example.tiendavirtual.views;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiendavirtual.MainActivity;
import com.example.tiendavirtual.R;
import com.example.tiendavirtual.adapters.CategoryAdapter;
import com.example.tiendavirtual.adapters.ProductAdapter;
import com.example.tiendavirtual.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class CategoryProductsFragment extends Fragment {
    private NavController navController;
    private RecyclerView recycler;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate de layout for this fragment
        return inflater.inflate(R.layout.category_products_fragment,container,false);

    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        recycler = view.findViewById(R.id.products_recycler_view);
        Product product = new Product("This is a beautiful jean");
        List<Product> products = new ArrayList<>();
        products.add(product);
        ProductAdapter adapter = new ProductAdapter(products);
        recycler.setAdapter(adapter);

    }

    @Override
    public void onAttach(@NonNull Context context) {

        ((MainActivity)requireActivity()).appComponent.inject(this);
        super.onAttach(context);
    }
}
