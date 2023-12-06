package com.bengagi.springproject.Services;

import org.springframework.stereotype.Service;

import java.util.List;

public interface IInscriptionService <T>{

    T add(T t);
    List<T> addAll(List<T> t);
    T getById(long id);
    public List<T> findAll();
    T update(T t);
    void delete(T t);
    void deleteById(long id);





}
