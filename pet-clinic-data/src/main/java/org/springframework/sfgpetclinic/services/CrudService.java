package org.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findaAll();

    T findById(ID id);

    T save(T object);

    void delete(T t);

    void deleteById(ID id);
}

