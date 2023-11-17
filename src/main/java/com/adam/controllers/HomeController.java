package com.adam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adam.entity.Pelanggan;
import com.adam.service.PelangganService;

@Controller
@RequestMapping("")
public class HomeController {

  @Autowired
  private PelangganService pelangganService;

  @GetMapping
  public String welcome(Model model) {
    model.addAttribute("pelanggans", pelangganService.findAll());
    return "index";
  }

  @GetMapping("/add")
  public String add(Model model) {
    model.addAttribute("pelanggan", new Pelanggan());
    return "add";
  }

  @PostMapping("/save")
  public String save(Pelanggan pelanggan) {
    pelangganService.addPelanggan(pelanggan);
    return "redirect:/";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable("id") Long id) {
    pelangganService.deleteById(id);
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String edit(@PathVariable("id") Long id, Model model) {
    model.addAttribute("pelanggan", pelangganService.findById(id));
    return "edit";
  }

  @PostMapping("/update")
  public String update(Pelanggan pelanggan) {
    pelangganService.updatePelanggan(pelanggan);
    return "redirect:/";
  }

}
