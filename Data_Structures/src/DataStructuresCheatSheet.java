import java.util.*;

public class DataStructuresCheatSheet {

    public static void main(String[] args) {

        /** Arrays **/
        String[] stringArray = new String[10];
        int[] integerArray = {0,1,2,3,4,5,6,7,8,9};
        stringArray[0] = "Matthew Hess";
        for (int i = 0; i < integerArray.length; i++)
            System.out.println(integerArray[i]);

        /** ArrayList **/
        ArrayList<String> stringArrayList = new ArrayList();
        stringArrayList.add("Matthew Hess");
        stringArrayList.add("Jesse Spears");
        for(int j = 0; j < stringArrayList.size(); j++)
            System.out.println(stringArrayList.get(j));



    }
}