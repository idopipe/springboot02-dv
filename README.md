# springboot02-dv
learn spring boot : second
# steps[3]
1. restfull api with springmvc 
  - @RestController [== 
    - @Controller[== 
      - @Component register bean to String Container world] 
    - @ResponseBody [= define return json data ,but not view with template like jsp]]
2. use lombok
    - install
      - import with gradle 
        ```
        compileOnly 'org.projectlombok:lombok'
        annotationProcessor 'org.projectlombok:lombok'
        ```
      - install ide[vscode] plugin
        - extend page 
          - search lombok and install
    - use
      - @Data [== @Code @Getter @Setter @ToString @HashAndEquals @RequiredArgsConstructor]
      - @Builder linked setter implemted with inner class 
3. consum self rest api 
  - RestTemplate : convert json to object provide by springframework.web.client
  - CommandLineRunner : auto run after application is started implemented by SpringApplication class;
  ```
  import org.springframework.context.annotation.Configuration;
  import org.springframework.boot.CommandLineRunner;
  import org.springframework.boot.web.client.RestTemplateBuilder;
  import org.springframework.context.annotation.Bean;
  import org.springframework.web.client.RestTemplate;
  import lombok.extern.slf4j.Slf4j;

  @Configuration
  @Slf4j
  public class GreetingConsumer{

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
      return builder.build();
    }

    @Bean
    CommandLineRunner run(RestTemplate restTemplate) throws Exception {
      return args -> {
        log.info("=========>befor consurm local greeting api");
        log.info(restTemplate.getForObject("http://localhost:8080/greeting", Greeting.class).toString());
        log.info("=========>after consurm local greeting api");
          };
      }
  }
  ```
