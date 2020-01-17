public class Faculty extends Employee {

    private String hours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email){
        super(name, address, phoneNumber, email);
    }

    public Faculty(String name, String address, String phoneNumber, String email, String hours, String rank){
        super(name, address, phoneNumber, email);
        this.rank = rank;
        this.hours = hours;
    }

    public void setHours(String hours){
        this.hours = hours;
    }

    public String getHours(){
        return hours;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public String getRank(){
        return rank;
    }

    @Override
    public String toString(){
        return "Faculty " + getName();
    }
}
