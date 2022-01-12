package com.techsharezone.blog.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

/*
 * @created 12/01/2022 -15:23
 * @project blog
 * @author  saurabhshcs
 */

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model:Model): String{
        model["title"] = "Blog"
        return "blog";
    }
 }