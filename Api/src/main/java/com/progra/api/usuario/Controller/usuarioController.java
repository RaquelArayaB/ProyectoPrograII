package com.progra.api.usuario.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progra.api.usuario.businesslogic.usuarioBL;
import com.progra.api.usuario.dataAccess.usuarioRepository;
import com.progra.api.usuario.dataTransferObject.usuarioDto;

@RestController
@CrossOrigin
@RequestMapping("api/usuario")

public class usuarioController {

    @Autowired
    private usuarioRepository usuarioRep;

    /*
     * Metodo que se encarga de retornar la lista de todos los usuarios
     * 
     */
    @GetMapping
    public List<usuarioDto> usuarioList() {
        usuarioBL userBl = new usuarioBL(usuarioRep);
        return userBl.list();
    }

    /* Metodo que se encarga de retornar un usuario en especifico */
   @GetMapping("/{id}")
    public usuarioDto userGet(@PathVariable Long id) {
        usuarioBL _userBl = new usuarioBL(usuarioRep);
        return _userBl.get(id);
    }

    @PostMapping("/add")
    public usuarioDto add(@RequestBody usuarioDto user) {
        usuarioBL _userBl = new usuarioBL(usuarioRep);
        return _userBl.add(user);
    }

    @PostMapping("/login")
    public ResponseEntity<usuarioDto> login(@RequestBody usuarioDto usuario) {
        usuarioBL _userBl = new usuarioBL(usuarioRep);
        var resultado = _userBl.login(usuario.getEmail(), usuario.getContraseña());

        if (resultado != null) {
            return ResponseEntity.ok(resultado);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarUsuario(@PathVariable Long id) {
        usuarioBL _userBl = new usuarioBL(usuarioRep);
        _userBl.delete(id);
        return ResponseEntity.ok("Usuario eliminado con éxito");
    }
}
