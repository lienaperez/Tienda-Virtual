package com.example.tiendavirtual.data.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {


    @Provides
    public Gson provideRetrofitService(){
        Gson json = new GsonBuilder().serializeNulls().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create(json))
                .client(provideHttpOkResponse())
                .build();
        return json;
    }

    @Provides
    public OkHttpClient provideHttpOkResponse(){

        return new OkHttpClient.Builder()
                .readTimeout(70, TimeUnit.SECONDS)
                .connectTimeout(70,TimeUnit.SECONDS)
                .writeTimeout(70,TimeUnit.SECONDS)
                .build();
    }
}
