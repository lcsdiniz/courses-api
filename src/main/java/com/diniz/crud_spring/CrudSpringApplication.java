package com.diniz.crud_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.diniz.crud_spring.enums.Category;
import com.diniz.crud_spring.model.Course;
import com.diniz.crud_spring.model.Lesson;
import com.diniz.crud_spring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	@Profile("dev")
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return _ -> {
			courseRepository.deleteAll();

			for( int i=0; i<20;i++) {
				Course c = new Course();
				c.setName("Angular com Spring " + i);
				c.setCategory(Category.FRONT_END);

				Lesson l = new Lesson();
				l.setName("Introdução");
				l.setYoutubeUrl("qwertyuiopa");
				l.setCourse(c);
				c.getLessons().add(l);

				Lesson l2 = new Lesson();
				l2.setName("HTML5");
				l2.setYoutubeUrl("Awertyuiopa");
				l2.setCourse(c);
				c.getLessons().add(l2);
				courseRepository.save(c);
			}

		};
	}
}
