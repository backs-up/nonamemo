package com.backsup.nonamemo.service;


import com.backsup.nonamemo.document.user.User;
import com.backsup.nonamemo.dto.user.SignUpDTO;
import com.backsup.nonamemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public boolean signup(SignUpDTO signUpDTO) {
        String password = passwordEncoder.encode(signUpDTO.getPassword());
        signUpDTO.setPassword(password);

        User newUser = User.newInstance(signUpDTO);

        try {
            userRepository.save(newUser);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
