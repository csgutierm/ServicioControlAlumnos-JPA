package com.edutecno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.edutecno.model.Alumno;
import com.edutecno.service.AlumnoService;
import com.edutecno.service.DireccionService;

@Controller
@RequestMapping({ "/", "alumnos" })
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;

	@Autowired
	private DireccionService direccionService;

	@GetMapping("/crear")
	public ModelAndView crear() {

		ModelAndView modelAndView = new ModelAndView("crear-alumno");
		modelAndView.addObject("alumno", new Alumno());
		modelAndView.addObject("direcciones", direccionService.findAll());

		return modelAndView;

	}

	@PostMapping("/crear")
	public RedirectView crear(@ModelAttribute Alumno alumno) {

		if (alumno.getDireccion() != null) {
			alumnoService.save(alumno);
		} else {
			System.out.println("Es necesaria al menos una direccion para guardar");
		}

		// return new ModelAndView("redirect:/alumnos")
		return new RedirectView("/alumnos");
	}

	@GetMapping
	public ModelAndView alumnos() {
		ModelAndView modelAndView = new ModelAndView("alumnos");
//		otra forma para hacer el add (con un set)
//		modelAndView.setViewName("alumnos");
		modelAndView.addObject("alumnos", alumnoService.findAll());
		return modelAndView;
	}

//SECCION SIN ANALIZAR	
	// agregados
	@GetMapping("/editar")
	public ModelAndView editar(@RequestParam Integer id) {
		System.out.println(id);
		ModelAndView modelAndView = new ModelAndView("editar-alumno");
		modelAndView.addObject("alumno", new Alumno());
		modelAndView.addObject("alumnoVO", alumnoService.findById(id));
		modelAndView.addObject("direcciones", direccionService.findAll());

		return modelAndView;
	}

	@PostMapping("/editar")
	public RedirectView editar(@ModelAttribute Alumno alumno) {
		alumnoService.save(alumno);
		// return new ModelAndView("redirect:/alumnos")
		return new RedirectView("/alumnos");
	}

	@GetMapping("/eliminar")
	public RedirectView eliminar(@RequestParam Integer id) {
		Alumno alumno = alumnoService.findById(id);
		if (alumno.getId() != null) {
			alumnoService.delete(alumno);
		}
		return new RedirectView("/alumnos");

	}
}
