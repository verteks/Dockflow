package com.example.demo.services;

import com.example.demo.dto.IdDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserOutDTO;
import com.example.demo.entities.SysUser;
import com.example.demo.entities.SystemRole;
import com.example.demo.entities.User;
import com.example.demo.repositories.SysUserRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SysUserServiceImp implements SysUserService {

    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public SysUser create(UserDTO userDTO) {
        SysUser user = new SysUser();
       // SysUser user = new SysUser(userDTO.getName(),userDTO.getPassword(),SystemRole.admin);

        user.setLogin(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        user.setRole(SystemRole.admin);

        return sysUserRepository.save(user);
    }

    @Override
    public void delete(IdDTO idDTO) {
        Optional<SysUser> user = sysUserRepository.findById(idDTO.getId());
        if (user.isPresent()){
            sysUserRepository.delete(user.get());
        }

    }

    @Override
    public SysUser update(UserDTO UserDTO) {
        return null;
    }

    @Override
    public UserOutDTO getUser(IdDTO idDTO) {
        return null;
    }

    @Override
    public List<SysUser> getAllUsers() {
        return sysUserRepository.findAll();
    }
}
