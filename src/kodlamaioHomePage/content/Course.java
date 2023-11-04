package kodlamaioHomePage.content;

public class Course {
    private String name;
    private String desc;
    private String teacher;
    private int price;

    public Course() {
    }

    public Course(String name, String desc, String teacher, int price, String category_name) {
        this.name = name;
        this.desc = desc;
        this.teacher = teacher;
        this.price = price;
        this.category_name = category_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    private String category_name;



}
