package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 10448 on 2017/12/20.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
