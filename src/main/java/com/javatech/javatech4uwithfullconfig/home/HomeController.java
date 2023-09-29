package com.javatech.javatech4uwithfullconfig.home;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ai_models.AICategory;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ai_models.AIModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ai_models.AI_Images;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {

        return "user/home";
    }

    @GetMapping("/about")
    public String about(Model model){
          
        return "user/about";
    }

    @GetMapping("/projects")
    public String projects(Model model){
         
        return "user/projects";
    }


    @GetMapping("/portfolio")
    public String portfolio(Model model){
          
        return "user/portfolio";
    }

    @GetMapping("/ai")
    public String ai(Model model){
        AIModel aiModel = new AIModel("ChatGpt","http://localhost:8080/ai#","text","https://img.icons8.com/nolan/64/chatgpt.png","text based ai",new AI_Images("https://img.icons8.com/nolan/64/chatgpt.png"));
        AIModel aiModel2 = new AIModel("ChatGpt","http://localhost:8080/ai#","text","https://img.icons8.com/nolan/64/chatgpt.png","text based ai",new AI_Images("https://img.icons8.com/nolan/64/chatgpt.png"));
        AIModel aiModel3 = new AIModel("ChatGpt","http://localhost:8080/ai#","text","https://img.icons8.com/nolan/64/chatgpt.png","text based ai",new AI_Images("https://img.icons8.com/nolan/64/chatgpt.png"));
        AIModel aiModel4 = new AIModel("ChatGpt","http://localhost:8080/ai#","text","https://img.icons8.com/nolan/64/chatgpt.png","text based ai",new AI_Images("https://img.icons8.com/nolan/64/chatgpt.png"));
        AIModel aiModel5 = new AIModel("ChatGpt","http://localhost:8080/ai#","text","https://img.icons8.com/nolan/64/chatgpt.png","text based ai",new AI_Images("https://img.icons8.com/nolan/64/chatgpt.png"));
        AIModel aiModel6 = new AIModel("ChatGpt","http://localhost:8080/ai#","text","https://img.icons8.com/nolan/64/chatgpt.png","text based ai",new AI_Images("https://img.icons8.com/nolan/64/chatgpt.png"));
        List<AIModel> aiModelList = new ArrayList<>();
        aiModelList.add(aiModel);
        aiModelList.add(aiModel2);
        aiModelList.add(aiModel3);
        aiModelList.add(aiModel4);
        aiModelList.add(aiModel5);
        aiModelList.add(aiModel6);

        AICategory aiCategory = new AICategory(aiModelList,"text");

        List<AICategory> aiCategoryList = new ArrayList<>();
        aiCategoryList.add(aiCategory);

        model.addAttribute("aiCategoryList",aiCategoryList);
        return "user/a.i";
    }

    @GetMapping("/contacts")
    public String contacts(Model model){
          
        return "user/contacts";
    }

    @GetMapping("/profiles")
    public String profiles(Model model){
          
        return "user/profiles";
    }

    @GetMapping("/settings")
    public String settings(Model model){
          
        return "user/settings";
    }

    @GetMapping(value="/sitemap.xml",produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public String sitemap(Model model){
        StringBuilder sitemapXml = new StringBuilder();
        sitemapXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        sitemapXml.append("<urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\">");
        // Add URLs to the sitemap here
        sitemapXml.append("<url>\n" +
                "<loc>https://www.javatech4U.com/</loc>\n" +
                "<lastmod>2023-07-09T11:10:21+00:00</lastmod>\n" +
                "<priority>1.00</priority>\n" +
                "</url>");
        sitemapXml.append("<url><loc>https://example.com/page2</loc></url>");
        sitemapXml.append("</urlset>");
        return sitemapXml.toString();
    }
}
