package com.example.loginauthapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.loginauthapi.domain.user.User;
import com.example.loginauthapi.repositories.UserRepository;

@SpringBootApplication
public class LoginAuthApiApplication {

	 @Bean
    public CommandLineRunner run(@Autowired UserRepository repository){
        return args -> {
            User usuario1 = User.builder().name("Fulano").email("fulano@teste.com").password("123456789").cargo("Analista").build();
            User usuario2 = User.builder().name("Ciclano Freitas").email("ciclano@teste.com").password("123456789").cargo("Aprovador").build();
            User usuario3 = User.builder().name("David Santana").email("david@teste.com").password("123456789").cargo("aprovador").build();
			User usuario4 = User.builder().name("João Marcos").email("joão@teste.com").password("123456789").cargo("aprovador").build();
            User usuario5 = User.builder().name("Maria").email("maria@teste.com").password("123456789").cargo("analista").build();
            repository.save(usuario1);
            repository.save(usuario2);
            repository.save(usuario3);
			repository.save(usuario4);
            repository.save(usuario5);
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(LoginAuthApiApplication.class, args);
	}

}


