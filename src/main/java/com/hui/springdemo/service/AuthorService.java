package com.hui.springdemo.service;

import com.hui.springdemo.model.Auth;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AuthorService {
    Auth updateAuthor();

    Auth saveAuthor(Auth auth);

    Auth updateAuthor(Auth auth);

    public Auth findByAutor(Long id);

    void deleteAuthor(Long id);
}
