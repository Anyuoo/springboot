package com.anyu.springbootupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

@RestController
public class UploadController {
    @PostMapping("/fileuploadController")
    public String fileUpLoad(MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("f:/"+file.getOriginalFilename()));
        return "ok";
    }
}
