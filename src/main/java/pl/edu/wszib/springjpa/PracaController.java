package pl.edu.wszib.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springjpa.dao.PracaDao;
import pl.edu.wszib.springjpa.model.Praca;
import pl.edu.wszib.springjpa.model.Praca;

import java.util.List;

@RestController
@RequestMapping("/praca")
public class PracaController {
    
    @Autowired
    private PracaDao dao;

    @GetMapping
    public List<Praca> list() {
        return dao.findAll();
    }

    @GetMapping("/{id}")
    public Praca get(@PathVariable Long id) {
        return dao.findById(id)
                .orElse(null);
    }

    @GetMapping("/stanowisko/{s}")
    public List<Praca> getByStanowisko(@PathVariable String s) {
        return dao.findAllByStanowiskoContains(s);
    }

    @PostMapping
    public Praca create(@RequestBody Praca praca) {
        praca.setId(null);
        return dao.save(praca);
    }

    @PutMapping
    public Praca update(@RequestBody Praca praca) {
        dao.findById(praca.getId()).orElseThrow(() -> new RuntimeException());

        return dao.save(praca);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        dao.deleteById(id);
    }
}
