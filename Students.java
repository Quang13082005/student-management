public class Students {
    private String studentName;
    private String studentId;
    private String gender;
    private String address;
    private int age;

    // Constructor
    public Students(String studentName, String studentId, String gender, String address, int age) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    // Getter, Setter
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods
    @Override
    public String toString() {
        return "Students{" +
                "studentName='" + studentName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
