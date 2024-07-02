package com.hutech.webbanhang.controller;



import com.hutech.webbanhang.model.Article;
import com.hutech.webbanhang.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping
    public String getAllArticles(Model model) {
        model.addAttribute("articles", articleService.getAllArticles());
        return "/article/articles";
    }

    @GetMapping("/detail/{id}")
    public String getArticleDetail(@PathVariable Long id, Model model) {
        model.addAttribute("article", articleService.getArticleById(id).orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + id)));
        return "/article/article-detail";
    }

    @GetMapping("/add")
    public String showAddArticleForm(Model model) {
        model.addAttribute("article", new Article());
        return "/article/article-form";
    }

    @PostMapping("/add")
    public String addArticle(@ModelAttribute Article article) {
        articleService.addArticle(article);
        return "/article/articles";
    }

    @GetMapping("/edit/{id}")
    public String showEditArticleForm(@PathVariable Long id, Model model) {
        model.addAttribute("article", articleService.getArticleById(id).orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + id)));
        return "/article/article-form";
    }

    @PostMapping("/edit/{id}")
    public String editArticle(@PathVariable Long id, @ModelAttribute Article article) {
        article.setId(id);
        articleService.updateArticle(article);
        return "redirect:/articles";
    }

    @GetMapping("/delete/{id}")
    public String deleteArticle(@PathVariable Long id) {
        articleService.deleteArticleById(id);
        return "redirect:/articles";
    }
}

