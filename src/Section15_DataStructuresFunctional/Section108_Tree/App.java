package Section15_DataStructuresFunctional.Section108_Tree;

public class App {
    public static void main(String[] args) {

        TreeFun<Integer> t = TreeFun.tree(23, 5, 76, 10, 3, 45);
        System.out.println(t);

        TreeFun<Integer> remove = t.remove(10);
        System.out.println(remove);

        System.out.println("is 45 a member: " + remove.isMember(45));

        System.out.println("Max: " + t.max());

    }
}
