package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {

}

public String listPosts( ...ModelMap ) {
  @RequestMapping("/");
  ModelMap.put("title, Blog Post 1");
  return "home";
}
