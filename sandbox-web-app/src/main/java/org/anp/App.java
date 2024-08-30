package org.anp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import java.time.Instant;

import java.util.TimerTask;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}

@RestController
@RequestMapping("/app")
class AppController{
    @GetMapping("/health")
    public Mono<ResponseEntity<String>> healthCheck(){
        return Mono.just(ResponseEntity.ok("Working"));
    }
    @GetMapping("/instant")
    public Mono<ResponseEntity<Instant>> instant(){
        return Mono.just(ResponseEntity.ok(Instant.now()));
    }
}


