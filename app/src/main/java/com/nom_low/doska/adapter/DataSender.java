package com.nom_low.doska.adapter;

import com.nom_low.doska.NewPost;

import java.util.List;

public interface DataSender {
    public void onDataRecived(List<NewPost> listData);
}
