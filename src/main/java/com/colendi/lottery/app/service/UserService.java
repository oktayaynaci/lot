package com.colendi.lottery.app.service;

import com.colendi.lottery.app.data.models.User;
import com.colendi.lottery.app.data.payloads.request.UserRequest;
import com.colendi.lottery.app.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;


@Component
public interface UserService {
    MessageResponse createUser(UserRequest userRequest);

    Optional<User> updateUser(Integer userId, UserRequest userRequest);

    void deleteUser(Integer id);

    User getASingleUser(Integer id);

    List<User> getAllUser();


}

