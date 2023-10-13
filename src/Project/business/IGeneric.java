package Project.business;

import java.util.List;

public interface IGeneric<E> {
    List<E> findAll();

    void save(E e);

    void update(E e);

    void delete(int id);
}
