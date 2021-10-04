package be.intecbrussel;

public interface SomeRepository {
    String save(String s);

    boolean isSaved(String s);

    void delete(String s);
}
