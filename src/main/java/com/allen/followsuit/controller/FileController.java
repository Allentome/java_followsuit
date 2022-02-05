package com.allen.followsuit.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
//
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/update")
public class FileController {

    @RequestMapping("/photos")
    public List<String> uploadMutipartFile(MultipartFile[] photos,HttpServletRequest request) throws Exception {
        List<String> ps = new ArrayList<String>();
        if(photos == null) {
            ps.add("no files");
            return ps;
        }
        for(MultipartFile f : photos) {
//            System.out.println(f.getOriginalFilename());
            String old_name = f.getOriginalFilename(); //原始文件名
//            String path = "F:/javawork/followsuit/src/main/resources/static/upload/photos"; //上传位置：工程/static/upload/photos
            String path = request.getRealPath("/upload/photos");
            System.out.println(path);
            File fx = new File(path);
            if(!fx.exists()) {
                fx.mkdirs();
            }
            File n = new File(fx, old_name);
            f.transferTo(n);
            ps.add(n.getPath());
        }
        return ps;
    }

}
