package com.hui.springdemo.service.serveimp;

import com.hui.springdemo.model.Auth;
import com.hui.springdemo.model.AuthResposity;
import com.hui.springdemo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorServiceImp implements AuthorService {
    @Autowired
    private AuthResposity authResposity;

    @Override
    public Auth updateAuthor() {
        return null;
    }

    @Override
    public Auth saveAuthor(Auth auth) {
        return authResposity.save(auth);
    }

    @Override
    public Auth updateAuthor(Auth auth) {
        return null;
    }

    @Override
    public Auth findByAutor(Long id) {
        return null;
    }

    @Override
    public void deleteAuthor(Long id) {
        authResposity.deleteById(id);
    }
}
