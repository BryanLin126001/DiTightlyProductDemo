package ntt.global.dao;

import ntt.global.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IDao<T>
{
    Optional<T> get(int id);

    List<T> get();
}
