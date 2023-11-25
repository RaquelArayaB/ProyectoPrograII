package com.progra.api.usuario.businesslogic;

import java.util.List;

import com.progra.api.usuario.dataAccess.usuarioRepository;
import com.progra.api.usuario.dataTransferObject.usuarioDto;

public class usuarioBL {
    private usuarioRepository usuarioRep;

    public usuarioBL(usuarioRepository repo) {
        this.usuarioRep = repo;
    }
     /**
     * @apiNote Se encarga de obtener todos los registros de la tabla user.
     * @return
     */
    public List<usuarioDto> list() {
        return usuarioRep.findAll();
    }

      /**
     * @apiNote Se encargar de buscar un usuario por el id y retornar un objeto
     *          UserDto
     * @param usuario_id
     * @return
     */
    public usuarioDto get(Long usuario_id) {
        return usuarioRep.findById(usuario_id).orElse(null);
    }

    public usuarioDto login(String usuario, String contraseña) {
        return usuarioRep.findByEmailAndContraseña(usuario, contraseña).orElse(null);
    }

    /**
     * 
     * @param usuario
     * @return
     */
    public usuarioDto add(usuarioDto usuario) {
        return usuarioRep.save(usuario);
    }

    public void delete(Long usuario_id){
        usuarioRep.deleteById(usuario_id);
    }
}
