import java.util.*;

public class Check {

    public static void main(String args[]){
        List list1 = new ArrayList();
        list1.add("1");
        list1.add(2);

        List<Integer> list2 = new ArrayList();
        list2.add(391);
        list2.add(492);
        list2.add(581);
        list2.add(894);
        list2.add(777);
        list2.add(683);
        list2.add(289);


        //list1.forEach(System.out::println);
        //Collections.sort(list2);
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if((o1%10)>(o2%10))
                return 1;
                else
                    return -1;
            }
        };

        list2.sort(com);
        list2.forEach(System.out::println);
    }

    public void checkMethod(){

    }

}
