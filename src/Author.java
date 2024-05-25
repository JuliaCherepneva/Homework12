import java.util.Objects;

public class Author {
    private final String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return name.equals(author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


}
