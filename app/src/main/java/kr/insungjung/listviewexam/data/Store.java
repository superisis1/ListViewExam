package kr.insungjung.listviewexam.data;

// 가게가 갖고 있는 고유 정보를 저장하는 역할
// 배민앱 예제

// 클래스 생성: 큰 개념 하나 만들고 속성들을 변수로 만든다.
public class Store {

    public String name;
//    거리: 가게의 좌표와 나의 좌표를 비교해서 계산하는 것이 원칙! (나의 좌표는 핸드폰 내의 gps 이용. 8주차)
//    위도/경도
//    double latitude;
//    double longitude;
    public String adress;
    public String openTime;
    public String closeTime;

    public Store(String name, String adress, String openTime, String closeTime) {
        this.name = name;
        this.adress = adress;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}




























