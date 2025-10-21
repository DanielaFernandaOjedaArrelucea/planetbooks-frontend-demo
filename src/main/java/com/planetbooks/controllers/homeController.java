package com.planetbooks.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
   public homeController() {
   }

   @GetMapping({"/inicio"})
   public String catalogo(HttpServletRequest request, Model model) {
      model.addAttribute("currentPath", request.getRequestURI());
      return "admin/inicio";
   }
}