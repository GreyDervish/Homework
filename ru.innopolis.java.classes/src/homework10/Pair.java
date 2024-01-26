package homework10;

import java.util.Objects;
import java.util.Optional;

class Pair<i, s> {

    public final i first;
    public final s second;

    public Pair(i first, s second) {
        this.first = first;
        this.second = second;
    }

    public i getFirst() {
        return first;
    }

    public s getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public static <i, s> Pair <i, s> of(i a, s b)
    {
        return new Pair<>(a, b);
    }
}