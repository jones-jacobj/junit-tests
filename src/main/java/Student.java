public class Student {
    private String name;
    private long id;

    public Student(String name, long id){
        this.name=name;
        this.id=id;
    }

    public String getName(){return this.name;}
    public long getId(){return this.id;}
}
