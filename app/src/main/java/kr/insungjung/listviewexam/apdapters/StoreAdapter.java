package kr.insungjung.listviewexam.apdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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

//    getView -> 빨간글씨 구문 삭제
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.store_list_item,null);

        }

//        실제 Store 데이터를 이용해서 row 의 적재적소에 뿌려주기

        Store data = mList.get(position);

//        XML에 그려진 컴포넌트를 찾아서 Java로 연결

        TextView storeNameTxt = row.findViewById(R.id.storeNameTxt);

//        data 가 가진 값을 컴포넌트에 set

        storeNameTxt.setText(data.name);

        return row;
    }
}
