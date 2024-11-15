// File: src/main/java/ma/mundiapolis/tp3_gere_patient/Tp3GerePatientApplication.java
package ma.mundiapolis.tp3_gere_patient;

import ma.mundiapolis.tp3_gere_patient.entities.Patient;
import ma.mundiapolis.tp3_gere_patient.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Tp3GerePatientApplication {


    public static void main(String[] args) {
        SpringApplication.run(Tp3GerePatientApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null, "Mohamed",new Date(), "Mohamed@@gmail.com", true, 50 ));
            patientRepository.save(new Patient(null, "Yassine",new Date(), "Yassine@@gmail.com", true, 50 ));
            patientRepository.save(new Patient(null, "Omar",new Date(), "Omar@@gmail.com", true, 50 ));
        };
    }

}

