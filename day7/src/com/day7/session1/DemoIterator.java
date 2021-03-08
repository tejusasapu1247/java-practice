
package com.day7.session1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class School implements Iterable<Student> {
	private List<Student> students;

	public School() {
		this.students = new ArrayList<Student>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public Iterator<Student> iterator() {
		return new StudentIterator();
	}

	class StudentIterator implements Iterator<Student> {
		int index = 0;

		public boolean hasNext() {
			if (index >= students.size())
				return false;
			else
				return true;
		}

		public void remove() {
			students.remove(--index);
		}

		@Override
		public Student next() {
			// TODO Auto-generated method stub
			return students.get(index++);
		}
	}
}

public class DemoIterator {

	public static void main(String[] args) {
		School school = new School();
		school.addStudent(new Student(1, "teju", 200));
		school.addStudent(new Student(121, "raja", 89));
		school.addStudent(new Student(1, "ekta", 92));
		school.addStudent(new Student(10, "rajeev", 99));
		Iterator<Student> it = school.iterator();
		it.next();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// it.remove();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
