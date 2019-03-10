package me.spirng.boot.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import me.spirng.boot.entity.User;
import me.spirng.boot.exception.HttpException;
import me.spirng.boot.repository.UserRepository;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("user")
@Log4j2
public class UserController {

    private UserRepository userRepository;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    //@GetMapping也可以
    private User user(@PathVariable int id){
        int a = 8;
//        User usesr = new User();
//        usesr.setMobliePhone("1029320239");
//        usesr.setName("lis");
       // userRepository.save(usesr);
        User user = userRepository.getOne(2);
        int i =1/0;
        log.info(user);
        return user;
    }
    @GetMapping("/save")
    private User save(@Validated User user, BindingResult result) throws Exception{
        if (result.hasErrors()) {
            ObjectMapper mapper = new ObjectMapper();
            String msg = "";
            throw new Exception("未添加资产,请重新添加");



        }
        return userRepository.save(user);
    }

}
