import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Testing {

    static void myMethod(String fname){
        System.out.println(fname);
    }

    static int sumAdd(int sum1, int sum2){
        return sum1 + sum2;
    }

    public void mySecond(){
        System.out.println("Public medthod by object");
    }

    public static ArrayList<String> myStringArray(){
        ArrayList <String>sArray = new ArrayList<String>();
        sArray.add("CRM");
        sArray.add("Student Panel");
        sArray.add("SIEC India");

        for (String i : sArray) {
            System.out.println(i);
        }

        return sArray;
    }

    public static ArrayList<Integer> myIntegerArry(){
        ArrayList<Integer> iArray = new ArrayList<Integer>();
        iArray.add(123);
        iArray.add(456);
        iArray.add(789);

        for (Integer i : iArray) {
            System.out.println(i);
        }
        return iArray;
    }

    public static Map<Integer,String> myMapArray(){

        Map<Integer,String> mapArray = new HashMap<>();
        mapArray.put(10,"dollar");
        mapArray.put(20,"dirham");
        mapArray.put(30,"pound");
        
        for(Map.Entry<Integer, String> entry: mapArray.entrySet()){
            System.out.println("Key: " + entry.getKey() + ",Value: "  + entry.getValue());
        }

        for (Integer i : mapArray.keySet()) {
            System.out.println(i);
        }
        
        return mapArray;
    }

    public static void main(String[] args){
        myMethod("Akash");
        int addition = sumAdd(18,20);
        System.out.println(addition);


        Testing myObj = new Testing();
        myObj.mySecond();

        LocalDate date =  LocalDate.now();
        System.out.println(date);

        LocalDateTime dateTime =  LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTime);
        System.out.println(date.format(format));

        ArrayList<String> arrayStringResult =  myStringArray();
        System.out.println(arrayStringResult);

        ArrayList<Integer> arrayIntegerResult = myIntegerArry();
        System.out.println(arrayIntegerResult);

        Map<Integer, String> arrayMapResult = myMapArray();
        System.out.println(arrayMapResult);


    }
    

}
