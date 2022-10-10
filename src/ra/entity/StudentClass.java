package ra.entity;

public class StudentClass implements IStudentManagement{

    @Override
    public void inputData() {

    }

    @Override
    public void displayData() {

    }

    private String ClassId;
    private String ClassName;
    private String Descriptions;
    private int ClassStatus;

    public StudentClass(){

    }

    public StudentClass(String classId, String className,
                        String descriptions, int classStatus) {
        ClassId = classId;
        ClassName = className;
        Descriptions = descriptions;
        ClassStatus = classStatus;
    }

    public String getClassId() {
        return ClassId;
    }

    public void setClassId(String classId) {
        ClassId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getDescriptions() {
        return Descriptions;
    }

    public void setDescriptions(String descriptions) {
        Descriptions = descriptions;
    }

    public int getClassStatus() {
        return ClassStatus;
    }

    public void setClassStatus(int classStatus) {
        ClassStatus = classStatus;
    }


}
