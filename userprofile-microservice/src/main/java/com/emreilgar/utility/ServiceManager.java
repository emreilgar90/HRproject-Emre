package com.emreilgar.utility;


import com.emreilgar.repository.IUserProfileRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public class ServiceManager<T,ID> implements IService<T,ID> {

    private final MongoRepository<T,ID> repository;
    public ServiceManager(IUserProfileRepository repository, MongoRepository<T, ID> repository1){

        this.repository = repository1;
    }
    @Override
    public T save(T t) {

        return repository.save(t);
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> t) {

        return repository.saveAll(t);
    }

    @Override
    public T update(T t) {

        return repository.save(t);
    }

    @Override
    public void delete(T t) {

        repository.delete(t);
    }

    @Override
    public void deleteById(ID id) {

        repository.deleteById(id);
    }

    @Override
    public List<T> findAll() {

        return repository.findAll();
    }

    @Override
    public Optional<T> findById(ID id) {

        return repository.findById(id);
    }
}
