package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // REMOVIDO: Mapeamento duplicado de "/"
    // @GetMapping("/")
    // public String index() {
    //     return "redirect:/carros";
    // }

    // Mostrar lista de carros
    @GetMapping("/carros")
    public String showCarros(Model model) {
        model.addAttribute("cars", carRepository.findAll());
        return "carros"; // template: carros.html
    }

    @GetMapping("/cadastro-carro")
    public String showCadastroForm(Model model) {
        model.addAttribute("car", new CarModel());
        return "cadastro-carro";
    }

    @PostMapping("/cadastro-carro")
    public String processCadastro(@ModelAttribute CarModel car) {
        carRepository.save(car);
        return "redirect:/carros";
    }

    @GetMapping("/editar-carro/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<CarModel> car = carRepository.findById(id);
        if (car.isPresent()) {
            model.addAttribute("car", car.get());
            return "editar-carro";
        } else {
            return "redirect:/carros";
        }
    }

    @PostMapping("/editar-carro/{id}")
    public String updateCar(@PathVariable Long id, @ModelAttribute CarModel updatedCar) {
        return carRepository.findById(id).map(car -> {
            car.setAno(updatedCar.getAno());
            car.setModelo(updatedCar.getModelo());
            car.setPotencia(updatedCar.getPotencia());
            carRepository.save(car);
            return "redirect:/carros";
        }).orElse("redirect:/carros");
    }

    @GetMapping("/excluir-carro/{id}")
    public String deleteCar(@PathVariable Long id) {
        carRepository.deleteById(id);
        return "redirect:/carros";
    }
}
