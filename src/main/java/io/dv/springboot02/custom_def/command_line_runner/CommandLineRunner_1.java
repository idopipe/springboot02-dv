package io.dv.springboot02.custom_def.command_line_runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

@Order(1)
public interface CommandLineRunner_1 extends CommandLineRunner{}