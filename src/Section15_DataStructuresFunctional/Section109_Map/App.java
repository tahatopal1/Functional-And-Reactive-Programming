package Section15_DataStructuresFunctional.Section109_Map;

public class App {
    public static void main(String[] args) {
        MapFun<Integer, String> map = new MapFun<>(5);
        map.put(1,"Aragorn");
        map.put(2,"Legolas");
        map.put(3,"Gimli");
        map.put(4,"Gandalf");
        map.put(5,"Boromir");
        map.display();
    }
}
