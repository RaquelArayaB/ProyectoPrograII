package com.progra.api;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
 
@Configuration
public class CorsConfig {
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("*"); // Permite todas las origenes, puedes especificar un origen específico si lo prefieres
        configuration.addAllowedMethod("*"); // Permite todos los métodos HTTP (GET, POST, etc.)
        configuration.addAllowedHeader("*"); // Permite todas las cabeceras
 
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
 
        return source;
    }
}