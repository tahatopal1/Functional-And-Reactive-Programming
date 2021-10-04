package Section12_Collectors.Section88_TerminalAnalogousCollectors.Part_1;

import java.sql.Date;
import java.util.Spliterator;
import java.util.function.Consumer;

public class EmployeeSpliterator implements Spliterator {

    private Spliterator<String> wordSpliterator;
    private int id;
    private String name;
    private char gender;
    private Date birth;
    private String city;
    private String designation;
    private Date joiningDate;
    private double salary;

    public EmployeeSpliterator(Spliterator<String> wordSpliterator) {
        this.wordSpliterator = wordSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer action) {

        if (this.wordSpliterator.tryAdvance(word -> this.id = Integer.valueOf(word)) &&
                this.wordSpliterator.tryAdvance(word -> this.name = word) &&
                this.wordSpliterator.tryAdvance(word -> this.gender = word.charAt(0)) &&
                this.wordSpliterator.tryAdvance(word -> this.birth = Date.valueOf(word)) &&
                this.wordSpliterator.tryAdvance(word -> this.city = word) &&
                this.wordSpliterator.tryAdvance(word -> this.designation = word) &&
                this.wordSpliterator.tryAdvance(word -> this.joiningDate = Date.valueOf(word)) &&
                this.wordSpliterator.tryAdvance(word -> this.salary = Double.valueOf(word))){
            action.accept(new Employee(id, name, gender, birth, city, designation, joiningDate, salary));
            return true;
        }

        return false;

    }

    @Override
    public Spliterator trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return wordSpliterator.estimateSize() / 8;
    }

    @Override
    public int characteristics() {
        return wordSpliterator.characteristics();
    }
}
