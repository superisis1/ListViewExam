package kr.insungjung.listviewexam.apdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.insungjung.listviewexam.R;
import kr.insungjung.listviewexam.data.Store;


// 생성자 -> 슈퍼메소드 -> 변수3개 선언

public class StoreAdapter extends ArrayAdapter<Store> {

    Context mContext;
    List<Store> mList;
    LayoutInflater inf;

    public StoreAdapter(Context context, List<Store> list) {
        super(context, R.layout.store_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }
}
