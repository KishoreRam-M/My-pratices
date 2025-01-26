package Spring.A.Model;



import Spring.A.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserPrinciple implements UserDetails {
    @Autowired
    UserModel model;

    public  UserPrinciple (UserModel model)
    {
        this . model = model;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(  new SimpleGrantedAuthority("USER") );
    }

    @Override
    public String getPassword() {
        return model.getPassword();
    }

    @Override
    public String getUsername() {
        return model.getName();
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
