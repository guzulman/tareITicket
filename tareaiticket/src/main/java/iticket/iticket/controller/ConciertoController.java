/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iticket.iticket.controller;

import iticket.iticket.entity.Artista;
import iticket.iticket.entity.Concierto;
import iticket.iticket.service.IArtistaService;
import iticket.iticket.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ConciertoController {

    @Autowired
    private IConciertoService conciertoService;

    @Autowired
    private IArtistaService artistaService;

    @GetMapping("/conciertos")
    public String index(Model model) {
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Tabla Conciertos");
        model.addAttribute("conciertos", listaConcierto);
        return "conciertos";
    }
    
    @GetMapping("/test")
    
    public String x(){
        return "conciertos";
    }

    @GetMapping("/conciertoN")
    public String crearConcierto(Model model) {
        List<Artista> listaArtistas = artistaService.listArtista();
        model.addAttribute("concierto", new Concierto());
        model.addAttribute("conciertos", listaArtistas);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarConcierto(@PathVariable("id") Long idConcierto) {
        conciertoService.delete(idConcierto);
        return "redirect:/conciertos";
    }

    @PostMapping("/save")
    public String guardarConcierto(@ModelAttribute Concierto concierto) {
        conciertoService.saveConcierto(concierto);
        return "redirect:/concierto";
    }

    @GetMapping("/editConcierto/{id}")
    public String editarConcierto(@PathVariable("id") Long idConcierto, Model model) {
        Concierto concierto = conciertoService.getConciertoById(idConcierto);
        List<Artista> listArtistas = artistaService.listArtista();
        model.addAttribute("concierto", concierto);
        model.addAttribute("artistas", listArtistas);
        return "crear";
    }
}
