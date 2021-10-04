package Section8_FunctionalInDepth.Section48_Composition;

public class FunctionalComposition {
    public static void main(String[] args) {
        IFunction<Square, Integer> fun1 = s -> s.getArea();
        IFunction<Integer, Double> fun2 = s -> Math.sqrt(s);

        IFunction<Square, Double> getSide = fun2.compose(fun1);
        Double area = getSide.apply(new Square(100));
        System.out.println(area);

    }
}
