package Section8_FunctionalInDepth.Section42_PureFunctions;

public class Example {

    private int value = 0;

    // Pure function
    // Return value only depends the input params
    // No side effects: Doesn't change anything outside the function anywhere
    // Not modifying params 'a' and 'b'
    public  int sum(int a, int b){
        return a + b;
    }

    // Impure function
    // Uses a variable besides method arguments to perform add operation
    // Modifies a state of object which resides outside of method
    public  int add(int nextValue){
        return this.value += nextValue;
    }


}
