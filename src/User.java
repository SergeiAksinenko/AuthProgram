public class User {
    private int id;
    private String login;
    private String password;

    public User(int id,String login,String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }
    public User(){

    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}
