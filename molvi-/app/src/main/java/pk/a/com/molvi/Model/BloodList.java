package pk.a.com.molvi.Model;



/**
 * Created by Mian Mohsin on 8/30/2016.
 */
public class BloodList {
    private  int id;
    private  String Name;
    private String PhoneNumber;
    private String City;
    private String BloodGroupName;

    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id =id ;
    }
    public String getname() {
        return Name;
    }
    public void setname(String name) {
        this.Name = name;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        this.City = city;
    }

    public String getBloodGroupName() {
        return BloodGroupName;
    }
    public void setBloodGroupName(String bloodGroupName) {
        this.BloodGroupName = bloodGroupName;
    }


}
