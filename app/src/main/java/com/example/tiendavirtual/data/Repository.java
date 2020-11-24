package com.example.tiendavirtual.data;

import com.example.tiendavirtual.data.remote.RemoteDataSource;

import javax.inject.Inject;

public class Repository {


    private RemoteDataSource remoteDataSource;

    @Inject
    public Repository( RemoteDataSource remoteDataSource) {
      this.remoteDataSource = remoteDataSource;
    }

    public RemoteDataSource getRemoteDataSource() {
        return remoteDataSource;
    }



}
