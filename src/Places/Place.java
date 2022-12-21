package Places;

import java.util.Objects;

public abstract class Place {
    private String name;

    public void setName(String sname){
        this.name = sname;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;
        Place other = (Place) otherObject;
        return name.equals(other.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() +
                "[name='" + name + '\'' +
                ']';

    }
}
