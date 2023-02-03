package SecondPackage;

import java.util.*;

public class TestClass {

    public static void main(String[] args) {

        List<String> collection = new ArrayList<>();

        collection.add("Привет");

        Map<Integer, String> mapList = new HashMap<Integer, String>();

        mapList.put(10, "Яблоко" );
        mapList.put(20, "Апельсин" );
        mapList.put(67, "Яблоко1" );



        System.out.println(mapList.get(10));



    }

    private void test(){
        int int1 = 10;
        int1 = 20;

        if ("Привет" == "Приве") {
            int testInt1 = 20;
            testInt1 += 20;
            System.out.println(testInt1);
        } else if ("Привет" == "Првет"){
            System.out.println("Второе проверка верная");
        }
    }

}
