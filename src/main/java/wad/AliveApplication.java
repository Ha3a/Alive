package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/Ha3a/Alive";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/Ha3a/Alive";
    }

    public static String herokuUrl() {
        return "https://rocky-spire-33063.herokuapp.com/";
    }
}
