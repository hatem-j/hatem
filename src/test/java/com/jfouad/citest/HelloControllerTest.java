package com.jfouad.citest;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {

    @Test
    public void should_return_helloWorld_when_params_isNull() {
        HelloController helloController = new HelloController();

        assertThat(helloController.index(null)).isEqualTo("Hello world !");
    }

    @Test
    public void should_return_helloWorld_name_when_params_isNotNull() {
        HelloController helloController = new HelloController();

        assertThat(helloController.index("Fouad")).isEqualTo("Hello Fouad");
    }

}
