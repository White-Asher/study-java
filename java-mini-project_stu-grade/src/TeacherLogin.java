public class TeacherLogin {
    private String Id;
    private String Password;
    private String Name;

    public TeacherLogin(String Id, String Password, String Name) {
        super();
        this.Id = Id;
        this.Password = Password;
        this.Name = Name;
    }
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    @Override
    public String toString() {
        return "ID : " + Id + " Password : " + Password + " Name : " + Name;
    }
    public void add() {
        TeacherLogin t = new TeacherLogin(Id, Password, Name);
        t.Id = Prompt.inputString("Id : ");
        t.Password = Prompt.inputString("Password : ");
        t.Name = Prompt.inputString("Name : ");
    }
}
