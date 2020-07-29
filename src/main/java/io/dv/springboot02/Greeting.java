package io.dv.springboot02;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Greeting {
    private  long id;
    private  String content;
}