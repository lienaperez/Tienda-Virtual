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

import com.example.tiendavirtual.entities.Category;
import com.example.tiendavirtual.MainActivity;
import com.example.tiendavirtual.R;
import com.example.tiendavirtual.adapters.CategoryAdapter;

import java.util.ArrayList;
import java.util.List;

public class CategoryFragment extends Fragment {
    private NavController navController;
    private RecyclerView recycler;
    private List<Category>  categories;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate de layout for this fragment
        return inflater.inflate(R.layout.categories_fragment,container,false);

    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        recycler = view.findViewById(R.id.categories_recycler_view);
        categories = new ArrayList<Category>();
        Category category1 = new Category("Equipos");
        Category category2 = new Category("Tecnologia");
        Category category3 = new Category("Telefonia");
        Category category4 = new Category("Movil");
        Category category5 = new Category("Computadoras");
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        categories.add(category5);
        CategoryAdapter adapter = new CategoryAdapter(categories);
        recycler.setAdapter(adapter);
    }

    @Override
    public void onAttach(@NonNull Context context) {

        ((MainActivity)requireActivity()).appComponent.inject(this);
        super.onAttach(context);
    }
}
