package com.planetbooks.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reportes")
public class dashboardController {

    public dashboardController() { }

    @GetMapping("/ventas")
    public String reporteVentas(HttpServletRequest request, Model model) {
        model.addAttribute("currentPath", request.getRequestURI());
        model.addAttribute("activeTab", "ventas");
        return "admin/dash-ventas";
    }

    @GetMapping("/libros")
    public String reporteLibros(HttpServletRequest request, Model model) {
        model.addAttribute("currentPath", request.getRequestURI());
        model.addAttribute("activeTab", "libros");
        return "admin/dash-libros";
    }

    @GetMapping("/clientes")
    public String reporteClientes(HttpServletRequest request, Model model) {
        model.addAttribute("currentPath", request.getRequestURI());
        model.addAttribute("activeTab", "clientes");
        return "admin/dash-cliente";
    }

    @GetMapping("/fallos")
    public String reporteFallos(HttpServletRequest request, Model model) {
        model.addAttribute("currentPath", request.getRequestURI());
        model.addAttribute("activeTab", "fallos");
        return "admin/dash-fallos";
    }
}


