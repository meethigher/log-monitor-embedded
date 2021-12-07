package top.meethigher.logmonitorembedded;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("top.meethigher.logmonitorembedded")
public class LogMonitorEmbeddedApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogMonitorEmbeddedApplication.class, args);
    }

}
