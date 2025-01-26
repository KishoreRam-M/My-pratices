package Spring.A.Service;

import Spring.A.Model.UserModel;
import Spring.A.Model.UserPrinciple;
import Spring.A.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService  implements UserDetailsService {
    @Autowired
    StudentRepo repo;
    public List<UserModel> toGetUser ()
    {
        return  repo.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user =  repo.findNameBy(username);
        if (user==null)
        {
            System.out.println("User Does Not Exists");
            throw new UsernameNotFoundException("User Name Not Found");

        }
        return new UserPrinciple(user);



    }
}
