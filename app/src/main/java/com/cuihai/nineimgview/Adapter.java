package com.cuihai.nineimgview;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * author:  崔海
 * time:    2017/5/15 21:38
 * name:
 * overview:
 * usage:
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private Context context;
    private final List<String> list;

    public Adapter(Context context) {
        this.context = context;
        list = new ArrayList<>();
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
        list.add("https://avatars3.githubusercontent.com/u/23027828?v=3&u=3bd94805200528fb9217cde5ed98fce70cd7acc1&s=400");
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rv, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.imgView.setUrlList(list);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class Holder extends RecyclerView.ViewHolder {
        ExampleImgView imgView;

        public Holder(View itemView) {
            super(itemView);
            imgView = (ExampleImgView) itemView.findViewById(R.id.img);
        }
    }
}
