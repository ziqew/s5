package sample.reactive.s5.rx.repository;

public interface BlockingRepository<T> {

    void save(T value);

    T findFirst();

    Iterable<T> findAll();

    T findById(String id);
}
