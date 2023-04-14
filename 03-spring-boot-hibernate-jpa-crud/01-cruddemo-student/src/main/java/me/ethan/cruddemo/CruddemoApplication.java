package me.ethan.cruddemo;

import me.ethan.cruddemo.dao.StudentDAO;
import me.ethan.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

			return runner -> {
				//createStudent(studentDAO);

				createMultipleStudents(studentDAO);

				//readStudent(studentDAO);

				//queryForStudents(studentDAO);

				//queryForStudentsByLastName(studentDAO);

				//updateStudent(studentDAO);

				//deleteStudent(studentDAO);
				
				//deleteAll(studentDAO);
			};
	}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println("Deleting all Students");
		int numRowsDeleted = studentDAO.deleteAllStudents();
		System.out.println("Deleted row count: "+ numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {

		int studentId = 3;
		System.out.println("Deleting student with id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student base on the id: primary key
		int studentId = 1;
		System.out.println("Getting student with id: "+ studentId);
		Student myStudent = studentDAO.findById(studentId);

		// change first name to "Scooby"
		myStudent.setFirstName("Scooby");

		// update the student

		studentDAO.update(myStudent);
		// display the updated student
		System.out.println(myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Duck");
		// display the list of students
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findAll();
		// display the list of students
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object
		System.out.println("Creating a new student object...");
		Student tempStudent = new Student("Daffy","Duck","quack@gmail.com");

		// save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();;
		System.out.println("Saved student ID :" + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving Student with Id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println(myStudent);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple students
		System.out.println("Creating new student object");
		Student tempStudent1 = new Student("John","Doe","johndoe@gmail.com");
		Student tempStudent2 = new Student("Ethan","Doe","ethandoe@gmail.com");
		Student tempStudent3 = new Student("Mom","Doe","momdoe@gmail.com");

		// save the student objects
		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object");
		Student tempStudent = new Student("Paul","Doe","pauldoe@gmail.com");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);
		// display id of the saved student
		System.out.println("Saved student ID :" + tempStudent.getId());

	}


}

