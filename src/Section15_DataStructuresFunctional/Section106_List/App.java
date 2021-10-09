package Section15_DataStructuresFunctional.Section106_List;

import java.util.List;

public class App {
    public static void main(String[] args) {

        ListFun<Integer> list = ListFun.list(3,6,9);
        list.forEach(System.out::println);

        System.out.println("*******************");

        ListFun<Integer> neuList = list.addElement(56);
        neuList.forEach(System.out::println);

        System.out.println("*******************");

        ListFun<Integer> nListRemoved = neuList.removeElement(3);
        nListRemoved.forEach(System.out::println);

        System.out.println("*******************");

        ListFun<Integer> reversedList = nListRemoved.reverseList();
        reversedList.forEach(System.out::println);

        System.out.println("*******************");

        ListFun<Integer> list1 = ListFun.list(4,5,6,7);
        ListFun<Integer> list2 = ListFun.list(37,76,111);
        ListFun.concatList(list1, list2).forEach(System.out::println);

        System.out.println("*******************");
        list1.addAllEle(List.of(600,1000,1250))
                .forEach(System.out::println);

    }
}
