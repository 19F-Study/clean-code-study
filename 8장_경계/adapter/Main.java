package adapter;

public class Main {

    public static void main(String[] args) {

        /*
         * 우리는 우리가 원하는 기능이 포함된 BI 툴을 사용하고 싶다.
         * BI 툴을 사용하기 위해선 데이터 저장소에 커넥션을 맺어야 한다.
         *
         * 그런데 해당 BI 툴은 ABC 프로토콜을 지원하는 데이터 저장소와만 연결을 맺을 수 있다.
         * 문제는 우리가 기존에 데이터를 저장하던 저장소는 DEF 프로토콜을 사용하고 있다는 점이다.
         *
         * 매우 다행히도 DEF 프로토콜은 약간의 코드 작업을 통해 ABC 프로토콜로 전환할 수 있다.
         * 이를 위해 Adapter 를 사용한다.
         * */

        DEFDataStorage defDataStorage = new DEFDataStorageImpl();

        DEFABCAdapter adapter = new DEFABCAdapter();
        adapter.setStorage(defDataStorage);

        BITool biTool = new BIToolImpl();
        biTool.connectToDataSource(adapter);
    }

}
