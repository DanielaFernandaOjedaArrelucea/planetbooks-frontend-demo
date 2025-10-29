package com.planetbooks.controllers;

import com.planetbooks.models.Cliente;
import com.planetbooks.repositories.ClienteRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
public class clientesController {

    @Autowired
    private ClienteRepository clienteRepository;

    public clientesController() {}

    @GetMapping({"/clientes"})
    public String mostrarClientes(HttpServletRequest request, Model model) {
        List<Cliente> clientes = clienteRepository.findByActivoTrue();
        model.addAttribute("clientes", clientes);
        model.addAttribute("totalClientes", clientes.size());
        model.addAttribute("currentPath", request.getRequestURI());
        return "admin/clientes";
    }

    
    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable Long id) {
        Cliente c = clienteRepository.findById(id).orElse(null);
        if (c != null) {
            c.setActivo(false);
            clienteRepository.save(c);
        }
        return "redirect:/clientes";
    }


    
     @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        if (cliente.isPresent()) {
            model.addAttribute("cliente", cliente.get());
            return "admin/editar_cliente"; 
        } else {
            return "redirect:/clientes";
        }
    }
   

    @PostMapping("/actualizar")
    public String actualizarCliente(@Valid @ModelAttribute Cliente clienteForm, BindingResult result, Model model) {
    if (result.hasErrors()) {
        model.addAttribute("cliente", clienteForm);
        return "admin/editar_cliente";
    }
    Cliente clienteBD = clienteRepository.findById(clienteForm.getId()).orElse(null);
    if (clienteBD != null) {
        clienteBD.setNombre(clienteForm.getNombre());
        clienteBD.setApellido_paterno(clienteForm.getApellido_paterno());
        clienteBD.setApellido_materno(clienteForm.getApellido_materno());
        clienteBD.setEdad(clienteForm.getEdad());
        clienteBD.setUsuario(clienteForm.getUsuario());
        clienteBD.setCorreo(clienteForm.getCorreo());
        clienteBD.setPais(clienteForm.getPais());
        clienteRepository.save(clienteBD);
    }
    return "redirect:/clientes";
}


    @GetMapping("/eliminados")
    public String mostrarEliminados(Model model) {
        List<Cliente> clientesEliminados = clienteRepository.findByActivoFalse();
        model.addAttribute("clientes", clientesEliminados);
        return "admin/clientes_eliminados";
    }


    @GetMapping("/restaurar/{id}")
    public String restaurarCliente(@PathVariable Long id) {
        Cliente c = clienteRepository.findById(id).orElse(null);
        if (c != null) {
            c.setActivo(true);
            clienteRepository.save(c);
        }
        return "redirect:/clientes";
    }

    @PostMapping("/clientes/registrar")
    public String registrarCliente(@Valid @ModelAttribute Cliente cliente, BindingResult result, Model model) {
        if (result.hasErrors()) {
        // Si hay errores de validación, volvemos al formulario
        return "Crear_cuenta";
    }
    // Inicializar valores por defecto
        cliente.setActivo(true);
        cliente.setCompras(0);
        cliente.setSesiones(0);
        cliente.setFechaRegistro(LocalDate.now());

        clienteRepository.save(cliente);
        return "redirect:/"; 
    }

    @GetMapping("/clientes/crear")
        public String mostrarFormularioCrearCuenta(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "Crear_cuenta"; 
    }

}
