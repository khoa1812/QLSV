package QLHS;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
    List<Student> list = new ArrayList<>();
    ManageStudent() {
        list.add(new Student(1, "A",9, 10));
        list.add(new Student(2, "B",9, 10));

    }

    public void add(Student student) {
        list.add(student);
    }

    public void update(int id, Student student) {
        int index = -1;
        for (int i = 0; i < this.list.size(); i++) {

            if (id == this.list.get(i).getId()) {
                index = i;
            }
        }
        this.list.set(index, student);
    }
    public void delete(int id) {
        int index = -1;
        for (int i = 0; i < this.list.size(); i++) {
            if (id == this.list.get(i).getId()) {
                index = i;
            }
        }
        this.list.remove(index);
    }

    public void findAll() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i));
        }
    }

    public void findAll(String name) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getName().equals(name)) {
                System.out.println(this.list.get(i));
            }
        }
    }
}
