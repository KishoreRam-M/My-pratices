package Spring.A.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "UserDetails")
public class UserModel {
    public UserModel() {
    }
    public UserModel(String name , Long id , String password) {
        this.Name=name;
        this.Vmno=id;
        this.Password=password;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getVmno() {
        return Vmno;
    }

    public void setVmno(Long vmno) {
        Vmno = vmno;
    }

    @Id
    @JsonProperty("Student Vmno")
    private  Long Vmno ;



    @JsonProperty("Student Name")
    private  String Name ;
    @JsonProperty("Student Password ")
    private String Password  ;
}
