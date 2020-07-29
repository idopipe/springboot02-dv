# springboot02-dv
learn spring boot : second
# steps[2]
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
 
