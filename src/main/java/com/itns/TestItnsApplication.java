package com.itns;

import com.itns.dao.BesoinDao;
import com.itns.dao.ConversationDao;
import com.itns.dao.PropectDao;
import com.itns.dao.SocietyDao;
import com.itns.entities.Propect;
import com.itns.entities.Society;
import net.bytebuddy.utility.RandomString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class TestItnsApplication {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(TestItnsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PropectDao propectDao, BesoinDao besoinDao, ConversationDao conversationDao, SocietyDao societyDao) {
        return args -> {

            Random rnd=new Random();

            societyDao.deleteAll();
            conversationDao.deleteAll();
            besoinDao.deleteAll();
            propectDao.deleteAll();

            for (int i = 0; i < 4; i++) {
                Society society=new Society();
                society.setNom(RandomString.make(6).toLowerCase());
                society.setAddress(RandomString.make(6).toLowerCase());
                society.setTel1(RandomString.make(6).toLowerCase());
                society.setTel2(RandomString.make(6).toLowerCase());
                society.setSector(RandomString.make(6).toLowerCase());
                society.setActivity(RandomString.make(6).toLowerCase());
                society.setDroits(RandomString.make(6).toLowerCase());
                society.setCodePostale(RandomString.make(6).toLowerCase());
                society.setVille(RandomString.make(6).toLowerCase());
                society.setNotes(RandomString.make(6).toLowerCase());
                society.setPrecision(RandomString.make(6).toLowerCase());
                society.setEmail(RandomString.make(6).toLowerCase());
                society.setLinkedIn(RandomString.make(6).toLowerCase());
                society.setPropects(new ArrayList<>());
                Society s1 = societyDao.save(society);
                logger.info("Getting users with user-id= {}.", s1.getId());
                for (int j = 0; j < 15; j++) {
                    Propect propect=new Propect();
                    propect.setNom(RandomString.make(6).toLowerCase());
                    propect.setTitre(RandomString.make(6).toLowerCase());
                    propect.setPrenom(RandomString.make(6).toLowerCase());
                    propect.setTel(RandomString.make(6).toLowerCase());
                    propect.setEmail(RandomString.make(6).toLowerCase());
                    propect.setLinkedIn(RandomString.make(6).toLowerCase());
                    propect.setObservations(RandomString.make(6).toLowerCase());
                    propect.setRappel(new Date());
                    propect.setSociety(s1);
                    propectDao.save(propect);
                    s1.getPropects().add(propect);
                    societyDao.save(s1);
                }




            }



            societyDao.findAll().forEach(society -> {
                System.out.println(society.toString());
            });

            propectDao.findAll().forEach(society -> {
                System.out.println(society.toString());
            });


        };
    }

}
