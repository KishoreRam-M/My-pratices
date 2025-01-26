package Spring.A.Repo;

import Spring.A.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<UserModel,Long> {
    UserModel findNameBy(String name);
}
