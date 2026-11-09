package com.onboarding2026.org.service;

import com.onboarding2026.org.model.Usuario;
import com.onboarding2026.org.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario atualizar(Usuario usuario) {
        usuario.setNome(usuario.getNome());
        usuario.setEmail(usuario.getEmail());
        usuario.setSenha(usuario.getSenha());
        return usuarioRepository.save(usuario);
    }

    public void deletar(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }
}
