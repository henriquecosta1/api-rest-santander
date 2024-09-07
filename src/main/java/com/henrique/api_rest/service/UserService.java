package com.henrique.api_rest.service;

import com.henrique.api_rest.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
