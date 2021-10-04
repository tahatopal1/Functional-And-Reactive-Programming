package Section9_DesignPatternsFunctional.Section56_Strategy;

public class Stock {

    private String code;
    private double cost;
    private int    count;

    public Stock(String code, double cost, int count) {
        this.code = code;
        this.cost = cost;
        this.count = count;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "code='" + code + '\'' +
                ", cost=" + cost +
                ", count=" + count +
                '}';
    }
}
