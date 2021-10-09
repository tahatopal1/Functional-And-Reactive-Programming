package Section16_ReactiveProgramming.Section115_PullPush;

public interface CallBack {

    void pushData(String data);

    void pushComplete();

    void pushError(Exception e);

}
