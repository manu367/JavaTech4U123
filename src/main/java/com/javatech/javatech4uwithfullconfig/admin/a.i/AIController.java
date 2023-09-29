package com.javatech.javatech4uwithfullconfig.admin.a.i;

import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ai_models.AICategory;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ai_models.AIModel;
import com.javatech.javatech4uwithfullconfig.data_source_opterations.models.ai_models.AI_Images;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AIController {

    @GetMapping("/admin/a.i")
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
        return "admin/a.i_all";
    }

    @GetMapping("/admin/a.i/add")
    public String add_ai(Model model){
        return "admin/a.i_add";
    }
}
