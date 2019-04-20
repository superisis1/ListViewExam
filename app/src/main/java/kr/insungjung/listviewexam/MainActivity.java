package kr.insungjung.listviewexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Store> myStoreList = new ArrayList<>();
    private android.widget.ListView storeListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }

    void setValues() {

        fillStroes();
    }

//    ArrayList 안에 가게들을 채우는 메소드
//    실무에서는 서버에서 받아온 데이터를 채운다.

    void fillStroes() {

        myStoreList.add(new Store("서향", "월계동 411", "09:00", "21:00"));
        myStoreList.add(new Store("삼호각", "마들로", "09:00", "21:00"));
        myStoreList.add(new Store("안동장", "장위1동", "09:00", "21:00"));
    }

    vois setupEvents() {

    }

    void bindViews() {
        this.storeListView = findViewById(R.id.storeListView);
    }
}
