package Spring.A.Controller;

import Spring.A.Model.UserModel;
import Spring.A.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/users")
    public List <UserModel> toGetUser()
    {
        return   service.toGetUser();
    }
}
