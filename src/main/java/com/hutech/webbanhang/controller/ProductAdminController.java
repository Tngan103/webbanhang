package com.hutech.webbanhang.controller;


import com.hutech.webbanhang.model.Product;
import com.hutech.webbanhang.service.CategoryService;
import com.hutech.webbanhang.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


@Controller
@RequestMapping("/products-admin")
public class ProductAdminController {
    @GetMapping("/choxacnhan")
    public String choxacnhan() {
        return "/products-admin/choxacnhan";
    }
    @GetMapping("/danggiao")
    public String danggiao() {
        return "/products-admin/danggiao";
    }
    @GetMapping("/daxacnhan")
    public String daxacnhan() {
        return "/products-admin/daxacnhan";
    }
    @GetMapping("/lichsu")
    public String lichsu() {
        return "/products-admin/lichsu";
    }
    @GetMapping("/sanpham")
    public String sanpham() {
        return "/products-admin/sanpham";
    }
    @GetMapping("/themsanpham")
    public String themsanpham() {
        return "/products-admin/themsanpham";
    }
    @GetMapping("/thongtinkhachhang")
    public String thongtinkhachhang() {
        return "/products-admin/thongtinkhachhang";
    }
}
