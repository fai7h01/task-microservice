package com.cydeo.client;

import com.cydeo.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-microservice", url = "localhost:8081")
public interface UserClient {

    @GetMapping("/api/v1/user/check/{username}")
    ResponseEntity<UserResponse> checkUserExistsByUsername(@PathVariable("username") String username);

}
