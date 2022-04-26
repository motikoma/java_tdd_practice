package how_to_no_bug_programming.sushi;

import java.util.Objects;

public class Neta {

    private final String name;
    private final Integer count;

    public Neta(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neta neta = (Neta) o;
        return Objects.equals(name, neta.name) && Objects.equals(count, neta.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }
}
