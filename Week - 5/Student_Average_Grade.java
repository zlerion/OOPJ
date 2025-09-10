class Student {
    String name;
    int rollNumber;
    int[] marks;


    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }


    double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }


    char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }


    void printResult() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        int[] marks = {76, 82, 91, 67};
        Student student = new Student("Zlerion", 16, marks);
        student.printResult();
    }
}